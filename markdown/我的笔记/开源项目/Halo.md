## **<font style="color:rgb(77, 77, 77);">Halo</font>**
**<font style="color:rgb(77, 77, 77);">Halo </font>**<font style="color:rgb(77, 77, 77);">是一款基于Java开发的现代化开源博客系统，采用GPL-v3.0协议。这个颜值与实力并存的系统不仅支持文章管理，还能当CMS内容管理系统使用，最绝的是支持多主题秒切换！</font>![](https://cdn.nlark.com/yuque/0/2025/png/46412986/1755325644195-94663091-f7b8-403c-a146-cea97cd1efe2.png)

**链接：**

GitHub：[https://github.com/halo-dev/halo](https://github.com/halo-dev/halo)

官网：[https://www.halo.run/](https://www.halo.run/)

### 使用docker安装
#### 安装（数据库如果没有）
1.拉取镜像

> <font style="color:rgb(0, 0, 0);">docker pull mysql:8.0.30</font>
>

<font style="color:rgb(0, 0, 0);">2.</font>然后创建并启动 MySQL 容器，同时设置 root 密码并进行数据挂载，命令如下：

```shell
mkdir -p /app/docker/mysql/data 
mkdir -p /app/docker/mysql/conf 
mkdir -p /app/docker/mysql/log 

docker run -p 3306:3306 --name mysql \
-v /app/docker/mysql/log:/var/log/mysql \
-v /app/docker/mysql/data:/var/lib/mysql \
-v /app/docker/mysql/conf:/etc/mysql/conf.d \
-e MYSQL_ROOT_PASSWORD=1234 \
-d mysql:8.0.30
```



### **创建 Halo 所需数据库**
    - 进入 MySQL 容器：

```bash
docker exec -it mysql bash
```

    - 登录 MySQL：

```bash
mysql -uroot -p1234
```

    - 创建名为`halo`的数据库，字符集设置为`utf8mb4`：

```sql
CREATE DATABASE IF NOT EXISTS halo
DEFAULT CHARACTER SET utf8mb4
DEFAULT COLLATE utf8mb4_general_ci;
```

### **获取 MySQL 容器 IP 地址**：
    - 由于 Docker 容器之间默认不能通过`127.0.0.1`访问，需要获取 MySQL 容器的 IP 地址。先查看 MySQL 容器名称：
1. **bash**

```bash
docker ps -a
```

    - 然后查看容器详细信息以获取 IP 地址：

**bash**

```bash
docker inspect mysql
```

    - 在输出结果中找到`IPAddress`字段，其对应的值即为 MySQL 容器的 IP 地址。

![](https://cdn.nlark.com/yuque/0/2025/png/46412986/1755327113468-24e55fc1-0052-4ad1-8840-416fff95e8a8.png)

### **3.拉取并启动 Halo 容器**：
    - 拉取 Halo 镜像，以拉取 2.21 版本为例：

```bash
docker pull registry.fit2cloud.com/halo/halo:2.21
```

    - 启动 Halo 容器，并指定连接到刚才创建的 MySQL 数据库，命令如下：

```bash
docker run -d \
--name halo \
-p 8090:8090 \
-v ~/halo2:/root/.halo2 \
--restart on-failure:3 \
registry.fit2cloud.com/halo/halo:2.21 \
--spring.r2dbc.url=r2dbc:pool:mysql://172.17.0.2:3306/halo \
--spring.r2dbc.username=root \
--spring.r2dbc.password=1234 \
--spring.sql.init.platform=mysql \
--halo.external-url=http://localhost:8090/
```

    - 请将`172.17.0.2`替换为实际获取到的 IP 地址，`1234`替换为设置的 MySQL root 密码。

完成上述步骤后，就可以通过浏览器访问`http://localhost:8090/console`来初始化和使用 Halo，其数据将存储在你指定的 MySQL 数据库中。

![](https://cdn.nlark.com/yuque/0/2025/png/46412986/1755327401233-f5096823-753b-43bf-ad49-e18dfad511ab.png)

xiahan:1234

