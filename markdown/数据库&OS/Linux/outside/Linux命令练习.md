## linux命令练习
### 常用命令
```plain
1.进入到用户根目录
cd ~ 或 cd

2.查看当前所在目录
pwd

3.进入到hadoop用户根目录
cd ~hadoop

4.返回到原来目录
cd -

5.返回到上一级目录
cd ..

6.查看hadoop用户根目录下的所有文件
ls -la

7.在根目录下创建一个hadoop的文件夹
mkdir /hadoop

8.在/hadoop目录下创建src和WebRoot两个文件夹
分别创建：mkdir /hadoop/src
          mkdir /hadoop/WebRoot
同时创建：mkdir /hadoop/{src,WebRoot}

进入到/hadoop目录，在该目录下创建.classpath和README文件
分别创建：touch .classpath
          touch README
同时创建：touch {.classpath,README}

查看/hadoop目录下面的所有文件
ls -la

在/hadoop目录下面创建一个test.txt文件,同时写入内容"this is test"
echo "this is test" > test.txt

查看一下test.txt的内容
cat test.txt
more test.txt
less test.txt

向README文件追加写入"please read me first"
echo "please read me first" >> README

将test.txt的内容追加到README文件中
cat test.txt >> README

拷贝/hadoop目录下的所有文件到/hadoop-bak
cp -r /hadoop /hadoop-bak

进入到/hadoop-bak目录，将test.txt移动到src目录下，并修改文件名为Student.java
mv test.txt src/Student.java

在src目录下创建一个struts.xml
> struts.xml

删除所有的xml类型的文件
rm -rf *.xml

删除/hadoop-bak目录和下面的所有文件
rm -rf /hadoop-bak

返回到/hadoop目录，查看一下README文件有多单词，多少个少行
wc -w README
wc -l README

返回到根目录，将/hadoop目录先打包，再用gzip压缩
分步完成：tar -cvf hadoop.tar hadoop
          gzip hadoop.tar
一步完成：tar -zcvf hadoop.tar.gz hadoop

将其解压缩，再取消打包
分步完成：gzip -d hadoop.tar.gz 或 gunzip hadoop.tar.gz
一步完成：tar -zxvf hadoop.tar.gz

将/hadoop目录先打包，同时用bzip2压缩，并保存到/tmp目录下
tar -jcvf /tmp/hadoop.tar.bz2 hadoop

将/tmp/hadoop.tar.bz2解压到/usr目录下面
tar -jxvf hadoop.tar.bz2 -C /usr/

```

### 系统命令
```plain
1.查看主机名
hostname

2.修改主机名(重启后无效)
hostname hadoop

3.修改主机名(重启后永久生效)
vi /ect/sysconfig/network

4.修改IP(重启后无效)
ifconfig eth0 192.168.12.22

5.修改IP(重启后永久生效)
vi /etc/sysconfig/network-scripts/ifcfg-eth0

6.查看系统信息
uname -a
uname -r

7.查看ID命令
id -u
id -g

8.日期
date
date +%Y-%m-%d
date +%T
date +%Y-%m-%d" "%T

9.日历
cal 2012

10.查看文件信息
file filename

11.挂载硬盘
mount
umount
加载windows共享
mount -t cifs //192.168.1.100/tools /mnt

12.查看文件大小
du -h
du -ah

13.查看分区
df -h

14.ssh
ssh hadoop@192.168.1.1

15.关机
shutdown -h now /init 0
shutdown -r now /reboot

```

### 用户和组
```plain
添加一个tom用户，设置它属于users组，并添加注释信息
分步完成：useradd tom
          usermod -g users tom
          usermod -c "hr tom" tom
一步完成：useradd -g users -c "hr tom" tom

设置tom用户的密码
passwd tom

修改tom用户的登陆名为tomcat
usermod -l tomcat tom

将tomcat添加到sys和root组中
usermod -G sys,root tomcat

查看tomcat的组信息
groups tomcat

添加一个jerry用户并设置密码
useradd jerry
passwd jerry

添加一个交america的组
groupadd america

将jerry添加到america组中
usermod -g america jerry

将tomcat用户从root组和sys组删除
gpasswd -d tomcat root
gpasswd -d tomcat sys

将america组名修改为am
groupmod -n am america

```

### 权限
```plain
创建a.txt和b.txt文件，将他们设为其拥有者和所在组可写入，但其他以外的人则不可写入:
chmod ug+w,o-w a.txt b.txt

创建c.txt文件所有人都可以写和执行
chmod a=wx c.txt 或chmod 666 c.txt

将/hadoop目录下的所有文件与子目录皆设为任何人可读取
chmod -R a+r /hadoop

将/hadoop目录下的所有文件与子目录的拥有者设为root，用户拥有组为users
chown -R root:users /hadoop

将当前目录下的所有文件与子目录的用户皆设为hadoop，组设为users
chown -R hadoop:users *

```

### 帮助文档
```plain
1.内部命令：echo
查看内部命令帮助：help echo 或者 man echo

2.外部命令：ls
查看外部命令帮助：ls --help 或者 man ls 或者 info ls

3.man文档的类型(1~9)
man 7 man
man 5 passwd

4.快捷键：
ctrl + c：停止进程
ctrl + l：清屏
ctrl + r：搜索历史命令
ctrl + q：退出

5.善于用tab键

```

文件相关命令

```plain
1.进入到用户根目录
cd ~ 或者 cd
cd ~hadoop
回到原来路径
cd -

2.查看文件详情
stat a.txt

3.移动
mv a.txt /ect/
改名
mv b.txt a.txt
移动并改名
mv a.txt ../b.txt

4拷贝并改名
cp a.txt /etc/b.txt

5.vi撤销修改
ctrl + u (undo)
恢复
ctrl + r (redo)

6.名令设置别名(重启后无效)
alias ll="ls -l"
取消
unalias ll

7.如果想让别名重启后仍然有效需要修改
vi ~/.bashrc

8.添加用户
useradd hadoop
passwd hadoop

9创建多个文件
touch a.txt b.txt
touch /home/{a.txt,b.txt}

10.将一个文件的内容复制到里另一个文件中
cat a.txt > b.txt
追加内容
cat a.txt >> b.txt 

11.将a.txt 与b.txt设为其拥有者和其所属同一个组者可写入，但其他以外的人则不可写入:
chmod ug+w,o-w a.txt b.txt

chmod a=wx c.txt

12.将当前目录下的所有文件与子目录皆设为任何人可读取:
chmod -R a+r *

13.将a.txt的用户拥有者设为users,组的拥有者设为jessie:
chown users:jessie a.txt

14.将当前目录下的所有文件与子目录的用户的使用者为lamport,组拥有者皆设为users，
chown -R lamport:users *

15.将所有的java语言程式拷贝至finished子目录中:
cp *.java finished

16.将目前目录及其子目录下所有扩展名是java的文件列出来。
find -name "*.java"
查找当前目录下扩展名是java 的文件
find -name *.java

17.删除当前目录下扩展名是java的文件
rm -f *.java

```

### VIM
```plain
i
a/A
o/O
r + ?替换

0:文件当前行的开头
$:文件当前行的末尾
G:文件的最后一行开头
1 + G到第一行 
9 + G到第九行 = :9

dd:删除一行
3dd：删除3行
yy:复制一行
3yy:复制3行
p:粘贴
u:undo
ctrl + r:redo

"a剪切板a
"b剪切板b

"ap粘贴剪切板a的内容

每次进入vi就有行号
vi ~/.vimrc
set nu

:w a.txt另存为
:w >> a.txt内容追加到a.txt

:e!恢复到最初状态

:1,$s/hadoop/root/g 将第一行到追后一行的hadoop替换为root
:1,$s/hadoop/root/c 将第一行到追后一行的hadoop替换为root(有提示)

```

### 查找
```plain
1.查找可执行的命令：
which ls

2.查找可执行的命令和帮助的位置：
whereis ls

3.查找文件(需要更新库:updatedb)
locate hadoop.txt

4.从某个文件夹开始查找
find / -name "hadooop*"
find / -name "hadooop*" -ls

5.查找并删除
find / -name "hadooop*" -ok rm {} \;
find / -name "hadooop*" -exec rm {} \;

6.查找用户为hadoop的文件
find /usr -user hadoop -ls

7.查找用户为hadoop并且(-a)拥有组为root的文件
find /usr -user hadoop -a -group root -ls

8.查找用户为hadoop或者(-o)拥有组为root并且是文件夹类型的文件
find /usr -user hadoop -o -group root -a -type d

9.查找权限为777的文件
find / -perm -777 -type d -ls

10.显示命令历史
history

11.grep
grep hadoop /etc/password

```

### 打包与压缩
```plain
1.gzip压缩
gzip a.txt

2.解压
gunzip a.txt.gz
gzip -d a.txt.gz

3.bzip2压缩
bzip2 a

4.解压
bunzip2 a.bz2
bzip2 -d a.bz2

5.将当前目录的文件打包
tar -cvf bak.tar .
将/etc/password追加文件到bak.tar中(r)
tar -rvf bak.tar /etc/password

6.解压
tar -xvf bak.tar

7.打包并压缩gzip
tar -zcvf a.tar.gz

8.解压缩
tar -zxvf a.tar.gz
解压到/usr/下
tar -zxvf a.tar.gz -C /usr

9.查看压缩包内容
tar -ztvf a.tar.gz

zip/unzip

10.打包并压缩成bz2
tar -jcvf a.tar.bz2

11.解压bz2
tar -jxvf a.tar.bz2

```

### 正则表达式
```plain
规则：
.  : 任意一个字符
a* : 任意多个a(零个或多个a)
a? : 零个或一个a
a+ : 一个或多个a
.* : 任意多个任意字符
\. : 转义.
\ ：以h开头，p结尾的一个单词
o\{2\} : o重复两次

grep '^i.\{18\}n$' /usr/share/dict/words

查找不是以#开头的行
grep -v '^#' a.txt | grep -v '^$' 

以h或r开头的
grep '^[hr]' /etc/passwd

不是以h和r开头的
grep '^[^hr]' /etc/passwd

不是以h到r开头的
grep '^[^h-r]' /etc/passwd

```

### 输入输出重定向
```plain
1.新建一个文件
touch a.txt
> b.txt

2.错误重定向:2>
find /etc -name zhaoxing.txt 2> error.txt

3.将正确或错误的信息都输入到log.txt中
find /etc -name passwd > /tmp/log.txt 2>&1 
find /etc -name passwd &> /tmp/log.txt

4.追加>>

5.将小写转为大写（输入重定向）
tr "a-z" "A-Z"  log.txt  ccc
> ddd
> EXI

7.查看/etc下的文件有多少个？
ls -l /etc/ | grep '^d' | wc -l

8.查看/etc下的文件有多少个，并将文件详情输入到result.txt中
ls -l /etc/ | grep '^d' | tee result.txt | wc -l

```

### 进程控制
```plain
1.查看用户最近登录情况
last
lastlog

2.查看硬盘使用情况
df

3.查看文件大小
du

4.查看内存使用情况
free

5.查看文件系统
/proc

6.查看日志
ls /var/log/

7.查看系统报错日志
tail /var/log/messages

8.查看进程
top

9.结束进程
kill 1234
kill -9 4333

```

### 其他命令
#### 远程文件复制：scp
scp 命令用于 Linux 之间复制文件和目录，scp是 secure copy 的缩写是linux系统下基于ssh登陆进行安全的远程文件拷贝命令。

scp 是加密的，[rcp](https://xiaoxiaoming.xyz/linux/linux-comm-rcp.html) 是不加密的，scp 是 rcp 的加强版。

使用scp命令要确保使用的用户具有可读取远程服务器相应文件的权限，否则scp命令是无法起作用的。

从本地复制到远程命令格式：

```plain
复制文件
scp local_file remote_username@remote_ip:remote_folder 
或者 
scp local_file remote_username@remote_ip:remote_file 
或者 
scp local_file remote_ip:remote_folder 
或者 
scp local_file remote_ip:remote_file

复制文件夹
scp -r local_folder remote_username@remote_ip:remote_folder 
或者 
scp -r local_folder remote_ip:remote_folder 

```

实例：

```plain
scp /home/space/music/1.mp3 root@xiaoxiaoming.xyz:/home/root/others/music 
scp /home/space/music/1.mp3 root@xiaoxiaoming.xyz:/home/root/others/music/001.mp3 
scp /home/space/music/1.mp3 xiaoxiaoming.xyz:/home/root/others/music 
scp /home/space/music/1.mp3 xiaoxiaoming.xyz:/home/root/others/music/001.mp3

scp -r /home/space/music/ root@xiaoxiaoming.xyz:/home/root/others/ 
scp -r /home/space/music/ xiaoxiaoming.xyz:/home/root/others/ 

```

从远程复制到本地：

```plain
scp root@xiaoxiaoming.xyz:/home/root/others/music /home/space/music/1.mp3 
scp -r xiaoxiaoming.xyz:/home/root/others/ /home/space/music/

```

-P 参数来设置命令的端口号：

```plain
#scp 命令使用端口号 4588
scp -P 4588 remote@xiaoxiaoming.xyz:/usr/local/sin.sh /home/administrator

```

#### locate查找
locate命令会去保存文档和目录名称的数据库内，查找文件或目录。

一般情况我们只需要输入`locate your_file_name` 即可查找指定文件。

**参数：**

+ -d或–database= 配置locate指令使用的数据库。locate指令预设的数据库位于/var/lib/mlocate目录里，文档名为mlocate.db。

查找passwd文件，输入以下命令：

```plain
locate passwd

```

locate与find的区别: find 是去硬盘找，locate 只在/var/lib/slocate资料库中找。

locate的速度比find快，它并不是真的查找，而是查数据库，一般文件数据库在/var/lib/mlocate/mlocate.db中，所以locate的查找并不是实时的，而是以数据库的更新为准，一般是系统自己维护，也可以手工升级数据库 ，命令为：

```plain
updatedb

```

#### which命令
which查找$PATH中设置命令及安装文件目录所在位置

```plain
python@ubuntu:/var/lib/mlocate$ which locate
/usr/bin/locate

```

#### echo
常见用法：

```plain
python@ubuntu:~$ echo -e "hello\t\t world！"  解析转义字符
hello            world！
python@ubuntu:~$ echo -E "hello\t\t world！"  不解析转义字符
hello\t\t world！
python@ubuntu:~$ echo $a  输出环境变量
b

```

#### 设置或显示环境变量：export
在 shell 中执行程序时，shell 会提供一组环境变量。export 可新增，修改或删除环境变量，供后续执行的程序使用。export 的效力仅限于该次登陆操作。

```plain
export [-fnp][变量名称]=[变量设置值]

```

**参数说明**：

+ -f 代表[变量名称]中为函数名称。
+ -n 删除指定的变量。变量实际上并未删除，只是不会输出到后续指令的执行环境中。
+ -p 列出所有的shell赋予程序的环境变量。

```plain
# export MYENV=7 //定义环境变量并赋值
# export -p //列出当前的环境变量

```

#### 修改主机名&ip地址
显示主机名：hostname

临时修改：hostname xxx

**永久修改**

对于Ubuntu 系统

```plain
vim /etc/hostname

```

对于centos系统

```plain
vim /etc/sysconfig/network

```

在此配置文件中添加一条HOSTNAME=node1

针对centos7系统，可以使用如下命令

```plain
hostnamectl set-hostname xxx

```

一般需要重开shell甚至重启操作系统才能生效。

**修改IP地址**

ifconfig eth0 192.168.12.22(重启后无效)

```plain
vim /etc/sysconfig/network-scripts/ifcfg-eth0

```

#### mount挂载
mount 挂载外部存储设备到文件系统中

```plain
mkdir /mnt/cdrom 创建一个目录，用来挂载
mount -t iso9660 -o ro /dev/cdrom /mnt/cdrom/     

```

将设备/dev/cdrom挂载到 挂载点 ： /mnt/cdrom中

```plain
umount /mnt/cdrom

```

#### ssh免密登陆
假如 A 要登陆 B  
在A上操作：  
首先生成密钥对

```plain
ssh-keygen (提示时，直接回车即可)

```

再将A自己的公钥拷贝并追加到B的授权列表文件authorized_keys中

```plain
ssh-copy-id B

```

### 批量添加用户
#### 与用户账号有关的系统文件
完成用户管理的工作本质都是对有关的系统文件进行修改，这些系统文件包括/etc/passwd, /etc/shadow, /etc/group等。

**/etc/passwd记录用户的基本属性**

它的内容类似下面的例子：

```plain
＃ cat /etc/passwd

root:x:0:0:Superuser:/:
daemon:x:1:1:System daemons:/etc:
bin:x:2:2:Owner of system commands:/bin:
sys:x:3:3:Owner of system files:/usr/sys:
adm:x:4:4:System accounting:/usr/adm:
uucp:x:5:5:UUCP administrator:/usr/lib/uucp:
auth:x:7:21:Authentication administrator:/tcb/files/auth:
cron:x:9:16:Cron daemon:/usr/spool/cron:
listen:x:37:4:Network daemon:/usr/net/nls:
lp:x:71:18:Printer administrator:/usr/spool/lp:
sam:x:200:50:Sam san:/home/sam:/bin/sh

```

/etc/passwd中一行记录对应着一个用户，每行记录又被冒号(:)分隔为7个字段，其格式和具体含义如下：

```plain
用户名:口令:用户标识号:组标识号:注释性描述:主目录:登录Shell

```

**用户名：**

通常长度不超过8个字符，由大小写字母和/或数字组成，不能有冒号(😃。登录名中不能有冒号(😃，因为冒号在这里是分隔符。

为了兼容起见，登录名中最好不要包含点字符(.)，并且不使用连字符(-)和加号(+)打头。

**口令：**

本身存放用户口令的加密串，但现在许多Linux 系统都使用了shadow技术，把真正的加密后的用户口令字存放到/etc/shadow文件中，而/etc/passwd文件的口令字段中只存放一个特殊的字符，例如“x”或者“*”。

**用户标识号：**

是一个整数，系统内部用它来标识用户。一般情况下它与用户名是一一对应的，如果几个用户名对应的用户标识号是一样的，系统内部将把它们视为同一个用户，但是它们可以有不同的口令、不同的主目录以及不同的登录Shell等。

通常用户标识号的取值范围是0～65 535。0是超级用户root的标识号，1～99由系统保留，作为管理账号，普通用户的标识号从100开始。

**组标识号：**

记录用户所属的用户组，对应着/etc/group文件中的一条记录。

**注释性描述：**

一段任意编写的注释，创建账户时可以通过`useradd -c 用户名`的`-c`参数指定。

**主目录：**

用户的起始工作目录，用户在登录到系统之后所处的目录。

**登录Shell：**

用户登录后，要启动一个进程，负责将用户的操作传给内核，这个进程是用户登录到系统后运行的命令解释器或某个特定的程序，即Shell。

Shell是用户与Linux系统之间的接口。Linux的Shell有许多种，每种都有不同的特点。常用的有sh(Bourne Shell), csh(C Shell), ksh(Korn Shell), tcsh(TENEX/TOPS-20 type C Shell), bash(Bourne Again Shell)等。

可以通过usermod的`-s`参数为用户指定某个Shell。如果useradd不通过`-s`参数指定shell，那么系统使用bash为默认的登录Shell，即这个字段的值为/bin/bash。

为用户的登录指定特定的Shell可以限制用户只能运行指定的应用程序，在该应用程序运行结束后，用户就自动退出了系统。不过大部分Linux系统要求只有在系统中登记过的shell才能出现在这个字段中。

**伪用户（pseudo users）**

这些用户的登陆shell为/usr/sbin/nologin，即不能登录。它们的存在主要是方便系统管理，满足相应的系统进程对文件属主的要求。

常见的伪用户如下所示：

```plain
bin 拥有可执行的用户命令文件 
sys 拥有系统文件 
adm 拥有帐户文件 
uucp UUCP使用 
lp lp或lpd子系统使用 
nobody NFS使用

```

还有许多标准的伪用户，例如：audit, cron, mail, usenet等，它们也都各自为相关的进程和文件所需要。

**/etc/shadow**

对安全性要求较高的Linux系统都把/etc/passwd文件中的口令字段保存在/etc/shadow文件中，超级用户才拥有该文件读权限。

/etc/shadow中的记录行与/etc/passwd中的一一对应，它由pwconv命令根据/etc/passwd中的数据自动产生

字段是：

```plain
登录名:加密口令:最后一次修改时间:最小时间间隔:最大时间间隔:警告时间:不活动时间:失效时间:标志

```

1. "登录名"是与/etc/passwd文件中的登录名相一致的用户账号
2. "口令"字段存放的是加密后的用户口令字，长度为13个字符。如果为空，则对应用户没有口令，登录时不需要口令；如果含有不属于集合 { ./0-9A-Za-z }中的字符，则对应的用户不能登录。
3. "最后一次修改时间"表示的是从某个时刻起，到用户最后一次修改口令时的天数。大部分linux系统的时间起点是1970年1月1日。
4. "最小时间间隔"指的是两次修改口令之间所需的最小天数。
5. "最大时间间隔"指的是口令保持有效的最大天数。
6. "警告时间"字段表示的是从系统开始警告用户到用户密码正式失效之间的天数。
7. "不活动时间"表示的是用户没有登录活动但账号仍能保持有效的最大天数。
8. "失效时间"字段给出的是一个绝对的天数，如果使用了这个字段，那么就给出相应账号的生存期。期满后，该账号就不再是一个合法的账号，也就不能再用来登录了。

下面是/etc/shadow的一个例子：

```plain
＃ cat /etc/shadow

root:Dnakfw28zf38w:8764:0:168:7:::
daemon:*::0:0::::
bin:*::0:0::::
sys:*::0:0::::
adm:*::0:0::::
uucp:*::0:0::::
nuucp:*::0:0::::
auth:*::0:0::::
cron:*::0:0::::
listen:*::0:0::::
lp:*::0:0::::
sam:EkdiSECLWPdSa:9740:0:0::::

```

**/etc/group记录用户组信息**

每个用户都属于某个用户组；一个组中可以有多个用户，一个用户也可以属于不同的组。

当一个用户同时是多个组中的成员时，在/etc/passwd文件中记录的是用户所属的主组，也就是登录时所属的默认组，而其他组称为附加组。

用户要访问属于附加组的文件时，必须首先使用newgrp命令使自己成为所要访问的组中的成员。

用户组的所有信息都存放在/etc/group文件中，字段有：

```plain
组名:口令:组标识号:组内用户列表

```

1. "组名"是用户组的名称，由字母或数字构成。与/etc/passwd中的登录名一样，组名不应重复。
2. "口令"字段存放的是用户组加密后的口令字。一般Linux 系统的用户组都没有口令，即这个字段一般为空，或者是*。
3. "组标识号"与用户标识号类似，也是一个整数，被系统内部用来标识组。
4. "组内用户列表"是属于这个组的所有用户的列表，不同用户之间用逗号(,)分隔。这个用户组可能是用户的主组，也可能是附加组。

/etc/group文件的一个例子如下：

```plain
root::0:root
bin::2:root,bin
sys::3:root,uucp
adm::4:root,adm
daemon::5:root,daemon
lp::7:root,lp
users::20:root,sam

```

#### 实操
**先编辑一个文本用户文件**

每一列按照`/etc/passwd`密码文件的格式书写，要注意每个用户的用户名、UID、宿主目录都不可以相同，其中密码栏可以留做空白或输入x号。一个范例文件user.txt内容如下：

```plain
user001::601:100:user:/home/user001:/bin/bash
user002::602:100:user:/home/user002:/bin/bash
user003::603:100:user:/home/user003:/bin/bash
user004::604:100:user:/home/user004:/bin/bash
user005::605:100:user:/home/user005:/bin/bash
user006::606:100:user:/home/user006:/bin/bash

```

**执行**`**/usr/sbin/newusers**`**命令**

需要root权限：

```plain
# newusers 可以执行命令 `vipw` 或 `vi /etc/passwd` 检查 `/etc/passwd` 文件是否已经出现这些用户的数据，并且用户的宿主目录是否已经创建。

**取消**** **`**shadow password**`** ****功能**

将 `/etc/shadow` 产生的 `shadow` 密码解码，然后回写到 `/etc/passwd` 中，并将`/etc/shadow`的`shadow`密码栏删掉。这是为了方便下一步的密码转换工作，即先取消 `shadow password` 功能。

执行`/usr/sbin/pwunconv`命令:

```plain
# pwunconv

```

**编辑每个用户的密码对照文件**

格式为：

```plain
用户名:密码

```

实例文件 `passwd.txt` 内容如下：

```plain
user001:123456
user002:123456
user003:123456
user004:123456
user005:123456
user006:123456

```

**执行**** **`**/usr/sbin/chpasswd**`**命令**

需要root权限：

创建用户密码，`chpasswd` 会将经过 `/usr/bin/passwd` 命令编码过的密码写入 `/etc/passwd` 的密码栏。

```plain
# chpasswd 将密码编码为**** **`**shadow password**`

执行命令 `/usr/sbin/pwconv` 将密码编码为 `shadow password`，并将结果写入 `/etc/shadow`。

```plain
# pwconv

```

这样就完成了大量用户的创建了，之后您可以到/home下检查这些用户宿主目录的权限设置是否都正确，并登录验证用户密码是否正确。

**完整步骤**

先准备好用户文件user和密码文件passwd

然后运行：

```plain
newusers crontab的使用
crontab命令是cron table的简写，它是cron的配置文件，也可以叫它作业列表。

相关配置文件如下：

+ /var/spool/cron/ 目录下存放的是每个用户包括root的crontab任务，每个任务以创建者的名字命名
+ /etc/crontab 这个文件负责调度各种管理和维护任务。
+ /etc/cron.d/ 这个目录用来存放任何要执行的crontab文件或脚本。
+ 还可以把脚本放在/etc/cron.hourly、/etc/cron.daily、/etc/cron.weekly、/etc/cron.monthly目录中，让它每小时/天/星期、月执行一次。

命令格式：

```plain
crontab [ -u user ] { -l | -r | -e }
//省略用户表表示操作当前用户的crontab
    -e      (编辑工作表)
    -l      (列出工作表里的命令)
    -r      (删除工作表)

```

**crontab -e**进入当前用户的工作表编辑，是常见的vim界面。每行是一条命令。

crontab的命令构成为 时间+动作，其时间有**分、时、日、月、周**五种，操作符有

+ ***** 取值范围内的所有数字
+ **/** 每过多少个数字
+ **-** 从X到Z
+ **，**散列数字

基本格式 :

```plain
f1	f2	f3	f4	f5	command
分	时	日	月	周	命令 
第1列表示分钟0～59 每分钟用*或者 */1表示 
第2列表示小时0～23（0表示0点） 
第3列表示日期1～31 
第4列表示月份1～12 
第5列标识号星期0～6（0表示星期天） 
第6列要运行的命令

```

![](https://cdn.nlark.com/yuque/0/2024/jpeg/46412986/1734360090499-927f0e26-d799-42d8-aa74-e96cda4c167a.jpeg)

+ 其中 f1 是表示分钟，f2 表示小时，f3 表示一个月份中的第几日，f4 表示月份，f5 表示一个星期中的第几天。command表示要执行的命令。
+ 当 f1 为 * 时表示每分钟都要执行 program，f2 为 * 时表示每小时都要执行程序，以此类推
+ 当 f1 为 a-b 时表示从第 a 分钟到第 b 分钟这段时间内要执行，f2 为 a-b 时表示从第 a 到第 b 小时都要执行，以此类推
+ 当 f1 为 */n 时表示每 n 分钟个时间间隔执行一次，f2 为 */n 表示每 n 小时个时间间隔执行一次，以此类推
+ 当 f1 为 a, b, c,… 时表示第 a, b, c,… 分钟要执行，f2 为 a, b, c,… 时表示第 a, b, c…个小时要执行，以此类推

在 12 月内, 每天的早上 6 点到 12 点，每隔 3 个小时 0 分钟执行一次 /usr/bin/backup

```plain
0 6-12/3 * 12 * /usr/bin/backup

```

周一到周五每天下午 5:00 寄一封信给 alex@domain.name

```plain
0 17 * * 1-5 mail -s "hi" alex@domain.name 每月每天的午夜 0 点 20 分, 2 点 20 分, 4 点 20 分…执行 echo “haha”

```plain
20 0-23/2 * * * echo "haha"

```

示例1：

```plain
45 4 1,10,22 * * /etc/init.d/smb restart 每月1、10、22日的4 : 45重启smb

10 1 * * 6,0 /etc/init.d/smb restart  每周六、周日的1 : 10重启smb

0,30 18-23 * * * /etc/init.d/smb restart  每天18 : 00至23 : 00之间每隔30分钟重启smb

0 23 * * 6 /etc/init.d/smb restart  每星期六的晚上11 : 00 pm重启smb

* */1 * * * /etc/init.d/smb restart  每一小时重启smb

* 23-7/1 * * * /etc/init.d/smb restart  晚上11点到早上7点之间，每隔一小时重启smb

```

示例2：

```plain
0 */2 * * * /sbin/service httpd restart  每两个小时重启一次apache 

50 7 * * * /sbin/service sshd start  每天7：50开启ssh服务 

50 22 * * * /sbin/service sshd stop  每天22：50关闭ssh服务 

0 0 1,15 * * fsck /home  每月1号和15号检查/home 磁盘 

1 * * * * /home/bruce/backup  每小时的第一分执行 /home/bruce/backup这个文件 

00 03 * * 1-5 find /home "*.xxx" -mtime +4 -exec rm {} \;  每周一至周五3点钟，在目录/home中，查找文件名为*.xxx的文件，并删除4天前的文件。

30 6 */10 * * ls  每月的1、11、21、31日是的6：30执行一次ls命令

```

**环境变量问题：**

有时创建了一个crontab，但是这个任务却无法自动执行，而手动执行这个任务却没有问题，这种情况一般是由于在crontab文件中没有配置环境变量引起的。

所以注意如下3点：

1）脚本中涉及文件路径时写全局路径；

2）脚本执行要用到java或其他环境变量时，通过source命令引入环境变量，如：

```plain
cat start_cbp.sh
#!/bin/sh
source /etc/profile
export RUN_CONF=/home/d139/conf/platform/cbp/cbp_jboss.conf
/usr/local/jboss-4.0.5/bin/run.sh -c mev &

```

3）当手动执行脚本OK，但是crontab死活不执行时，可以尝试在crontab中直接引入环境变量解决问题。如：

```plain
0 * * * * . /etc/profile;/bin/sh /var/www/java/audit_no_count/bin/restart_audit.sh

```



