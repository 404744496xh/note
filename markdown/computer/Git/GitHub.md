[TOC]

## 远程库操作

### 建立远程库

1.  ![image.png](images/WEBRESOURCE48f918e89c182e40bbdebc4dbc8b034cimage.png)

2.  ![image.png](images/WEBRESOURCE04a33b23af8eaddd343357d7fd7d33a0image.png)

3.  ![image.png](images/WEBRESOURCE89cb325f17b297089efea06c03d33f81image.png)

4.  ![image.png](images/WEBRESOURCE474e6ba85473256ae9ee8f290a08de84image.png)

5.  ![image.png](images/WEBRESOURCEbacea521de5747cd81822c3c1e14fc5aimage.png)
    ### 命令

|               命令名称               |              作用             |
| :------------------------------: | :-------------------------: |
|           git remote -v          |         查看当前所有远程地址别名        |
|      git remote add 别名 远程地址      |             起别名             |
|          git push 别名 分支          |       推送本地分支上的内容到远程仓库       |
|          git clone 远程地址          |        将远程仓库的内容克隆到本地        |
|      git pull 远程库地址别名 远程分支名      | 将远程仓库对分支最新内容拉下来后与当前本地分支直接合并 |
| git remote remove \<remote-name> |          删除远程地址的别名          |

//取消http代理
git config --global --unset http.proxy
//取消https代理
git config --global --unset https.proxy

git config --global http.sslVerify "false"

注：clone会做三件事：1.拉取代码 2. 初始化本地库 3.创建别名

### 团队协作

![image.png](https://note.youdao.com/yws/res/6417/WEBRESOURCE436888454474f93c7551580edc2447b7 "image.png")

添加成员

![image.png](images/WEBRESOURCE42b36227317473fd7c45c8dfb80130cfimage.png)

### 跨团队协作

![image.png](https://note.youdao.com/yws/res/6424/WEBRESOURCE6925fd50a7ab4039eb742286833ac007 "image.png")

帮忙修改代码的人点这个![image.png](images/WEBRESOURCE35386642aa107c3f9bd6931c48789cbbimage.png)

修改好后点这个（拉取请求）![image.png](images/WEBRESOURCEa7c84325352529ed1c3666843039aa35image.png)

![image.png](images/WEBRESOURCE9f43907cac944eecfa6b2dca5d5d8979image.png)

![image.png](images/WEBRESOURCE89f3c123b3df729e24c49951558b6696image.png)

![image.png](images/WEBRESOURCE4ee4baefa049d50a9d7a7a12ccfd9ce9image.png)

检查好后提交合并申请![image.png](images/WEBRESOURCE636ecab07c55470e8b6365d7c5f02054image.png)

## SSH免密登录

建立一个.ssh的目录

ssh-keygen -t  rsa  -C <404744496@qq.com>

> rsa是加密算法 -C后面是

输入完命令按三次回车就创建完成
![image.png](images/WEBRESOURCEe38872f38b7d39a868209f36e5b21608image.png)

打开公钥然后点new ssh key![image.png](images/WEBRESOURCEd66049b1dca2c140b0d8320e77f4878bimage.png)

然后就能用SSH连接来操作远程库

![image.png](images/WEBRESOURCEa5a184a2dd190161995d2677fc78468aimage.png)没有设置new ssh key时有warning
