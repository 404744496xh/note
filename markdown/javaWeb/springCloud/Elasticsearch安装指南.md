# Elasticsearch安装指南
## 1.部署单点es
### 1.1.创建网络
因为我们还需要部署kibana容器，因此需要让es和kibana容器互联。这里先创建一个网络：

```shell
docker network create es-net
```

### 1.2.加载镜像
这里我们采用elasticsearch的8.11.3版本的镜像。建议通过docker pull方式拉取：

```shell
docker pull elasticsearch:8.11.3
docker pull kibana:8.11.3
```

### 1.3.运行
运行docker命令，部署单点es：

```shell
docker run -d \
    --name es \
    -e "ES_JAVA_OPTS=-Xms512m -Xmx512m" \
    -e "discovery.type=single-node" \
    -e "xpack.security.enabled=false" \
    -v es-data:/usr/share/elasticsearch/data \
    -v es-plugins:/usr/share/elasticsearch/plugins \
    --privileged \
    --network es-net \
    -p 9200:9200 \
    -p 9300:9300 \
elasticsearch:8.11.3
```

命令解释：

+ `-e "ES_JAVA_OPTS=-Xms512m -Xmx512m"`：内存大小
+ `-e "discovery.type=single-node"`：非集群模式
+ `-e "xpack.security.enabled=false"`：关闭安全配置（仅用于测试环境）
+ `-v es-data:/usr/share/elasticsearch/data`：挂载逻辑卷，绑定es的数据目录
+ `-v es-plugins:/usr/share/elasticsearch/plugins`：挂载逻辑卷，绑定es的插件目录
+ `--privileged`：授予逻辑卷访问权
+ `--network es-net`：加入一个名为es-net的网络中
+ `-p 9200:9200`：端口映射配置

在浏览器中输入 `http://192.168.150.101:9200` 即可看到elasticsearch的响应结果。

注意：在生产环境中，建议开启安全配置（移除 xpack.security.enabled=false），并设置适当的用户名和密码。

## 2.部署kibana
### 2.1.部署
运行docker命令，部署kibana：

```shell
docker run -d \
    --name kibana \
    -e ELASTICSEARCH_HOSTS=http://es:9200 \
    --network=es-net \
    -p 5601:5601  \
    kibana:8.11.3
```

+ `--network es-net`：加入一个名为es-net的网络中，与elasticsearch在同一个网络中
+ `-e ELASTICSEARCH_HOSTS=http://es:9200`：设置elasticsearch的地址
+ `-p 5601:5601`：端口映射配置

kibana启动一般比较慢，需要多等待一会，可以通过命令：

```shell
docker logs -f kibana
```

查看运行日志，当看到启动完成的日志时，即可在浏览器访问 `http://192.168.35.131:5601`

### 2.2.DevTools
kibana中提供了一个DevTools界面，这个界面中可以编写DSL来操作elasticsearch。并且对DSL语句有自动补全功能。

## 3.安装IK分词器
### 3.1.在线安装ik插件（较慢）
```shell
# 进入容器内部
docker exec -it es /bin/bash

# 在线下载并安装
./bin/elasticsearch-plugin install https://github.com/medcl/elasticsearch-analysis-ik/releases/download/v8.11.3/elasticsearch-analysis-ik-8.11.3.zip

#退出
exit
#重启容器
docker restart elasticsearch
```

### 3.2.离线安装ik插件（推荐）
请确保下载的IK分词器版本与Elasticsearch版本一致。

### 1）查看数据卷目录
安装插件需要知道elasticsearch的plugins目录位置，而我们用了数据卷挂载，因此需要查看elasticsearch的数据卷目录：

```shell
docker volume inspect es-plugins
```

显示结果：

```shell
[
    {
        "CreatedAt": "2022-05-06T10:06:34+08:00",
        "Driver": "local",
        "Labels": null,
        "Mountpoint": "/var/lib/docker/volumes/es-plugins/_data",
        "Name": "es-plugins",
        "Options": null,
        "Scope": "local"
    }
]
```

说明plugins目录被挂载到了 `/var/lib/docker/volumes/es-plugins/_data` 这个目录中。

### 2）解压缩分词器安装包
下载对应版本的ik分词器，解压缩并重命名为ik

### 3）上传到es容器的插件数据卷
将解压后的ik文件夹复制到 `/var/lib/docker/volumes/es-plugins/_data` 目录下

### 4）重启容器
```shell
# 重启es容器
docker restart es

# 查看es日志
docker logs -f es
```

### 5）测试
IK分词器包含两种模式：

+ `ik_smart`：最少切分
+ `ik_max_word`：最细切分

测试分词效果：

```shell
GET /_analyze
{
  "analyzer": "ik_max_word",
  "text": "黑马程序员学习java太棒了"
}
```

## 3.3 扩展词词典
随着互联网的发展，"造词运动"也越发的频繁。出现了很多新的词语，在原有的词汇列表中并不存在。比如："奥力给"，"传智播客" 等。

所以我们的词汇也需要不断的更新，IK分词器提供了扩展词汇的功能。

1）打开IK分词器config目录，修改IKAnalyzer.cfg.xml配置文件：

```shell
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE properties SYSTEM "http://java.sun.com/dtd/properties.dtd">
<properties>
        <comment>IK Analyzer 扩展配置</comment>

        <!--用户可以在这里配置自己的扩展字典 *** 添加扩展词典-->
        <entry key="ext_dict">ext.dic</entry>

</properties>

```

2）新建一个 ext.dic，添加词语：

```shell
传智播客
奥力给
```

3）重启elasticsearch 

```shell
docker restart es

# 查看日志
docker logs -f es
```

4）测试效果：

```shell
GET /_analyze
{
  "analyzer": "ik_max_word",
  "text": "传智播客Java就业超过90%,奥力给！"
}
```

注意：扩展词典文件必须以UTF-8格式编码。

## 3.4 停用词词典
有些词语如敏感词、语气词等，我们希望在搜索时忽略这些词。IK分词器提供了停用词功能。

1）修改IKAnalyzer.cfg.xml，添加停用词配置：

```shell
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE properties SYSTEM "http://java.sun.com/dtd/properties.dtd">
<properties>
        <comment>IK Analyzer 扩展配置</comment>

        <!--用户可以在这里配置自己的扩展字典-->
        <entry key="ext_dict">ext.dic</entry>

         <!--用户可以在这里配置自己的扩展停止词字典-->
        <entry key="ext_stopwords">stopword.dic</entry>

</properties>

```

2）在 stopword.dic 添加停用词：

```shell
的
了
啊
```

3）重启elasticsearch 

```shell
docker restart es
```

4）测试效果：

```shell
GET /_analyze
{
  "analyzer": "ik_max_word",
  "text": "这个手机真的很不错啊"
}
```

注意：停用词典文件也必须以UTF-8格式编码。

## 4.集群部署
如果需要部署Elasticsearch集群，建议使用Docker Compose来完成。以下是一个基本的docker-compose配置示例（需要至少4GB内存）：

```shell
version: '2.2'
services:
  es01:
    image: elasticsearch:8.11.3
    container_name: es01
    environment:
      - node.name=es01
      - cluster.name=es-docker-cluster
      - discovery.seed_hosts=es02,es03
      - cluster.initial_master_nodes=es01,es02,es03
      - bootstrap.memory_lock=true
      - "ES_JAVA_OPTS=-Xms512m -Xmx512m"
      - xpack.security.enabled=false
    ulimits:
      memlock:
        soft: -1
        hard: -1
    volumes:
      - data01:/usr/share/elasticsearch/data
    ports:
      - 9200:9200
    networks:
      - elastic
  es02:
    image: elasticsearch:8.11.3
    container_name: es02
    environment:
      - node.name=es02
      - cluster.name=es-docker-cluster
      - discovery.seed_hosts=es01,es03
      - cluster.initial_master_nodes=es01,es02,es03
      - bootstrap.memory_lock=true
      - "ES_JAVA_OPTS=-Xms512m -Xmx512m"
      - xpack.security.enabled=false
    ulimits:
      memlock:
        soft: -1
        hard: -1
    volumes:
      - data02:/usr/share/elasticsearch/data
    networks:
      - elastic
  es03:
    image: elasticsearch:8.11.3
    container_name: es03
    environment:
      - node.name=es03
      - cluster.name=es-docker-cluster
      - discovery.seed_hosts=es01,es02
      - cluster.initial_master_nodes=es01,es02,es03
      - bootstrap.memory_lock=true
      - "ES_JAVA_OPTS=-Xms512m -Xmx512m"
      - xpack.security.enabled=false
    ulimits:
      memlock:
        soft: -1
        hard: -1
    volumes:
      - data03:/usr/share/elasticsearch/data
    networks:
      - elastic

volumes:
  data01:
    driver: local
  data02:
    driver: local
  data03:
    driver: local

networks:
  elastic:
    driver: bridge
```

启动集群：

```shell
docker-compose up -d
```

