## 操作系统的发展史
### Unix
+ 1965年之前，电脑只有军事或者学院的研究机构碰的起，当时大型主机至多能提供30台终端（30个键盘、显示器)的连接。
+ 1965年左后由贝尔实验室、麻省理工学院 以及 通用电气共同发起了Multics项目，**想让大型主机支持****300****台终端**
+ 1969年前后这个项目进度缓慢，资金短缺，贝尔实验室退出了研究
+ 1969年从这个项目中退出的Ken Thompson当时在实验室无聊时，为了让一台空闲的电脑上能够运行“星际旅行”游行，在8月份左右趁着其妻子探亲的时间，用了1个月的时间编写出了 Unix操作系统的原型
+ 1970年，美国贝尔实验室的 Ken Thompson，以 BCPL语言 为基础，设计出很简单且很接近硬件的 B语言（取BCPL的首字母），并且他用B语言写了第一个UNIX操作系统。  
因为B语言的跨平台性较差，为了能够在其他的电脑上也能够运行这个非常棒的Unix操作系统，Dennis Ritchie和Ken Thompson 从B语言的基础上准备研究一个更好的语言
+ 1972年，美国贝尔实验室的 Dennis Ritchie在B语言的基础上最终设计出了一种新的语言，他取了BCPL的第二个字母作为这种语言的名字，这就是C语言
+ 1973年初，C语言的主体完成。Thompson和Ritchie迫不及待地开始用它完全重写了现在大名鼎鼎的Unix操作系统

### Minix
因为AT&T(通用电气)的政策改变，在Version 7 Unix推出之后，发布新的使用条款，将UNIX源代码私有化，在大学中不再能使用UNIX源代码。Andrew S. Tanenbaum(塔能鲍姆)教授为了能在课堂上教授学生操作系统运作的实务细节，决定在不使用任何AT&T的源代码前提下，自行开发与UNIX兼容的操作系统，以避免版权上的争议。他以小型UNIX（mini-UNIX）之意，将它称为MINIX。

### Linux
因为Minix只是教学使用，因此功能并不强，因此Torvalds利用GNU的bash当做开发环境，gcc当做编译工具，编写了Linux内核-v0.02，但是一开始Linux并不能兼容Unix，即Unix上跑的应用程序不能在Linux上跑，即应用程序与内核之间的接口不一致，因为Unix是遵循POSIX规范的，因此Torvalds修改了Linux，并遵循POSIX（Portable Operating System Interface，他规范了应用程序与内核的接口规范）； 一开始Linux只适用于386，后来经过全世界的网友的帮助，最终能够兼容多种硬件

### 操作系统的发展
![](https://cdn.nlark.com/yuque/0/2024/gif/46412986/1734360084716-e1b68a38-6191-4d92-b99e-6857bd5577d0.gif)

![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1734360086052-1233f46a-6f81-40a0-b844-d3b697123738.png)  
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1734360086381-43bbed99-398a-431c-abeb-003caa7db0b2.png)

### Minix没有火起来的原因
Minix的创始人说，MINIX 3没有统治世界是源于他在1992年犯下的一个错误，当时他认为BSD必然会一统天下，因为它是一个更稳定和更成熟的系统，其它操作系统难以与之竞争。因此他的MINIX的重心集中在教育上。四名BSD开发者已经成立了一家公司销售BSD系统，他们甚至还有一个有趣的电话号码1-800-ITS-UNIX。然而他们正因为这个电话号码而惹火上身。美国电话电报公司因电话号码而提起诉讼。官司打了三年才解决。在此期间，BSD陷于停滞，而Linux则借此一飞冲天。他的错误在于没有意识官司竟然持续了如此长的时间，以及BSD会因此受到削弱。如果美国电话电报公司没有起诉，Linux永远不会流行起来，BSD将统治世界。

## Linux介绍
### Linux内核&发行版
#### Linux内核版本
内核(kernel)是系统的心脏，是运行程序和管理像磁盘和打印机等硬件设备的核心程序，它提供了一个在裸设备与应用程序间的抽象层。

Linux内核版本又分为稳定版和开发版，两种版本是相互关联，相互循环：

+ 稳定版：具有工业级强度，可以广泛地应用和部署。新的稳定版相对于较旧的只是修正一些bug或加入一些新的驱动程序。
+ 开发版：由于要试验各种解决方案，所以变化很快。

内核源码网址：[http://www.kernel.org](http://www.kernel.org) 所有来自全世界的对Linux源码的修改最终都会汇总到这个网站，由Linus领导的[开源](https://edu.csdn.net/cloud/pm_summit?utm_source=blogglc&spm=1001.2101.3001.7020)社区对其进行甄别和修改最终决定是否进入到Linux主线内核源码中。

#### Linux发行版本
Linux发行版 (也被叫做 GNU/Linux 发行版) 通常包含了包括桌面环境、办公套件、媒体播放器、数据库等应用[软件](https://marketing.csdn.net/p/3127db09a98e0723b83b2914d9256174?pId=2782&utm_source=glcblog&spm=1001.2101.3001.7020)。

目前市面上较知名的发行版有：Ubuntu、RedHat、CentOS、Debian、Fedora、SuSE、OpenSUSE、Arch Linux、SolusOS 等。

![](https://cdn.nlark.com/yuque/0/2024/jpeg/46412986/1734360087768-d18afbcc-1f98-4497-b6d1-f249eebc52c7.jpeg)

### 类Unix系统目录结构
Unix没有盘符这个概念，只有一个根目录/，所有文件都在它下面

![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1734360087768-4bf311fa-d257-4cf4-8175-826feef6150c.png)

### Linux目录
![](https://cdn.nlark.com/yuque/0/2024/jpeg/46412986/1734360087788-8383fb7c-89e0-4dbd-baf7-62980633b59a.jpeg)

+ /：根目录，一般根目录下只存放目录，在Linux下有且只有一个根目录。所有的东西都是从这里开始。当你在终端里输入“/home”，你其实是在告诉电脑，先从/（根目录）开始，再进入到home目录。
+ /bin: /usr/bin: 可执行二进制文件的目录，如常用的命令ls、tar、mv、cat等。
+ /boot：放置linux系统启动时用到的一些文件，如Linux的内核文件：/boot/vmlinuz，系统引导管理器：/boot/grub。
+ /dev：存放linux系统下的设备文件，访问该目录下某个文件，相当于访问某个设备，常用的是挂载光驱 mount /dev/cdrom /mnt。
+ /etc：系统配置文件存放的目录，不建议在此目录下存放可执行文件，重要的配置文件有 /etc/inittab、/etc/fstab、/etc/init.d、/etc/X11、/etc/sysconfig、/etc/xinetd.d。
+ /home：系统默认的用户家目录，新增用户账号时，用户的家目录都存放在此目录下，表示当前用户的家目录，edu 表示用户 edu 的家目录。
+ /lib: /usr/lib: /usr/local/lib：系统使用的函数库的目录，程序在执行过程中，需要调用一些额外的参数时需要函数库的协助。
+ /lost+fount：系统异常产生错误时，会将一些遗失的片段放置于此目录下。
+ /mnt: /media：光盘默认挂载点，通常光盘挂载于 /mnt/cdrom 下，也不一定，可以选择任意位置进行挂载。
+ /opt：给主机额外安装软件所摆放的目录。
+ /proc：此目录的数据都在内存中，如系统核心，外部设备，网络状态，由于数据都存放于内存中，所以不占用磁盘空间，比较重要的目录有 /proc/cpuinfo、/proc/interrupts、/proc/dma、/proc/ioports、/proc/net/* 等。
+ /root：系统管理员root的家目录。
+ /sbin: /usr/sbin: /usr/local/sbin：放置系统管理员使用的可执行命令，如fdisk、shutdown、mount 等。与 /bin 不同的是，这几个目录是给系统管理员 root使用的命令，一般用户只能"查看"而不能设置和使用。
+ /tmp：一般用户或正在执行的程序临时存放文件的目录，任何人都可以访问，重要数据不可放置在此目录下。
+ /srv：服务启动之后需要访问的数据目录，如 www 服务需要访问的网页数据存放在 /srv/www 内。
+ /usr：应用程序存放目录，/usr/bin 存放应用程序，/usr/share 存放共享数据，/usr/lib 存放不能直接运行的，却是许多程序运行所必需的一些函数库文件。/usr/local: 存放软件升级包。/usr/share/doc: 系统说明文件存放目录。/usr/share/man: 程序说明文件存放目录。
+ /var：放置系统执行过程中经常变化的文件，如随时更改的日志文件 /var/log，/var/log/message：所有的登录文件存放目录，/var/spool/mail：邮件存放的目录，/var/run:程序或服务启动后，其PID存放在该目录下。

### 用户目录
位于/home/user，称之为用户工作目录或家目录,表示方式：

```plain
/home/user
~

```

从/目录开始描述的路径为**绝对路径**，如：

```plain
cd /home
ls /usr

```

从当前位置开始描述的路径为**相对路径**，如：

```plain
cd ../../
ls abc/def

```

每个目录下都有**.和…**

. 表示当前目录

… 表示上一级目录，即父目录

根目录下的.和…都表示当前目录

| **文件的颜色** | **含义** |
| :---: | :---: |
| 蓝色 | 目录 |
| 绿色 | 可执行文件 |
| 红色 | 压缩文件 |
| 浅蓝色 | 链接文件 |
| 灰色 | 其他文件 |


## 命令行基本操作
### 命令使用方法
Linux命令格式：

```plain
command  [-options]  [parameter1]  …

```

command: 命令名； [-options]：选项,可用来对命令进行控制，也可以省略，`[]代表可选` parameter1 …：传给命令的参数：可以是零个一个或多个

### 查看帮助文档
#### help
一般是linux命令自带的帮助信息

如：ls --help

#### man(manual)
man是linux提供的一个手册，包含了绝大部分的命令、函数使用说明

该手册分成很多章节（section），使用man时可以指定不同的章节来浏览。

例：man ls ; man 2 printf

man中各个section意义如下：

1. Standard commands（标准命令）
2. System calls（系统调用，如open,write）
3. Library functions（库函数，如printf,fopen）
4. Special devices（设备文件的说明，/dev下各种设备）
5. File formats（文件格式，如passwd）
6. Games and toys（游戏和娱乐）
7. Miscellaneous（杂项、惯例与协定等，例如Linux档案系统、网络协定、ASCII 码；environ全局变量）
8. Administrative Commands（管理员命令，如ifconfig）

man是按照手册的章节号的顺序进行搜索的。

man设置了如下的功能键：

| **功能键** | **功能** |
| :---: | :---: |
| 空格键 | 显示手册页的下一屏 |
| Enter键 | 一次滚动手册页的一行 |
| b | 回滚一屏 |
| f | 前滚一屏 |
| q | 退出man命令 |
| h | 列出所有功能键 |
| /word | 搜索word字符串 |


![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1734360088911-c16445dc-a24d-45d8-89b0-3e4e488238a7.png)

注意：实际上，我们不用指定第几个章节也用查看，如，man ls

### tab键[自动补全](https://so.csdn.net/so/search?q=%E8%87%AA%E5%8A%A8%E8%A1%A5%E5%85%A8&spm=1001.2101.3001.7020)
在敲出命令的前几个字母的同时，按下tab键，系统会自动帮我们补全命令

### history游览历史
当系统执行过一些命令后，可按上下键翻看以前的命令，history将执行过的命令列举出来

history保留了最近执行的命令记录，默认可以保留1000。  
历史清单从0开始编号到最大值。  
常见用法：

```plain
history N		显示最近N条命令
history -c		清除所有的历史记录
history -w  xxx.txt	保存历史记录到文本xxx.txt

```

### 命令行中的ctrl组合键
+ Ctrl+c 结束正在运行的程序
+ Ctrl+d 结束输入或退出shell
+ Ctrl+s 暂停屏幕输出【锁住终端】
+ Ctrl+q 恢复屏幕输出【解锁终端】
+ Ctrl+l 清屏，【是字母L的小写】等同于Clear
+ 当前光标到行首：ctrl+a
+ 当前光标到行尾：ctrl+e
+ 删除当前光标到行首：ctrl+u
+ 删除当前光标到行尾：ctrl+k
+ Ctrl+y 在光标处粘贴剪切的内容
+ Ctrl+r 查找历史命令【输入关键字，就能调出以前执行过的命令】
+ Ctrl+t 调换光标所在处与其之前字符位置，并把光标移到下个字符
+ Ctrl+x+u 撤销操作
+ Ctrl+z 转入后台运行



