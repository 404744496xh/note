按我理解 简言之
```
docker 镜像： ----java中 class

docker容器 ： ----java中 class new 出来的实例对象
```
本篇文章不仅仅是生硬的命令大全，也是我个人对docker学习使用的一步步总结，通过一个个示例来加深各位看官对docker相关命令的理解以及记忆，在有趣的同时穿插知识点，您花费半小时时间，照着我的思路走一遍，一定会有所收获。
<a name="8f82ed8a"></a>
## （一）docker 基础命令
**启动docker**
```
systemctl start docker
```
**关闭docker**
```
systemctl stop docker
```
**重启docker**
```
systemctl restart docker
```
**docker设置随服务启动而自启动**
```
systemctl enable docker
```
**查看docker 运行状态**<br />------如果是在运行中 输入命令后 会看到绿色的active
```
systemctl status docker
```
**查看docker 版本号信息**
```
docker version
```
```
docker info
```
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1721873008553-591eda9d-843d-47e2-8b72-096ad2fbe60c.png#averageHue=%23070403&clientId=udc7eeb0b-1a83-4&from=paste&id=u5499f04b&originHeight=618&originWidth=646&originalType=url&ratio=1.25&rotation=0&showTitle=false&status=done&style=none&taskId=u0af78298-6bf8-4b6d-94db-f131980f686&title=)<br />**docker 帮助命令**<br />忘记了某些命令便可使用此进行查看与回顾
```
docker --help
```
比如 咱忘记了 拉取命令 不知道可以带哪些参数 咱可以这样使用
```
docker pull --help
```
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1721873008774-c2e898cc-802c-4ba1-b18b-74ac191fae7d.png#averageHue=%23080605&clientId=udc7eeb0b-1a83-4&from=paste&id=u13e452e7&originHeight=222&originWidth=657&originalType=url&ratio=1.25&rotation=0&showTitle=false&status=done&style=none&taskId=ua64b6f1f-8bce-4ddb-a4ba-cb43b4b2070&title=)
<a name="e9e93be4"></a>
## （二）docker 镜像命令
**查看自己服务器中docker 镜像列表**
```
docker images
```
**搜索镜像**
```
docker search 镜像名
docker search --filter=STARS=9000 mysql 搜索 STARS >9000的 mysql 镜像
```
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1721873008717-ccc2fa30-5f0e-486a-a1f1-16cbc4436fee.png#averageHue=%23080604&clientId=udc7eeb0b-1a83-4&from=paste&id=u71a3abc5&originHeight=75&originWidth=856&originalType=url&ratio=1.25&rotation=0&showTitle=false&status=done&style=none&taskId=ue4b8a4e3-8361-4201-b89e-8b085e6a459&title=)<br />**拉取镜像** 不加tag(版本号) 即拉取docker仓库中 该镜像的最新版本latest 加:tag 则是拉取指定版本
```
docker pull 镜像名 
docker pull 镜像名:tag
```
拉取最新版 mysql<br />![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1721873008970-23e1fa9a-2162-4621-9a71-f26cb50707c8.png#averageHue=%23070403&clientId=udc7eeb0b-1a83-4&from=paste&id=u20f6480b&originHeight=417&originWidth=794&originalType=url&ratio=1.25&rotation=0&showTitle=false&status=done&style=none&taskId=u4bff9c9d-56b2-467d-8b8d-dfb404e7647&title=)<br />咱再来拉取一个指定版本号 镜像 至于版本号呢 可以在docker hub中查看<br />[docker官方镜像搜索](https://hub.docker.com/search?type=image)<br />![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1721873009093-901296e8-6d10-45e4-b1d4-db0bec6e8abf.png#averageHue=%23dfeae9&clientId=udc7eeb0b-1a83-4&from=paste&id=u9337b01a&originHeight=562&originWidth=1278&originalType=url&ratio=1.25&rotation=0&showTitle=false&status=done&style=none&taskId=ubcb5e037-4a5b-4cfe-9229-3bbfafa4015&title=)<br />例如 拉取 mysql 5.7.30 ------------------这里出现了一些小东西 感觉挺新奇的 随着学习深入再回过头来看吧<br />![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1721873009093-0a127517-e731-4753-9d31-a4bcc2373f3b.png#averageHue=%230e0704&clientId=udc7eeb0b-1a83-4&from=paste&id=u3af9eb5f&originHeight=342&originWidth=759&originalType=url&ratio=1.25&rotation=0&showTitle=false&status=done&style=none&taskId=uadce1570-4d62-4030-8f24-de519b78457&title=)<br />为什么提示文件存在 >>>> 请戳：[docker 文件分层与数据卷挂载](https://blog.csdn.net/leilei1366615/article/details/106269231)<br />**运行镜像** ----咱拉取一个tomcat 跑起来试一试
```
docker run 镜像名
docker run 镜像名:Tag
```
**ex：**
```
docker pull tomcat

docker run tomcat
```
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1721873009324-ba44e3ce-09b0-488d-b6c6-4da5362e1751.png#averageHue=%23150f0b&clientId=udc7eeb0b-1a83-4&from=paste&id=u73c0d322&originHeight=543&originWidth=1353&originalType=url&ratio=1.25&rotation=0&showTitle=false&status=done&style=none&taskId=ufc25d44b-d340-405b-8746-a592f3ead18&title=)<br />发现咱运行后 出现tomcat 默认占用的8080 端口 说明该镜像已经是启动了 ，但是 咱好像鼠标没有回到咱服务器上了 ，这怎么办呢 ？<br />使用` Ctrl+C` （注：此方式虽然可以退出容器，但此种命令操作方式却是错误的，详细缘由请见下文的容器命令）<br />**docker中 run 命令是十分复杂的 有什么持久运行 映射端口 设置容器别名 数据卷挂载等**

---

一通测试，发现我们拉了好多镜像了，但我们现在根本用不着，这些无用镜像怎么删除呢？<br />**删除镜像** ------当前镜像没有被任何容器使用才可以删除
```
#删除一个
docker rmi -f 镜像名/镜像ID

#删除多个 其镜像ID或镜像用用空格隔开即可 
docker rmi -f 镜像名/镜像ID 镜像名/镜像ID 镜像名/镜像ID

#删除全部镜像  -a 意思为显示全部, -q 意思为只显示ID
docker rmi -f $(docker images -aq)
```
**强制删除镜像**
```
docker image rm 镜像名称/镜像ID
```
镜像的基础命令就到这里 下方会使用更复杂的 docker run 命令 来根据镜像启动容器<br />**保存镜像**<br />将我们的镜像 保存为tar 压缩文件 这样方便镜像转移和保存 ,然后 可以在任何一台安装了docker的服务器上 加载这个镜像<br />命令:
```
docker save 镜像名/镜像ID -o 镜像保存在哪个位置与名字
```
exmaple:
```
docker save tomcat -o /myimg.tar
```
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1721873009309-2ba04200-6ec6-4df8-ab6b-3fd49fb682ee.png#averageHue=%230b0805&clientId=udc7eeb0b-1a83-4&from=paste&id=ue6f4a2a7&originHeight=46&originWidth=551&originalType=url&ratio=1.25&rotation=0&showTitle=false&status=done&style=none&taskId=u81b4fa74-73e5-4c31-8648-2d6f4dadb83&title=)<br />**保存镜像任务执行完毕，我们来看下指定位置下是否有该tar？**<br />![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1721873009858-40a0c3cc-c125-4202-a419-47d9dd22047b.png#averageHue=%230c0806&clientId=udc7eeb0b-1a83-4&from=paste&id=u302dceaa&originHeight=426&originWidth=712&originalType=url&ratio=1.25&rotation=0&showTitle=false&status=done&style=none&taskId=u354ee345-ecf5-418d-997f-1433b9a2e41&title=)<br />**加载镜像**<br />任何装 docker 的地方加载镜像保存文件,使其恢复为一个镜像
```
docker load -i 镜像保存文件位置
```
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1721873009869-36ef80df-6fe0-4fc0-905f-d8ddc14c8efc.png#averageHue=%23060403&clientId=udc7eeb0b-1a83-4&from=paste&id=ude600ec1&originHeight=570&originWidth=1317&originalType=url&ratio=1.25&rotation=0&showTitle=false&status=done&style=none&taskId=u49bd1e05-9e69-4d73-84b6-ff3ecb257ac&title=)<br />**加载文件 恢复为镜像**<br />![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1721873009871-a34d5380-2d75-4be9-ae4b-444ac511e083.png#averageHue=%23050302&clientId=udc7eeb0b-1a83-4&from=paste&id=u87369407&originHeight=108&originWidth=546&originalType=url&ratio=1.25&rotation=0&showTitle=false&status=done&style=none&taskId=ub2d52db7-82e2-4764-80a3-b2d59a1dfc5&title=)<br />**查看镜像 测试镜像功能是否正常**<br />我们来把解压的镜像 run一下。<br />![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1721873009953-cfafc01d-3062-4c95-aed7-85f5eb364d48.png#averageHue=%23100c09&clientId=udc7eeb0b-1a83-4&from=paste&id=u4bd28de3&originHeight=729&originWidth=1541&originalType=url&ratio=1.25&rotation=0&showTitle=false&status=done&style=none&taskId=udcc51acb-3454-4f0e-9e15-53fe5434ab1&title=)<br />**镜像标签**<br />有的时候呢，我们需要对一个镜像进行分类或者版本迭代操作，比如我们一个微服务已经打为docker镜像，但是想根据环境进行区分为develop环境与alpha环境，这个时候呢，我们就可以使用Tag，来进对镜像做一个标签添加，从而行进区分；版本迭代逻辑也是一样，根据不同的tag进行区分
```
app:1.0.0 基础镜像
# 分离为开发环境
app:develop-1.0.0   
# 分离为alpha环境
app:alpha-1.0.0   
```
```
docker tag SOURCE_IMAGE[:TAG] TARGET_IMAGE[:TAG]

docker tag 源镜像名:TAG 想要生成新的镜像名:新的TAG

# 如果省略TAG 则会为镜像默认打上latest TAG
docker tag aaa bbb
# 上方操作等于 docker tag aaa:latest bbb:test
```
ex：
```
# 我们根据镜像 quay.io/minio/minio 添加一个新的镜像 名为 aaa 标签Tag设置为1.2.3
docker tag quay.io/minio/minio:1.2.3 aaa:1.2.3

# 我们根据镜像 app-user:1.0.0 添加一个新的镜像 名为 app-user 标签Tag设置为alpha-1.0.0
docker tag app-user:1.0.0 app-user:alpha-1.0.0
```
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1721873009947-b7f302d9-72e6-46b2-8d77-fdc26a58da9e.png#averageHue=%23070504&clientId=udc7eeb0b-1a83-4&from=paste&id=u29867eab&originHeight=238&originWidth=1202&originalType=url&ratio=1.25&rotation=0&showTitle=false&status=done&style=none&taskId=ub7b8664b-25c7-47ca-a3fe-9e1bb00d520&title=)
<a name="321c2229"></a>
## （三）docker 容器命令
前言已经说了 docker 容器 就好比 咱java中的new出来对象（docker run 镜像 产生一个该镜像具体容器实例）,docker 容器的启动需要 镜像的支持<br />先放上 docker 容器查看命令<br />**查看正在运行容器列表**
```
docker ps
```
**查看所有容器** -----包含正在运行 和已停止的
```
docker ps -a
```
**容器怎么来呢 可以通过run 镜像 来构建 自己的容器实例**<br />**运行一个容器**
```
# -it 表示 与容器进行交互式启动 -d 表示可后台运行容器 （守护式运行）  --name 给要运行的容器 起的名字  /bin/bash  交互路径
docker run -it -d --name 要取的别名 镜像名:Tag /bin/bash 
```
例如我们要启动一个redis 把它的别名取为redis001 并交互式运行 需要的命令 —我这里指定版本号为5.0.5
```
#1. 拉取redis 镜像
docker pull redis:5.0.5
#2.命令启动
docker run -it -d --name redis001 redis:5.0.5 /bin/bash
```
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1721873010365-a1d5ee75-04f1-4bc4-9f66-07f03fd788de.png#averageHue=%231a130d&clientId=udc7eeb0b-1a83-4&from=paste&id=ub68f6203&originHeight=34&originWidth=553&originalType=url&ratio=1.25&rotation=0&showTitle=false&status=done&style=none&taskId=ud70beb93-e467-4c0a-9a8b-2af1e18428e&title=)
```
#3.查看已运行容器
docker ps
```
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1721873010464-0b330c5a-34f0-4b0a-9569-93303b85cd75.png#averageHue=%230a0705&clientId=udc7eeb0b-1a83-4&from=paste&id=u0fb439fa&originHeight=55&originWidth=963&originalType=url&ratio=1.25&rotation=0&showTitle=false&status=done&style=none&taskId=u32e44912-9e4c-4937-8583-4377d91523d&title=)<br />发现看到了 redis 使用了6379 端口 那么我们在关闭防火墙或开启了安全组的情况下 是否可以进行访问呢？<br />为了 区分 咱们使用linux 命令 查看一下
```
# netstat是控制台命令,是一个监控TCP/IP网络的非常有用的工具，它可以显示路由表、实际的网络连接以及每一个网络接口设备的状态信息
netstat -untlp
```
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1721873010475-475cdef1-78b9-4bc9-888f-5ffa84f79915.png#averageHue=%230a0705&clientId=udc7eeb0b-1a83-4&from=paste&id=uedad2b6c&originHeight=136&originWidth=729&originalType=url&ratio=1.25&rotation=0&showTitle=false&status=done&style=none&taskId=u21c956a6-11e2-4921-9315-eb530c96b2e&title=)<br />**惊讶的发现，我们redis容器启动占用的 6379端口netstat 没有显示出来？什么情况？赶紧使用 redis desktop manger 连接测试一下**<br />![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1721873010436-8dd1428b-721d-4723-8dcb-fc4453a09a06.png#averageHue=%23f2f2f1&clientId=udc7eeb0b-1a83-4&from=paste&id=u796b2dc1&originHeight=448&originWidth=400&originalType=url&ratio=1.25&rotation=0&showTitle=false&status=done&style=none&taskId=u90301b2a-d5f1-43c0-8a59-f8ed11f4dd4&title=)<br />**为什么不行呢 已经确定了 docker 中 redis 容器已经是在运行中 且占有端口 6379啊？**<br />**因为：占用的6379端口 仅仅是在容器中内部本身的端口,与宿主机的6379端口并无联系，我们通过宿主机Ip:6379访问此redis示例，那自然是找不到的哟！**

---

**这里，来补充一点Docker容器的知识！**<br />**每一个 Docker容器都是独立和安全的应用平台（我们可以理解为，每一个docker容器都相当于在我们的服务器上占用资源然后开辟了属于自己的一个空间（也可以理解为服务器））**<br />![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1721873010701-de67ed89-f278-4b6c-9397-5bbe0fd6a7a9.png#averageHue=%23f4f4f4&clientId=udc7eeb0b-1a83-4&from=paste&id=u69054f23&originHeight=398&originWidth=1282&originalType=url&ratio=1.25&rotation=0&showTitle=false&status=done&style=none&taskId=uf6b4d3b3-cb15-4e1f-9c60-4fa9d946e8d&title=)<br />**这是Docker 一大特点，每个容器之间环境都是隔离的!!!**<br />我们甚至可以在一个服务器上，使用docker镜像，来跑出N个 mysql实例（尽管，他们的默认端口都是一样的，但还是那句话，容器间，环境是隔离的。A容器中的3306 与B容器的3306毫无关系，因为其不在一个世界呀!）<br />**默认情况下，我们是无法通过宿主机（安装docker的服务器）端口来直接访问容器的 ,因为docker容器自己开辟空间的端口与宿主机端口没有联系…**<br />如果外部想要访问容器，那必须得让容器中的端口与宿主机的端口建立联系绑定起来，这个正式的概念叫做` 容器端口映射`<br />有了端口映射，我们就可以将宿主机端口与 容器端口绑定起来，比如 我们建立宿主机的6379端口与容器redis6379端口绑定起来，那么再访问宿主机Ip:6379 就可以访问到对应容器了！<br />接下来 进行 **容器端口映射**演示<br />首先**停止容器**
```
# 先停止咱之前运行的 redis 容器 
docker stop 容器名/容器ID
```
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1721873011056-554bdd12-7041-42d9-80fe-728373a1bd58.png#averageHue=%23050302&clientId=udc7eeb0b-1a83-4&from=paste&id=u7849f208&originHeight=103&originWidth=933&originalType=url&ratio=1.25&rotation=0&showTitle=false&status=done&style=none&taskId=ua51244e8-3a9f-4093-a77d-071708b6a4e&title=)<br />然后**删除容器** -----不经意间 咱发现已经运行过这么多容器了 咱进行清理一下<br />![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1721873010938-47fe7b67-87f9-4a83-8dac-7ac0dd86f92f.png#averageHue=%230a0705&clientId=udc7eeb0b-1a83-4&from=paste&id=u88c0b9c9&originHeight=162&originWidth=1136&originalType=url&ratio=1.25&rotation=0&showTitle=false&status=done&style=none&taskId=uc3ad376d-1281-4444-9b6a-cb6a7f82ac3&title=)
```
#删除一个容器
docker rm -f 容器名/容器ID
#删除多个容器 空格隔开要删除的容器名或容器ID
docker rm -f 容器名/容器ID 容器名/容器ID 容器名/容器ID
#删除全部容器
docker rm -f $(docker ps -aq)
```
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1721873011064-7904af0d-8499-41aa-a83c-a89682dce4c1.png#averageHue=%23050302&clientId=udc7eeb0b-1a83-4&from=paste&id=u1d94e110&originHeight=116&originWidth=895&originalType=url&ratio=1.25&rotation=0&showTitle=false&status=done&style=none&taskId=u772f5e03-4f60-4a2b-9468-00b32456765&title=)<br />这样 容器就已经删除完毕了 ，咱们接着弄 前边说的 端口映射<br />**容器端口与服务器端口映射**<br />命令：
```
-p 宿主机端口:容器端口
```
还是使用前方的 redis 镜像 尝试 将6379端口 映射到服务器的8888 如果成功了的话 那么咱们访问服务器的8888端口就会访问到咱们的 docker 中 的容器 redis002<br />-p 8888:6379 解析 将容器内部的 6379端口与docker 宿主机（docker装在哪台服务器 哪台服务器就是宿主机）8888 端口进行映射 那通过外部访问宿主机8888端口 即可访问到 docker 容器 6379 端口了
```
docker run -itd --name redis002 -p 8888:6379 redis:5.0.5 /bin/bash
```
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1721873010958-4059b337-6d11-4b01-b4dc-aff6bbf2c6c3.png#averageHue=%23120a08&clientId=udc7eeb0b-1a83-4&from=paste&id=u7997ac3d&originHeight=280&originWidth=930&originalType=url&ratio=1.25&rotation=0&showTitle=false&status=done&style=none&taskId=ueaf927d8-ecd4-4215-9d44-dfa05900308&title=)<br />在运行后 发现服务器的 8888 端口显示已被docker-proxy 所占用了 那么此时咱再用工具进行连接测试呢？<br />![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1721873011248-506e40bb-c383-40f5-a3f3-a3624e30671e.png#averageHue=%23f2f2f2&clientId=udc7eeb0b-1a83-4&from=paste&id=ude075847&originHeight=440&originWidth=565&originalType=url&ratio=1.25&rotation=0&showTitle=false&status=done&style=none&taskId=ua40e1dc5-10df-4b91-ac22-f053d99ac1b&title=)<br />**那么容器端口映射有没有什么限制呢？**<br />有的，虽说每个容器之间，环境都是隔离的，但是宿主机每个端口都是一个，8888端口被redis002容器绑定了，那么其他所有的容器都不可以使用8888这个端口了!!!

---

有时候，我们需要进入容器内部，修改其配置文件，那么如何才能进入容器内呢？<br />**进入容器方式一** 这里咱就进入 前面的 redis001容器
```
docker exec -it 容器名/容器ID /bin/bash

#进入 前面的 redis001容器   
docker exec -it redis001 /bin/bash
```
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1721873011473-f5d224a7-f323-43b3-bdb6-20c3fec25249.png#averageHue=%230b0604&clientId=udc7eeb0b-1a83-4&from=paste&id=u81bce602&originHeight=60&originWidth=466&originalType=url&ratio=1.25&rotation=0&showTitle=false&status=done&style=none&taskId=u1021e472-1bfa-4727-89aa-10eebc07ac8&title=)<br />可以看到 我已经从主机alibyleilei 跳到了容器ID 对应下的 /data 已经是进入到容器内部了<br />**进入容器方式二** —推荐使用 exec 方式
```
docker attach 容器名/容器ID
```
那怎么退出容器呢 ？<br />**从容器内 退出到自己服务器中** 需注意 两个退出命令的区别
```
#-----直接退出  未添加 -d(持久化运行容器) 时 执行此参数 容器会被关闭  
exit
```
```
# 优雅退出 --- 无论是否添加-d 参数 执行此命令容器都不会被关闭
Ctrl + p + q
```
**停止容器**
```
docker stop 容器ID/容器名
```
**重启容器**
```
docker restart 容器ID/容器名
```
**启动容器**
```
docker start 容器ID/容器名
```
**kill 容器**
```
docker kill 容器ID/容器名
```
**容器文件拷贝** —无论容器是否开启 都可以进行拷贝
```
#docker cp 容器ID/名称:文件路径  要拷贝到外部的路径   |     要拷贝到外部的路径  容器ID/名称:文件路径
#从容器内 拷出
docker cp 容器ID/名称: 容器内路径  容器外路径
#从外部 拷贝文件到容器内
docker  cp 容器外路径 容器ID/名称: 容器内路径
```
**查看容器日志**
```
docker logs -f --tail=要查看末尾多少行 默认all 容器ID
```
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1721873011543-6b07ebfd-8088-4c64-85b6-54bf0d074f84.png#averageHue=%230c0705&clientId=udc7eeb0b-1a83-4&from=paste&id=u0de66631&originHeight=515&originWidth=1263&originalType=url&ratio=1.25&rotation=0&showTitle=false&status=done&style=none&taskId=u53c015bf-dd69-49b0-a897-6e1305181d6&title=)<br />我们在运维的时候，通常给一些软件喜欢设置开机自启动，例如 mysql、redis,这样测试环境服务器重启时可节省不少运维时间成本，那么我们如果是docker容器 是否也可以设置开机自启动容器呢？<br />答案是 OKKKKK!<br />启动容器时，使用docker run命令时 添加参数`--restart=always` 便表示，该容器随docker服务启动而自动启动<br />ex:
```
docker run -itd --name redis002 -p 8888:6379 --restart=always  redis:5.0.5 /bin/bash
```
**这个时候有小伙伴着急了，我都已经启动一个容器好久了，跑了很多数据了，现在才告诉我可以设置自启动？我把容器删了再启动，我数据咋办？？？**<br />**哎！小伙汁，这个时候不要慌，我告诉你两个办法！**<br />**方法一：担心数据丢了，这说明你在跑容器的时候没有进行数据挂载吧？？？**<br />**你问我，什么是数据挂载？**<br />简单来讲，就是将容器内的数据与外部宿主机文件绑定起来，类似一个双持久化，当容器删除时，宿主机文件数据目录仍在，下次启动容器只要将数据目录指向宿主机数据所在位置即可恢复！<br />具体请参考：[docker 文件分层与数据卷挂载](https://blog.csdn.net/leilei1366615/article/details/106269231)<br />命令:
```
-v 宿主机文件存储位置:容器内文件位置
```
如此操作，就将 容器内指定文件挂载到了宿主机对应位置，-v命令可以多次使用，即一个容器可以同时挂载多个文件
```
-v 宿主机文件存储位置:容器内文件位置 -v 宿主机文件存储位置:容器内文件位置 -v 宿主机文件存储位置:容器内文件位置
```
示例：
```
# 运行一个docker redis 容器 进行 端口映射 两个数据卷挂载 设置开机自启动
docker run -d -p 6379:6379 --name redis505 --restart=always  -v /var/lib/redis/data/:/data -v /var/lib/redis/conf/:/usr/local/etc/redis/redis.conf  redis:5.0.5 --requirepass "password"
```
**此方法完了你很无语？那还不是得删容器？是呀！没错！那么为什么你有数据恢复需求而没有想到数据持久化，数据恢复备份，数据卷挂载？自己DEMO的吃亏，是为了平时开发少扣脑壳多摸鱼！**<br />**方法二：不想删容器，又想让这个容器设置开机自启动，那么我们修改其启动配置即可！**<br />命令:
```
docker  update --restart=always 容器Id 或者 容器名

或

docker container update --restart=always 容器Id 或者 容器名
```
如上，虽然不删容器就设置了自启动需求满足了，但是，危不危险，这个容器有没有需要数据恢复的情况？自己考量吧！！！<br />**更换容器名**<br />想给容器换个霸气炫酷吊炸天的名字？
```
docker rename 容器ID/容器名 新容器名
```
**ex:**<br />![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1721873011524-6f8924ab-09a5-42d7-9e26-96a92520e4f0.png#averageHue=%230b0806&clientId=udc7eeb0b-1a83-4&from=paste&id=u64a729d4&originHeight=211&originWidth=1248&originalType=url&ratio=1.25&rotation=0&showTitle=false&status=done&style=none&taskId=u861df053-2877-4696-b85c-74e12da8738&title=)
<a name="cc5cbfdd"></a>
## （四）自己提交一个镜像
我们运行的容器可能在镜像的基础上做了一些修改，有时候我们希望保存起来，封装成一个更新的镜像，这时候我们就需要使用 commit 命令来构建一个新的镜像
```
docker commit -m="提交信息" -a="作者信息" 容器名/容器ID 提交后的镜像名:Tag
```
我们拉取一个tomcat镜像 并持久化运行 且设置与宿主机进行端口映射
```
docker pull tomcat

docker run -itd -p8080:8080 --name tom tomcat /bin/bash
```
访问 咱的端口 发现访问404 这是因为咱配置了阿里云镜像后 所拉取得镜像都是最基础班的 仅仅包含其容器必要数据 例如 容器中 vim vi ll 命令都没有<br />![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1721873011652-6ad90156-ea0b-45e5-b875-51136120f8ba.png#averageHue=%23e8c793&clientId=udc7eeb0b-1a83-4&from=paste&id=u5e449a09&originHeight=352&originWidth=865&originalType=url&ratio=1.25&rotation=0&showTitle=false&status=done&style=none&taskId=u46c28e00-3c5d-43ee-9eff-1d3c981b28a&title=)![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1721873012390-d3392ce6-f709-4b28-99e3-c022c0ab6edc.png#averageHue=%230a0705&clientId=udc7eeb0b-1a83-4&from=paste&id=ub3f8e2d6&originHeight=91&originWidth=1177&originalType=url&ratio=1.25&rotation=0&showTitle=false&status=done&style=none&taskId=u132b5068-17d5-4535-83b4-673ff3102b0&title=)<br />咱们的webapps 下一个文件都没有 ，访问肯定404罗<br />不断查看 发现咱 webapps.dist 下是有文件的 我们把它拷贝的webapps 下 然后打包成一个新的镜像 后 访问查看是否进入到首页 不进入404页面<br />![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1721873012725-05d88ede-4b89-4095-b1c6-e9464b4943d1.png#averageHue=%230c0705&clientId=udc7eeb0b-1a83-4&from=paste&id=u6d566e96&originHeight=154&originWidth=1185&originalType=url&ratio=1.25&rotation=0&showTitle=false&status=done&style=none&taskId=u2cafd41d-085c-4d42-88dd-cd632135f46&title=)<br />exit 退出容器<br />使用 提交命令 将在运行的tomcat 容器 打包为一个全新的镜像 名字为tom Tag为1.0
```
docker commit -a="leilei" -m="第一次打包镜像，打包后直接访问还会404吗" 231f2eae6896 tom:1.0
```
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1721873012582-badeda22-8c52-4cf8-8f17-206280c9b62d.png#averageHue=%230c0604&clientId=udc7eeb0b-1a83-4&from=paste&id=ude2c6980&originHeight=264&originWidth=1390&originalType=url&ratio=1.25&rotation=0&showTitle=false&status=done&style=none&taskId=uea2a36e6-fbee-4216-b021-f381c25cd43&title=)<br />为了区分 咱停止并删除之前tomcat 的容器<br />![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1721873012576-f4d68837-5eb1-4c95-b6c1-f7768eb28250.png#averageHue=%23090605&clientId=udc7eeb0b-1a83-4&from=paste&id=u66e0e4a4&originHeight=268&originWidth=1373&originalType=url&ratio=1.25&rotation=0&showTitle=false&status=done&style=none&taskId=u341a05c2-888d-4008-aa21-ccd5cae5422&title=)<br />接下来 运行咱自己打包的镜像 tom:1.0<br />设置容器名字为lei 映射端口为6500:8080
```
docker run -d -it  -p6500:8080 --name lei tom:1.0 /bin/bash
```
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1721873012555-c1a4ff86-a186-40db-b8d3-77de01ac8cef.png#averageHue=%23090604&clientId=udc7eeb0b-1a83-4&from=paste&id=u98d93821&originHeight=130&originWidth=1280&originalType=url&ratio=1.25&rotation=0&showTitle=false&status=done&style=none&taskId=uc716f20e-1b9b-4bbd-a2c2-6caa7f2f745&title=)<br />![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1721873012936-e3295613-fa03-4fe6-9ddc-55ff77752e7b.png#averageHue=%23ebf6de&clientId=udc7eeb0b-1a83-4&from=paste&id=uddf87c33&originHeight=356&originWidth=1606&originalType=url&ratio=1.25&rotation=0&showTitle=false&status=done&style=none&taskId=u7e99fade-4ac7-41e8-b667-ef603385283&title=)<br />访问6500 端口进入到了 tomcat 首页 说明 咱commit 镜像成功了
<a name="e23254bd"></a>
## （五）docker 运维命令
可能有时候发布会遇到如下错误:<br />`docker: write /var/lib/docker/tmp/GetImageBlob325372670: no space left on device`<br />这个错误是docker在写入的时候报错无机器无空间<br />![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1721873013059-5c66c0f2-deea-4317-b8eb-68b95b82b4e1.png#averageHue=%23130e0a&clientId=udc7eeb0b-1a83-4&from=paste&id=uae32e5cd&originHeight=454&originWidth=1134&originalType=url&ratio=1.25&rotation=0&showTitle=false&status=done&style=none&taskId=u76b7a2b0-27b1-4e4a-87ad-3c0caa5318d&title=)<br />**查看docker工作目录**
```
sudo docker info | grep "Docker Root Dir"
```
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1721873013301-72fb2b56-f8db-42aa-9519-9cc155d4afee.png#averageHue=%230c0805&clientId=udc7eeb0b-1a83-4&from=paste&id=u2283d0a6&originHeight=124&originWidth=871&originalType=url&ratio=1.25&rotation=0&showTitle=false&status=done&style=none&taskId=uc44dda23-ad69-4d52-8b41-5fffd3bcbc7&title=)<br />**查看docker磁盘占用总体情况**
```
du -hs /var/lib/docker/ 
```
**更改docker工作目录**<br />首先我们需要先停止docker
```
systemctl stop docker
```
创建新工作目录文件夹
```
mkdir -p /docker-data
```
原docker数据迁移
```
cp -r /var/lib/docker
```
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1721873013276-1188cc1d-ddb3-46a0-b73f-17ed33f15f36.png#averageHue=%234d4b4a&clientId=udc7eeb0b-1a83-4&from=paste&id=u63bc3de6&originHeight=358&originWidth=1062&originalType=url&ratio=1.25&rotation=0&showTitle=false&status=done&style=none&taskId=u9d6e4064-8dfa-40e1-99f6-e1f5ba2b372&title=)<br />修改docke数据存储配置<br />在之前我们配置镜像加速的时候已经有了该文件，所以我们直接修改内容接口
```
vim /etc/docker/daemon.json

# json 文件中添加一对键值对
"data-root":"/docker-data"
```
修改后内容如下
```
{
  "registry-mirrors": ["https://镜像加速地址"],
  "data-root":"/docker-data"
}
```
启动后我们的配置就生效了
```
systemctl restart docker

docker info | grep "Docker Root Dir"
```
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1721873013576-94f1ef16-c4b1-4f6f-b597-0d0222bf9d1a.png#averageHue=%23181412&clientId=udc7eeb0b-1a83-4&from=paste&id=u4cd34d60&originHeight=132&originWidth=673&originalType=url&ratio=1.25&rotation=0&showTitle=false&status=done&style=none&taskId=u8192c55a-780e-4d84-9f67-9088d6bc7e9&title=)<br />**查看Docker的磁盘使用具体情况**
```
docker system df
```
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1721873013747-2e1ede6a-e18e-4994-893f-acf9feee44e5.png#averageHue=%23070403&clientId=udc7eeb0b-1a83-4&from=paste&id=ub30e8b02&originHeight=136&originWidth=883&originalType=url&ratio=1.25&rotation=0&showTitle=false&status=done&style=none&taskId=u9a784a35-1239-44e5-8c09-f2950ea0265&title=)<br />**删除 无用的容器和 镜像**
```
#  删除异常停止的容器
docker rm `docker ps -a | grep Exited | awk '{print $1}'` 
 
#  删除名称或标签为none的镜像
docker rmi -f  `docker images | grep '<none>' | awk '{print $3}'`
```
**清除所有无容器使用的镜像**<br />注意，此命令只要是镜像无容器使用（容器正常运行）都会被删除，包括容器临时停止
```
docker system prune -a
```
**查找大文件**
```
find / -type f -size +100M -print0 | xargs -0 du -h | sort -nr
```
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1721873013757-2ec62c2b-5bf1-4402-b808-0eecae6a47c7.png#averageHue=%230f0b07&clientId=udc7eeb0b-1a83-4&from=paste&id=u67af19ab&originHeight=308&originWidth=1119&originalType=url&ratio=1.25&rotation=0&showTitle=false&status=done&style=none&taskId=ua1dfe0c9-7c27-4909-8bdd-65f57484d13&title=)<br />**查找指定docker使用目录下大于指定大小文件**
```
find / -type f -size +100M -print0 | xargs -0 du -h | sort -nr |grep '/var/lib/docker/overlay2/*'
```
ex：我这里是查找 /var/lib/docker/overlay2/* 开头的且大于100m的文件<br />![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1721873014102-610d14bb-ddae-48f6-8870-91907a2433ee.png#averageHue=%231a110c&clientId=udc7eeb0b-1a83-4&from=paste&id=uce7adc52&originHeight=371&originWidth=1189&originalType=url&ratio=1.25&rotation=0&showTitle=false&status=done&style=none&taskId=uc0809745-2555-4918-9a21-aa480b6f778&title=)

