## <font style="color:rgb(79, 79, 79);">1.官网下载</font><font style="color:rgb(78, 161, 219);">MySQL</font>
<font style="color:rgb(77, 77, 77);">下载Mysql</font>[<font style="color:rgb(77, 77, 77);">点击下载mysql</font>](https://dev.mysql.com/downloads/mysql/)<font style="color:rgb(77, 77, 77);">.  
</font>![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1726843774019-0710ef74-c5d2-403a-8d83-b1c8dce8f113.png)<font style="color:rgb(77, 77, 77);">  
</font>**<font style="color:rgb(77, 77, 77);">下载完成后解压到某一个文件夹</font>**<font style="color:rgb(77, 77, 77);">（记住这个路径，一会要用到）  
</font>![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1726843774315-3466017f-771c-4b0d-93d3-2060497d975e.png)

## <font style="color:rgb(79, 79, 79);">2.配置初始化文件my.ini</font>
<font style="color:rgb(77, 77, 77);">在</font>[<font style="color:rgb(77, 77, 77);">根目录</font>](https://so.csdn.net/so/search?q=%E6%A0%B9%E7%9B%AE%E5%BD%95&spm=1001.2101.3001.7020)<font style="color:rgb(77, 77, 77);">下创建一个txt文件，名字叫my，文件后缀为ini  
</font><font style="color:rgb(77, 77, 77);">之后复制下面这个代码放在文件下  
</font><font style="color:rgb(77, 77, 77);">（新解压的文件没有my.ini文件，需自行创建）  
</font><font style="color:rgb(77, 77, 77);">以下代码除安装目录和数据的存放目录需修改，其余不用修改</font>

```plain
[mysqld]
# 设置3306端口
port=3306
# 设置mysql的安装目录   ----------是你的文件路径-------------
basedir=E:\mysql\mysql
# 设置mysql数据库的数据的存放目录  ---------是你的文件路径data文件夹自行创建
datadir=E:\mysql\mysql\data
# 允许最大连接数
max_connections=200
# 允许连接失败的次数。
max_connect_errors=10
# 服务端使用的字符集默认为utf8mb4
character-set-server=utf8mb4
# 创建新表时将使用的默认存储引擎
default-storage-engine=INNODB
# 默认使用“mysql_native_password”插件认证
#mysql_native_password
default_authentication_plugin=mysql_native_password
[mysql]
# 设置mysql客户端默认字符集
default-character-set=utf8mb4
[client]
# 设置mysql客户端连接服务端时默认使用的端口
port=3306
default-character-set=utf8mb4




1
2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
18
19
20
21
22
23
24
25
26
```

## <font style="color:rgb(79, 79, 79);">3.初始化MySQL</font>
<font style="color:rgb(77, 77, 77);">使用</font>**<font style="color:rgb(77, 77, 77);">管理员</font>**<font style="color:rgb(77, 77, 77);">身份运行CMD  
</font>![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1726843774257-55dda13c-9394-4ab9-94f4-3850417d48b5.png)<font style="color:rgb(77, 77, 77);">  
</font><font style="color:rgb(77, 77, 77);">进入mysql的bin目录</font>

```plain
cd E:\mysql\mysql\bin\


1
```

![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1726843774414-59248c06-b587-4a99-a8a5-c8c1f69157ec.png)<font style="color:rgb(77, 77, 77);">  
</font><font style="color:rgb(77, 77, 77);">在MySQL目录下的bin目录下执行命令：</font>

```plain
mysqld --initialize --console


1
```

<font style="color:rgb(77, 77, 77);">复制root@localhost:之后的密码到本地文件夹，保存好(</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">: 后有一个空格，不复制</font>**<font style="color:rgb(77, 77, 77);">)  
</font>![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1726843774390-dc5ef32a-2ca7-4895-9802-c49e2f2cad3d.png)

## <font style="color:rgb(79, 79, 79);">4.安装mysql服务并启动+修改密码</font>
**<font style="color:rgb(77, 77, 77);">（1）安装mysql服务</font>**

```plain
mysqld --install mysql


1
```

<font style="color:rgb(77, 77, 77);">之后会提示服务已经成功安装  
</font>![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1726843774778-d23da872-ee1e-40ab-ad4a-56cdc1ad44e3.png)

**<font style="color:rgb(77, 77, 77);">（2）启动mysql服务</font>**

```plain
net start mysql


1
```

**<font style="color:rgb(77, 77, 77);">输入之后提示以下内容</font>**<font style="color:rgb(77, 77, 77);">  
</font>![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1726843774799-55b437da-0bc7-4cbd-9dfb-29fcc363684d.png)

**<font style="color:rgb(77, 77, 77);">（3）连接mysql</font>**

```plain
mysql -uroot -p


1
```

**<font style="color:rgb(77, 77, 77);">输入之后去复制一下刚刚保存下来的密码，并粘贴到命令台</font>**<font style="color:rgb(77, 77, 77);">  
</font>![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1726843774808-021a0c80-486c-42fc-a003-39514e7b0f28.png)<font style="color:rgb(77, 77, 77);">  
</font><font style="color:rgb(77, 77, 77);">输入以下命令修改密码(把新的密码修改成你想要的密码)</font>

```plain
ALTER USER 'root'@'localhost' IDENTIFIED BY '新的密码';


1
```

![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1726843774837-3022c087-09fd-4beb-82b7-b7a2d19dbb79.png)<font style="color:rgb(77, 77, 77);">  
</font>**<font style="color:rgb(77, 77, 77);">密码修改完成</font>**

## <font style="color:rgb(79, 79, 79);">5.配置</font>[<font style="color:rgb(79, 79, 79);">环境变量</font>](https://so.csdn.net/so/search?q=%E7%8E%AF%E5%A2%83%E5%8F%98%E9%87%8F&spm=1001.2101.3001.7020)
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1726843774999-94e8fde5-1db2-44ef-9718-f87438685577.png)<font style="color:rgb(77, 77, 77);">  
</font>**<font style="color:rgb(77, 77, 77);">在path中加入以下代码</font>**<font style="color:rgb(77, 77, 77);">  
</font>![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1726843775284-944d8317-d9ef-4fd2-ab5f-c0804d3cbbf6.png)

## <font style="color:rgb(79, 79, 79);">6.部分疑难杂病</font>
1. <font style="color:rgba(0, 0, 0, 0.75);">执行mysqld --install mysql如果提示该服务已存在  
</font>![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1726843775385-b5f64a56-5768-45e8-b63e-bcfa401a2089.png)<font style="color:rgba(0, 0, 0, 0.75);">  
</font><font style="color:rgba(0, 0, 0, 0.75);">就先删除该服务（使用以下代码）</font>

```plain
sc delete mysql


1
```

<font style="color:rgba(0, 0, 0, 0.75);">然后在执行mysqld --install mysql</font>

## <font style="color:rgb(79, 79, 79);">7.使用连接工具连接mysql</font>
**<font style="color:rgb(77, 77, 77);">我使用的连接工具是</font>**<font style="color:rgb(77, 77, 77);">DataGrip** (学生认证激活)**</font>

+ <font style="color:rgba(0, 0, 0, 0.75);">附下载地址</font>[<font style="color:rgba(0, 0, 0, 0.75);">https://www.jetbrains.com/datagrip/</font>](https://www.jetbrains.com/datagrip/)
+ <font style="color:rgba(0, 0, 0, 0.75);">DataGrip后台占用的内存比较大，我运行每次都在1G以上，希望各位</font>**<font style="color:rgba(0, 0, 0, 0.75);">斟酌使用</font>**
+ <font style="color:rgba(0, 0, 0, 0.75);">Navicat也是一款不错的工具（</font>[<font style="color:rgba(0, 0, 0, 0.75);">下载地址</font>](https://www.navicat.com.cn/download/navicat-premium)<font style="color:rgba(0, 0, 0, 0.75);">）读者们根据自己的喜好选择不同的连接工具</font>
+ <font style="color:rgba(0, 0, 0, 0.75);">打开DataGrip之后按照以下步骤添加数据库  
</font>![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1726843775490-c5692335-dfe6-4437-8144-97b3b082cd34.png)<font style="color:rgba(0, 0, 0, 0.75);">  
</font>**<font style="color:rgba(0, 0, 0, 0.75);">之后继续如下步骤（URL复制我的就可以）</font>**

```plain
jdbc:mysql://localhost:3306?serverTimezone=GMT


1
```

![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1726843775381-86eb59fe-b775-46d4-9ccc-cf944db518af.png)<font style="color:rgb(77, 77, 77);">  
</font><font style="color:rgb(77, 77, 77);">输入 </font>**<font style="color:rgb(77, 77, 77);">show databases</font>**<font style="color:rgb(77, 77, 77);">之后查看结果，出现如下结果则</font>**<font style="color:rgb(77, 77, 77);">配置成功啦！！！</font>**<font style="color:rgb(77, 77, 77);">  
</font>![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1726843775829-ab46a5b2-1bf6-468b-b830-fd36e67bc4f8.png)

