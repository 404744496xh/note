
**尚硅谷技术课程系列之Git**
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483243083-d21db399-3764-430c-8cd1-2d1b937b16ec.png#averageHue=%23decac2&id=wxSe2&originHeight=358&originWidth=776&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
**尚硅谷JavaEE教研组**
# 1 ** Git快速入门**
## 1.1 Git概述
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483243397-bb6a8e9a-a766-4b61-a719-ee1e8b00823f.png#averageHue=%23e7e5dc&id=UAELh&originHeight=429&originWidth=1260&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
Git是一个免费的，开源的分布式版本控制系统，可以快速高效地处理从小型或大型的各种项目。Git易于学习，占用空间小，性能快得惊人。
## 1.2 SCM概述
SCM（Software Configuration Management，软件配置管理）是一种标识、组织和控制修改的技术。它应用于整个软件生存周期。
作为评价一个大中型软件开发过程是否正确，合理，有效的重要手段，CMM(Capability Maturity Model )能力成熟度模型提供了不同等级的标准流程，对软件开发过程（流程）进行了约束和建议, 而作为CMM 2级的一个关键域（Key Practice Area，KPA），SCM软件在整个软件的开发活动中占有很重要的位置。
Git软件比Subversion、CVS、Perforce和ClearCase等SCM（Software Configuration Management软件配置管理）工具具有性价比更高的本地分支、方便的暂存区域和多个工作流等功能。
## 1.3 Git安装
### 1.3.1 软件下载
软件官网地址为：[https://git-scm.com/](https://www.oracle.com/java/technologies/downloads/)
软件下载地址为：
[https://github.com/git-for-windows/git/releases/download/v2.40.0.windows.1/Git-2.40.0-64-bit.exe](https://github.com/git-for-windows/git/releases/download/v2.40.0.windows.1/Git-2.40.0-64-bit.exe)![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483243680-74f8f36c-ab3b-409c-a4c4-c2f5240b8d5a.png#averageHue=%23ecebe3&id=C2cgz&originHeight=327&originWidth=1196&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
最早Git是在Linux上开发的，很长一段时间内，Git也只能在Linux和Unix系统上跑。不过，慢慢地有人把它移植到了Windows上。现在，Git可以在Linux、Unix、Mac和Windows这几大平台上正常运行了。由于开发机大多数情况都是windows，所以本教程选择相对简单的Windows系统软件版本进行下载，此处我们下载Windows系统的2.40.0版本软件
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483243919-ac09fffb-0438-48c9-8ef7-cc176afd4792.png#averageHue=%23dbedfc&id=dNyS9&originHeight=28&originWidth=191&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
### 1.3.2 软件安装
Git软件安装的步骤虽然比较多，但是整个安装过程还是比较简单的，双击exe执行文件，按照引导界面的提示安装即可
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483244092-925a20f3-c74c-4b62-b743-1494773e455c.png#averageHue=%23f2f1ef&id=r1TS1&originHeight=323&originWidth=417&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
点击Next下一步，选择安装目录，默认安装在c盘中
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483244293-93f78b55-dcda-4fe9-bb15-41dbb028cc43.png#averageHue=%23f0efef&id=QJ3fk&originHeight=327&originWidth=420&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
点击Next下一步，选择组件，此处默认即可
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483244529-b15b67e7-6a6c-4e36-9cf5-725e9dd82f72.png#averageHue=%23f2f1f0&id=CKsk1&originHeight=327&originWidth=416&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
点击Next下一步，配置启动菜单，此处默认即可
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483244782-81ea5284-45dc-4728-9acc-b7af157d41de.png#averageHue=%23f0efef&id=V3KWC&originHeight=325&originWidth=420&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
点击Next下一步，配置编辑器工具，这里选择自己习惯的编辑工具即可。
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483244977-1f049cb4-fb27-4f58-ad81-6f21c0d6c9b5.png#averageHue=%23f1f0ef&id=ivwwK&originHeight=323&originWidth=425&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
后续就不需要进行什么特殊配置了，所以连续默认选择Next下一步即可。
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483245156-985db84f-db68-4a71-bb4f-f72bb7207be5.png#averageHue=%23eeeceb&id=pH8Zd&originHeight=330&originWidth=427&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)          ![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483245345-7f40106c-3b84-4695-b64e-8927b2cb946a.png#averageHue=%23eceae8&id=btXt7&originHeight=326&originWidth=424&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483245551-6cead61b-964c-4153-9265-b73c2f1134ec.png#averageHue=%23efeeed&id=S3uXu&originHeight=323&originWidth=423&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)          ![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483245831-633ad10a-0987-415d-95bc-cb65968ccf85.png#averageHue=%23eeedec&id=TRtrU&originHeight=329&originWidth=420&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483246032-82883a4b-b8fc-4627-9d8c-fdb86c7d6fd1.png#averageHue=%23eceae8&id=q3IZi&originHeight=327&originWidth=421&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)          ![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483246243-4dd13f52-1ef8-454e-9b1e-934eebf9fb66.png#averageHue=%23eceae8&id=X6lOq&originHeight=324&originWidth=415&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483246416-3adee93d-9939-4896-a67a-90c563b2f61b.png#averageHue=%23eeedec&id=Hv3n4&originHeight=325&originWidth=414&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)          ![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483246647-d08d75f7-8ea9-4053-80b2-3e4ca65650a8.png#averageHue=%23f0efef&id=Br3sF&originHeight=330&originWidth=422&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483246865-9983f72b-eb6d-4bc4-99e6-88081b24b0d0.png#averageHue=%23eeeeed&id=ICGPr&originHeight=322&originWidth=419&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)          ![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483247069-5924faa9-56e7-4e3d-b944-55f56abb0137.png#averageHue=%23eeedec&id=wmIEQ&originHeight=331&originWidth=419&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483247303-973d15aa-b86c-4795-9885-40f27619564c.png#averageHue=%23f0efef&id=aCbFV&originHeight=233&originWidth=303&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)  ![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483247475-24a91cfe-d5c2-49ee-909c-8e62e33bcdd2.png#averageHue=%23f1f0f0&id=Erfhw&originHeight=239&originWidth=305&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)  ![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483247708-98ccfbb6-8d69-48d8-86f7-dc79403806cc.png#averageHue=%23faf9f7&id=YP0Ql&originHeight=238&originWidth=301&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)

### 1.3.3 软件测试
在Windows桌面空白处，点击鼠标右键，弹出右键菜单
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483247946-b2fefa76-a115-4591-936a-93d106f56e1b.png#averageHue=%23e5e5e5&id=ts4uG&originHeight=398&originWidth=305&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
Git软件安装后，会在右键菜单中增加两个菜单

- Git GUI Here
- Git Bash Here

此处仅仅是为了验证Git软件安装的效果，所以选择Git Bash Here菜单, 选择后，Windows系统弹出Git软件的命令行黑窗口，
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483248138-04e44f59-e5ef-4636-afab-7455a214ca8e.png#id=ADPiS&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
窗口弹出后，可以输入Git软件的操作指令。此时我们使用键盘输入操作指令：git -v或 git --version，查看当前Git软件的安装版本。
git -v
git --version
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483248328-f2eaae52-2ecb-4f09-9226-0db54f73da5e.png#id=MelOd&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)      ![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483248531-cdc6ccbb-bb7d-4474-855b-445911fbcf7d.png#id=IjnnD&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
输入指令回车后，如果黑窗口中打印出咱们安装的软件版本2.40.0，Git软件安装成功了。
# 2 ** Git基础使用**
## 2.1 Git基础概念
Git是一个免费的，开源的分布式版本控制软件系统，学习Git软件的具体操作前，我们需要对一些基础的概念和名词进行解释
### 2.1.1 版本控制
一般情况下，一份文件，无论是DOC办公文档，还是编程源码文件，我们都会对文件进行大量的修改和变更。但是我们无法保证每一次的修改和变更都是正确并有效的，往往有的时候需要追溯历史操作，而版本控制（Revision control）是一种在开发的过程中用于管理我们对文件、目录或工程等内容的修改历史，方便查看更改历史记录，备份以便恢复以前的版本的软件工程技术。
没有进行版本控制或者版本控制本身缺乏正确的流程管理，在软件开发过程中将会引入很多问题，如软件代码的一致性、软件内容的冗余、软件过程的事物性、软件开发过程中的并发性、软件源代码的安全性，以及软件的整合等问题。
### 2.1.2 分布式
在Git中，每个版本库都是一样重要得。所以就不存在像集中式版本控制软件中以谁为主得问题。任何一个库都可以当成主库。
这种方式可以更大限度地保证项目资源得安全。
### 2.1.3 系统
一般软件系统指的是可以独立运行的软件应用程序。而Git软件就是专门用于对代码文件进行版本控制得应用程序。同时也提供客户端对系统所管理得资源进行访问。
### 2.1.4 区域
Git软件为了更方便地对文件进行版本控制，根据功能得不同划分了三个区域
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483248723-51671f86-ec74-4b04-a9fb-d5dc941f06fa.png#id=UGS9M&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)

- 存储区域：Git软件用于存储资源得区域。一般指得就是.git文件夹
- 工作区域：Git软件对外提供资源得区域，此区域可人工对资源进行处理。
- 暂存区：Git用于比对存储区域和工作区域得区域。Git根据对比得结果，可以对不同状态得文件执行操作。
## 2.2 Git基础指令
Git软件是免费、开源的。最初Git软件是为辅助 Linux 内核开发的一套软件，所以在使用时，简单常用的linux系统操作指令是可以直接使用的
### 2.2.1 linux系统操作指令
| **指令** | **含义** | **说明** |
| --- | --- | --- |
| cd 目录 | change directory | 改变操作目录 |
| cd .. |  | 退回到上一级目录 |
| pwd | Print work directory | 打印工作目录 |
| ls | list directory contents | 显示当前目录的文件及子文件目录 |
| ll | ls -l 简化版本 | 更详细地显示当前目录的文件及子文件目录 |
| mkdir 文件夹名称 | make directory | 新建一个文件夹 |
| rm 文件 | remove | 删除文件 |
| rm -r 文件夹 | Remove | 删除文件目录 |
| touch 文件 |  | 如果创建的文件不存在，那么创建一个空文件 |
| reset |  | 清屏 |
| clear |  | 清屏 |
| exit |  | 退出终端窗口 |

### 2.2.2 Git软件指令
#### 2.2.2.1 配置信息
作为一个工具软件来讲，一般都会有默认的配置文件来保存基础的配置信息，Git软件的配置文件位置为：**Git安装路径/etc/gitconfig**
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483248925-57672062-8c35-4146-9061-bb5ad1b37e46.png#id=YTSAh&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
默认情况下，我们可以通过指令获取软件的配置信息：
git config -l
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483249168-a775a58c-ce1d-456c-a4a8-1fd301450d9a.png#id=HjIdI&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
#### 2.2.2.2 名称和邮箱
如果你是第一回使用Git软件，需要告诉Git软件你的名称和邮箱，否则是无法将文件纳入到版本库中进行版本管理的。这是因为在多人协作时，不同的用户可能对同一个文件进行操作，所以Git软件必须区分不同用户的操作，区分的方式就是名称和邮箱。
当然了，你可能会说我就用本地库就行了，不需要进行多人协作，是不是就可以不用配置呢。这是不行的，因为Git软件的设计初衷本身就是针对于linux系统的分布式开发协同工作，所以它天生就是用于分布式协同工作的，这里无论你是否使用这个功能，它本身就是这么设计的。所以是一定要配置的，否则就会出现如下提示：
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483249359-bd644ef8-3ad1-4aff-9142-7f296dac19f6.png#id=e5P6o&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
当然了，配置的过程并不复杂，输入相关指令即可
git config --global user.name test
git config --global user.email test@atguigu.com
这里的--global表示全局配置，后续的所有文件操作都会使用该用户名称及邮箱。此时在操作系统的用户目录，会产生新的配置文件
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483249535-01e0503b-2f5a-40b4-a599-9bb200dbbea0.png#id=qIsyZ&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
文件中就包含了刚刚增加的配置信息
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483249734-a07ff0af-5127-438e-acb0-fed01f283834.png#id=JYWZc&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
#### 2.2.2.3 初始化版本库
Git软件主要用于管理文件的版本信息，但它只是一个软件，不可能安装后就直接将系统中所有的文件全部纳入到它的管理范畴中。并且，软件管理版本信息的主要目就是管理文件的修改和变更，如果将系统中所有文件都进行管理其实意义是不大的。所以一般情况下，我们需要指定某一个文件目录作为软件的管理目录。因为这个目录主要就作为Git软件的管理文件的版本变化信息，所以这个目录也称之为Git软件的版本仓库目录。
具体操作过程如下：

- 我们首先通过指令进入到指定文件目录

![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483250014-3a5bb4e2-7103-4dd6-a203-1e9f22a668cb.png#id=sjfP7&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)

- 执行指定的指令，创建文件版本库

git init
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483250221-547577cd-dad0-4b38-b773-d4bd29b6d6eb.png#id=ZfXFt&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)

- 版本库创建成功后，会在目录中创建.git目录，用于管理当前版本库。

![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483250419-3d219bf7-9a3e-4301-aa40-f626f57386d7.png#id=vBV6u&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
#### 2.2.2.4 向版本库中添加文件
虽然创建了版本库，但是现在版本库中还没有任何的文件，所以这里我们先手动创建文件：test.txt
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483250615-1cc7a5c3-cc5f-4e2c-a502-9e5320829502.png#id=YYYb6&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
因为文件已经放置在版本库中了。所以可以通过软件的指令查看版本库状态
git status
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483250790-65f70f74-6ea0-40dc-a6a7-3dc681f94cb0.png#id=pP1mF&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
此时会发现，test.txt文件属于untracked files（未追踪文件）,这里表示当前的test.txt文件虽然放置到了版本库的文件目录中，被Git软件识别到了，但是未纳入到版本库管理中。所以属于未追踪文件。通过这个现象可以认为，系统文件夹物理目录和版本库管理目录的含义是不一样的。只有文件被纳入到版本库管理后，Git软件才能对文件修改后的不同版本内容进行追踪处理，也就是所谓的tracked files了。那么如何将文件纳入到版本库的管理呢，这就需要我们执行以下命令了：
#这里的文件是需要提供扩展名的
git add test.txt
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483251002-7782b45a-8896-4c8b-9522-b47db64a8ffc.png#id=sqMEb&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
此时你再查看版本库状态，就会发现文件状态的变化。
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483251218-53ac7385-9af8-4eed-87ce-74c6d34d7695.png#id=H76gB&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
你会发现，此时文件状态为cached file，这是什么意思呢？其实这也是Git管理文件时的一种状态：暂存状态。就是我们生活中常说的草稿状态。也就是说对于Git来讲，它认为此时文件只是一种临时草稿状态，随时可能会进行修改或删除，并不算真正的操作完成状态。所以并不会把文件纳入到版本库管理中。
为什么会这样呢？其实这就涉及到版本的作用。生活中，我们学习时，一般会写学习笔记，虽然写完后不一定会看，但是该写的还是要写的。然后给这些笔记文件起名时，一般就会带着当天的时间或数字。比如【Java学习笔记_20220101.md】，或者【Java学习笔记_Ver1.1.md】，这里的时间或数字主要作用就是用于区分同一份笔记在不同时间节点记录的内容，这里的数字或时间我们就称之为版本。
那如果你只是随便写写，或写到一半，还没有写完的话，会专门给文件改个名称吗？应该不会，对不对，因为对于你来讲，这个笔记文件并没有记录完成，对吗。但是你非得说，你今天不想继续学习了，然后给文件改了一个名称，也不是不可以。对于Git软件来讲，道理是一样的。如果确定要把文件放置在版本库中，那么就需要执行确定提交指令
# commit表示真正地纳入到版本库中
# -m 表示提交时的信息（message），是必须输入的。用于描述不同版本之间的差别信息
git commit -m "my first git file"
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483251408-5db528f5-7203-4ebe-918e-c80259aeef85.png#id=bmCHS&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
再查看Git状态
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483251613-976a217f-2588-466e-9778-766d5b1d8cbc.png#id=HnYJ5&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
提交后，Git会对当前的操作进行Hash计算，通过计算后的值将数据保存下来，保存的位置为版本库.git文件目录的objects中，我们可以通过指令查看当前提交
git show
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483251814-ca872868-545f-45ef-a392-37b500b461be.png#id=rTxOw&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483252019-3a6e07fb-0efe-44cc-8a95-122c96a0cd05.png#id=vTymA&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
由于文件内容进行了转换处理，直接打开你是看不懂的
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483252205-a0ec92de-7c8d-40c3-b19c-54be4d46009b.png#id=LqEto&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
#### 2.2.2.5 修改版本库文件
现在文件已经被纳入到版本库中，因为咱们的文件是空的，所以这里我们增加一些内容
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483252478-ea57c399-b685-4798-9cb9-1dc78f8b011a.png#id=pCUe4&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
此时，Git版本库中的文件和本地的文件就有了不同。我们可以查看状态
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483252701-4675e2fe-4da7-447d-b02d-d3d10e5d078d.png#id=cvb04&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
**modified**表示文件已经修改了，我们可以把这一次的修改提交到版本库中
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483252932-efe97ef5-0be7-4445-94cd-e978c9b6e68b.png#id=HlS4f&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
原则上来讲，这里的操作顺序依然应该是
# 先增加，再提交
git add test.txt
git commit
但是这里我们简化了一下操作
git commit -a -m "update file"
这个指令操作中多了一个**-a**的参数，等同于将增加，提交两步操作融合成了一步。
提交成功后，我们来展示以下当前Git软件库
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483253136-44b2275a-209f-42eb-8184-2659f630454f.png#id=Fv5n7&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
#### 2.2.2.6 查看版本库文件历史
版本库中的文件我们已经修改并提交了，那么文件的版本信息就会发生变化，那我们如何来查看这个变化呢？这里我们可以采用log指令进行查看
git log

![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483253361-e5b439be-ee6b-41de-99ed-3bdf0e7c3251.png#id=oZz9m&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
如果感觉看着不舒服，也可以美化一下显示方式:
git log --pretty=oneline
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483253608-3596c22d-45be-4e55-b64d-465e74dcbd6e.png#id=XJRkG&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
也可以使用简单方式查看
git log --oneline
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483253780-f6aa438c-018a-47a6-8d2a-abf663e5900c.png#id=p7Xb5&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
#### 2.2.2.7 删除文件
一般情况下，Git软件就是用于管理文件的版本变更，但是在一些特殊的场景中，文件可能作废或不再使用，那么就需要从版本库中删除，记住，这里说的并不是从物理文件目录中删除，而是从版本库中删除。

- 将本地文件从目录中删除

![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483253973-98a333f5-7076-4e2a-a82e-dfce6a48eed1.png#id=Tf7p8&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)

- 查看Git版本库状态信息

![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483254170-c852dd71-db79-4c8c-b07c-be0da35fc333.png#id=rZP8z&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
此时Git软件会识别出来，版本库中有一份文件和当前用于临时操作文件的暂存区内的文件状态不一致：版本库中文件还在，但是操作区内的文件已经没有了。所以软件提供了两个选择：一个是将版本库中的文件也进行（提交）删除操作。另外一个就是从版本库中恢复文件。

- 使用指令从版本库中恢复文件

git restore test.txt
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483254403-baa2d95b-7f56-4710-94f1-c981022869af.png#id=kUorP&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483254582-e81ad386-09e6-4c52-8fcd-bded3e6756bc.png#id=JuYgB&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)

- 如果想要真正删除文件，那么也要将版本库中同时删除

![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483254766-fd7ea7e6-3a73-4b26-b616-f70061609fe7.png#id=IGlku&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483254945-04c76079-55df-4ce0-9f1f-afebe1d64f28.png#id=C5v3R&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
此时查看Git日志
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483255151-4a303e06-6a1f-4013-9555-00eb3488170a.png#id=Vxy8U&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
#### 2.2.2.8 恢复历史文件
如果版本库中一份文件中已经被删除了，那么此时这份文件还能找回来吗？其实原则上来讲，已经不行了，因为文件删除本身也是一种变更操作，也算是版本库管理的一部分。所以想要将已经删除的那份文件从版本库中取出来，已经是不可能了。但是，要注意的是，版本库管理的是文件不同版本的变更操作，这个不同版本的概念还是非常重要的。也就是说，最后的那个删除的文件版本已经没有了，但是之前版本的文件其实还是存在的。所以如果我们能将文件恢复到某一个版本，那么那个版本的文件就依然存在。

- 查看版本库信息

![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483255337-9aaff7db-92ad-4f23-80f5-9637cd98afb5.png#id=yRuE6&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)

- 将版本库文件重置到某一个版本

# 这里的f2f113f就是版本Hash值，用于唯一确定版本库中此版本的标记
# 当然了这是一个简短版，完整的比较长
# 如果不记得具体的版本值，版本值也可以使用HEAD值，比如最新的上一个版本：HEAD^
# 如果后退更多的版本,可以使用 HEAD~N
git reset --hard f2f113f
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483255536-ab4cec82-e75c-4e93-b88b-2a172c473368.png#id=l9tFw&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)

- 被删除的文件回来了

![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483255743-7f985315-9426-49c8-a7b1-e90f102e2a99.png#id=ASyYC&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
# 3 ** Git进阶使用**
在之前的操作中，所有的操作都是基于一条主线完成的。就好比，咱们学习的时候，记学习笔记，今天学点，那么就写一点，明天学点，再写一点，最后，完全学完了，这个笔记也就记全了。但实际上，有些文件可能再不同的场合需要同时使用不同的内容，而且还不能冲突，比如项目的配置文件，我需要本地进行测试，同时还要部署到服务器上进行测试。本地和服务器上的环境是不一样的，所以同一个配置文件就需要根据环境的不同，进行不同的修改。本地环境没问题了，修改配置文件，提交到服务器上进行测试，如果测试有问题，再修改为本地环境，重新测试，没问题了，再修改为服务器配置，然后提交到服务器上进行测试。依次类推，形成迭代式开发测试。
从上面的描述上看，就会显得非常繁琐，而且本质上并没有太重要的内容，仅仅是因为环境上的变化，就需要重新修改，所以如果将本地测试环境和服务器测试环境区分开，分别进行文件版本维护，是不是就会显得更合理一些。这个操作，在Git软件中，我们称之为branch，分支。
这里的分支感觉上就是树上的分叉一样，会按照不同的路线生长下去。有可能以后不再相交，当然，也可能以后会不断地纠缠下去，都是有可能的。
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483255895-4bcd1949-d61b-480b-b3db-addaa4bb7d94.png#id=jnm6s&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
## 3.1 Git分支
### 3.1.1 主干分支
默认情况下，Git软件就存在分支的概念，而且就是一个分支，称之为master分支，也称之为主干分支。
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483256101-519a44d1-7cb4-438d-9869-5c973e38ef58.png#id=fuQUM&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
这就意味着，所有文件的版本管理操作都是在master这一个分支路线上进行完成的。
不过奇怪的是，为什么之前的操作没有体现这个概念呢，那是因为，默认的所有操作本身就都是基于master分支完成的。而master主干分支在创建版本库时，也就是git init时默认就会创建。
### 3.1.2 其他分支
就像之前说的，如果仅仅是一个分支，在某些情况并不能满足实际的需求，那么就需要创建多个不同的分支。
#### 3.1.2.1 创建分支
**# git branch 分支名称**
git branch b1
git branch b2
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483256321-e09ac1aa-4ccd-423d-a5cb-fb161950b888.png#id=BygNS&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
现在我们创建了2个分支，不过这两个分支都是基于master主干分支为基础的。
#### 3.1.2.2 查看分支
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483256531-50687131-3eb2-46f4-883c-e463b1798c5f.png#id=N2YlJ&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
#### 3.1.2.3 切换分支
我们将工作线路切换到b1
**# git checkout 分支名称**
git checkout b1
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483256838-818fa59a-6945-400b-b804-43a11e98443d.png#id=lISpG&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
此时我们添加新的文件b1.txt
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483257049-3f79e69b-5c01-4008-885c-c88a0fd1691a.png#id=NtQ1r&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
然后提交到版本库
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483257310-bca23d54-9a98-44f3-821c-65a7a2a6d55d.png#id=pHwOJ&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
此时，查看分支信息，会发现不同分支的版本进度信息发生了改变
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483257514-382e0905-d9f7-4af1-8ccb-8334321d86c2.png#id=UDcu2&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
如果此时切换回到主干分支的话，那么b1.txt文件就不存在了，因为对应版本信息不一样。
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483257741-cb8bbd07-ce54-4409-bbaa-cb8fecb17efc.png#id=f6com&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483257951-e9d5e443-5147-47e9-978f-a35cfc0338fc.png#id=Z0Kl1&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
#### 3.1.2.4 删除分支
如果觉得某一个分支建立的不太理想或已经没有必要在使用了，那么是可以将这个分支删除的。
**# git branch -d 分支名称**
Git branch -d b2
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483258148-8a35caa3-0c52-4281-96c9-32eef6d601b9.png#id=UBNYt&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483258459-e9f939a6-653c-4a61-95e3-4c7e4917f649.png#id=CKIz9&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
## 3.2 Git合并
无论我们创建多少个分支，都是因为我们需要在不同的工作环境中进行工作，但是，最后都应该将所有的分支合在一起。形成一个整体。作为项目的最终结果。
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483258652-e984d94a-dcdd-4d59-a5da-b0edf66f31f3.png#id=fsPqH&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
### 3.2.1 主干分支
首先我们先将主干分支的所有文件清空掉
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483258949-7ed9828e-e254-43bb-baac-3871c1147316.png#id=wdqpQ&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
在当前主干分支中创建一份文件master.txt，并提交
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483259114-1c24e55e-654a-4edf-b85b-bc200506fd57.png#id=bImAU&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
### 3.2.2 其他分支
基于主干分支的内容，我们创建其他分支，并直接切换到新的分支
**# git checkout -b 分支名称**
git checkout -b new_branch
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483259391-5eef7236-ee9a-456f-bd24-b3186a3930b2.png#id=NM71j&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
在新的分支中添加新文件branch.txt
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483259599-112a5e01-3fe4-4e27-acbd-197e31597015.png#id=EA1vE&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
此时切换回主干分支，只有master.txt文件。
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483259817-84457725-9253-4cd0-b86b-3f3b84fa0c6f.png#id=xFhIa&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
再切换回new_branch分支，branch文件就又回来了。
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483260079-f7501489-f2bd-4825-9b5b-ab5c08be2b65.png#id=s0W3w&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
### 3.2.3 合并分支
这里我们将new_branch分支的文件内容合并到主干分支中。首先先切换回主干分支
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483260316-0ceee8fd-59cc-4802-b789-1afc38daa301.png#id=zUYBS&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
然后执行分支合并指令
**# git merge 分支名称**
git merge new_branch
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483260565-58b27a58-500b-4922-90c0-5b60116523c5.png#id=IVSo0&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
此时再次查看文件，就会发现branch.txt文件已经可以看到了。
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483260838-6fbde269-5661-4321-85d4-b763aff1347a.png#id=YJ2Fa&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
## 3.3 Git冲突
在多分支并行处理时，每一个分支可能是基于不同版本的主干分支创建的。如果每隔分支都独立运行而不进行合并，就没有问题，但是如果在后续操作过程中进行合并的话，就有可能产生冲突。比如B1, B2的两个分支都是基于master分支创建出来的。B1分支如果和B2分支修改了同一份文件的话，那么在合并时，以哪一个文件为准呢，这就是所谓的冲突。
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483261070-50c9db15-e79a-4124-afa0-425b6de76481.png#id=NINKs&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
接下来，咱们就演示一下。
### 3.3.1 主干分支
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483261313-5598dce2-175d-4787-940d-d98b3b0f8a61.png#id=i0oL6&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
首先我们先将主干分支的所有文件清空掉
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483261510-70cb112c-44e3-40c7-af12-12bc9611f14e.png#id=dF7GS&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
主干分支添加文件test.txt，文件内容为空
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483261683-a983e151-b916-4f6f-b715-136f5fbd21ac.png#id=cjsuU&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483261930-f2695f32-0c96-4669-8d8c-3052892562f3.png#id=VzirJ&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
### 3.3.2 其他分支
基于主干分支，创建两个分支B1, B2
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483262127-aa67c3f1-3d59-4e3b-9a5d-3ff51d3c63c9.png#id=f92g7&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483262304-cfcc3a20-ef91-48d2-aec6-7af17819a0a9.png#id=ChYmN&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
### 3.3.3 切换分支-B1
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483262502-1ffda2e6-dd86-4c79-a9e2-e5feff89104a.png#id=rqCrx&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
切换到B1分支，修改文件内容
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483262727-1b18a415-422e-4e75-8e26-f4ac0d89d99e.png#id=sb6QK&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483262945-a50ddd5b-d610-4376-a0b9-bbc5f43120d2.png#id=KTzvr&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
提交修改后的文件
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483263142-e040b7e0-3cc2-4de9-baab-ddae7814901e.png#id=ncIhN&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
### 3.3.4 切换分支-B2
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483263340-1eb2b791-28a0-40d2-a9da-e5d61c013d95.png#id=taebf&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
切换到B2分支，查看文件内容
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483263515-f3591352-3cde-4855-a2cd-9d93af142a36.png#id=NpOLn&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483263677-1a02793b-7b21-4a8f-9bbd-51667c5d04e2.png#id=NrPwO&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
修改文件内容：
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483263916-5f44750d-d6a4-4c55-a1c0-8c7d00f81c36.png#id=w6SzM&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
提交文件
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483264099-a36d236d-b9aa-4894-a0be-20a29edb72a4.png#id=Prjl5&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
### 3.3.5 合并分支-B1
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483264365-b976cc08-2385-4840-862a-365b1e164e79.png#id=z9pqz&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
切换到master主干分支，此时test.txt文件内容为空
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483264574-d262a584-dbd4-4999-9daa-7befafb34e2f.png#id=baoeT&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
将B1分支合并到主干分支中
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483264750-82831f66-1a5e-4103-9985-c52efb16aec2.png#id=HfgPN&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
### 3.3.6 合并分支-B2
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483265003-cc451b4d-f360-433e-8580-ffe2f7e9f9cf.png#id=BX8nv&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
因为B2分支也对文件进行了修改，所以如果此时合并B2分支,就会提示冲突
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483265216-8c62624d-624d-46a6-af9f-ae0c7dcbcb2e.png#id=avvg9&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
查看文件内容差异
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483265446-19cfe5f5-a0f2-458b-9b2f-0a181e66b519.png#id=y7ygY&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483265657-e0331e6b-b008-457c-9bb5-f786125448c0.png#id=BSZDm&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
这里的冲突，软件是无法判断该如何出来处理的，所以需要人工进行判断，将冲突的文件内容进行修正。
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483265902-91ee324d-6197-47d4-934f-3d0120ce7b2d.png#id=HAjxP&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
重新提交到master主干分支中。
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483266119-f5ebe571-5fb0-4a5b-ba74-8c7196edb11e.png#id=JkO6H&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
**# git commit 文件名称 -i -m 注释**
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483266308-3ffa8602-68e9-49d1-844a-5572df8deb49.png#id=j7HC0&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
再查看一下Git软件的操作日志
**# git log --graph**
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483266470-6b67e110-13c7-460c-8f00-14445034e061.png#id=CwKzS&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483266667-eb14d754-0d62-4845-8c5d-03563ed0a9c5.png#id=pLikx&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
# 4 ** Git服务器集成**
## 4.1 Git远程服务器
在之前的操作中，所有的操作都是基于本地机器完成的。如果在公司中，一个项目是共用一个版本库的。那么所有的开发人员都应该对同一个版本库进行操作。因为Git软件本身就是用于Linux系统开发所设计的版本管理软件，所以项目中搭建的共享版本库也应该以linux系统为主。那么接下来，咱们就演示一下在CentsOS服务器中搭建Git服务器。
### 4.1.1 下载Git软件（linux版本）
官网下载地址：[https://mirrors.edge.kernel.org/pub/software/scm/git/git-2.38.1.tar.gz](https://mirrors.edge.kernel.org/pub/software/scm/git/git-2.38.1.tar.gz)
将下载后的压缩文件上传到Linux系统中
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483266878-209fc2a8-b868-4ee8-b610-c2879acfcc3e.png#id=eINES&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
### 4.1.2 安装Git软件
#### 4.1.2.1 解压Git
# 将压缩文件解压到自定义位置
tar -zxvf git-2.38.1.tar.gz -C **/opt/module/**
# 可以更改名字，变得简短一些，好操作
cd /opt/module
mv git-2.38.1/ git 
#### 4.1.2.2 安装依赖
解压后，我们需要编译源码，不过在此之前需要安装编译所需要的依赖，耐心等待安装完成，中途出现提示的时候输入y并按回车。
# 
yum install curl-devel expat-devel gettext-devel openssl-devel zlib-devel gcc perl-ExtUtils-MakeMaker

![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483267064-dd9624cb-f133-41f3-a3c1-f1376d721d89.png#id=m0Uzy&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
#### 4.1.2.3 删除旧版Git
安装编译源码所需依赖的时候，yum操作回自动安装旧版本的Git。
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483267285-f2ad7b55-1e9b-4229-96ba-37fdfbf413bf.png#id=tnzbK&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
我们这里需要卸载这个旧版的Git
# 删除旧版本的Git
yum -y remove git
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483267492-bfdd8a65-23b0-44c8-8b08-593de789c67e.png#id=ZqhaZ&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
#### 4.1.2.4 编译、安装Git
# 进入到Git软件的解压目录
cd /opt/module/git
# 编译时，prefix设定为Git软件安装目录
make prefix=/usr/local/git all
# 安装Git
make prefix=/usr/local/git install
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483267648-c1632c27-1706-406c-b9d3-12a8fa9118b6.png#id=gyELY&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
#### 4.1.2.5 配置环境变量
修改linux系统中/etc/profile文件，配置环境变量
# 配置环境变量
export PATH=$PATH:/usr/local/git/bin
# 刷新环境，让环境变量立即生效
source /etc/profile
#### 4.1.2.6 建立链接文件
# git安装路径是/usr/local/git，不是默认路径
ln -s /usr/local/git/bin/git-upload-pack /usr/bin/git-upload-pack
ln -s /usr/local/git/bin/git-receive-pack /usr/bin/git-receive-pack
#### 4.1.2.7 测试安装
# 获取git软件版本
git --version
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483267813-700da433-3857-45e4-9304-e493be2397a3.png#id=v8wxL&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
### 4.1.3 创建Git用户
因为Git服务器需要安装在linux系统上，当使用远程客户端操作时，就需要提供相应的Git账号进行提交的，如果你的仓库文件的用户不是git的话，是root用户或者别的用户，那么你git push ,它是不允许的，因为你的git用户没有权限。你可以给这个文件创立git用户，或者修改文件夹的权限让所有用户都可以更改
# 增加用户
adduser git
# 设定密码
passwd git
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483268035-07a8753e-a081-4683-9350-60c45076c6b2.png#id=BeutR&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
### 4.1.4 SSH免密登录
#### 4.1.4.1 服务器端操作
# 进入用户目录
cd /home/git
# 在git用户根目录创建.ssh目录
sudo mkdir .ssh
sudo touch .ssh/authorized_keys
# 设定.ssh目录，authorized_keys的权限
sudo chmod -R 700 /home/git/.ssh
sudo chmod 600 /home/git/.ssh/authorized_keys
#### 4.1.4.2 客户端端操作
# 在客户端生成SSH密钥
# 默认生成的密钥用户就是当前用户，需要和之前的全局配置保持一致
user.name=18801@LAPTOP-J9IRK5BM
user.email=18801@LAPTOP-J9IRK5BM
# 按照提示三次回车即可
ssh-keygen -t rsa
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483268199-3ec6e0db-adff-4dc9-a37d-7d434200402d.png#id=a7uzu&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
在用户根目录的.ssh文件夹内，id_rsa.pub就是我们要的公钥
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483268399-f9b63527-df37-4335-ae0b-fecf0f69cc3b.png#id=eFfdc&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
将文件中的内容复制到服务器端的.ssh/authorized_keys文件中
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483268585-5a95b59d-1671-448f-aa33-7f8623e8153a.png#id=L4Lf2&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
### 4.1.5 创建Git版本库
#### 4.1.5.1 创建文件目录
# 进入用户目录
cd /home/git
# 创建版本库目录
mkdir git-rep 
# 设定文件所属用户
sudo chown git:git git-rep
#### 4.1.5.2 初始化版本库
# 进入仓库目录
cd /home/git/git-rep
# 初始化仓库，和前面的git init略有不同
git init -bare test.git
# 设定文件所属用户
sudo chown -R git:git test.git
### 4.1.6 远程访问Git版本库
#### 4.1.6.1 将远程仓库克隆到本地
# 将远程仓库克隆到本地，形成本地仓库
# 克隆远程仓库 => 用户@主机名:仓库地址
git clone git@linux1:/home/git/git-rep/test.git
#### 4.1.6.2 提交文件到本地仓库
# 增加文件
git add client.txt
# 提交文件
git commit -m 'client'
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483268747-e547fbe3-7610-43ef-80a4-9b97e443441c.png#id=utTJX&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
#### 4.1.6.3 将本地仓库同步到远程仓库
# 同步远程仓库
# 远程仓库默认有个别名叫origin，将本地仓库的文件推送（push）到远程仓库
**# git push 远程仓库别名 分支名称**
git push origin master
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483268953-4837ed3e-365e-4146-a50e-9254299ec6d8.png#id=BbAHZ&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
#### 4.1.6.4 查看远程仓库
# 服务器端切换用户
su git
# 进入仓库
cd /home/git/git-rep/test.git
# 切换到主干分支
git checkout master
# 查看git日志
git log 
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483269168-8c2f291b-5d65-4793-8d4c-c8e834a73748.png#id=fbTiw&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
## 4.2 GitHub服务器
公司中，我们可以搭建中央服务器让项目组开发人员共享代码，但是如果我们的开发人员都是通过互联网进行协作，而不是在同一个地方，那么开发时，程序文件代码的版本管理就显得更加重要，这就需要搭建一个互联网的版本库，让不同地点的人都可以进行访问。这里我们不用自己搭建。因为GitHub网站已经帮助我们提供了共享版本库功能。所以我们接下来就讲解一下，如何使用GitHub网站所提供的功能使用Git。
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483269458-12908599-ef8b-460e-965d-a6c8fdbec287.png#id=C29Gn&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
### 4.2.1 注册网站会员
GitHub官网地址：[https://github.com/](https://github.com/)
填写你的邮箱地址和密码，姓名
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483269741-3ce5e59e-1ec5-4dfa-bf6f-15ad1dc77fb5.png#id=UTgUY&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
一顿操作，注册完毕后，进入你的主页
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483269991-2d411ec8-aa94-41d6-a5ca-dbf82552dea4.png#id=OGxqE&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
### 4.2.2 创建新的仓库
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483270347-fc439533-3bb5-46dd-a651-44d8d37cce0c.png#id=maGtL&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
输入仓库的相关信息
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483270599-3514c525-e11b-402e-b193-a83fd807779c.png#id=HzHEl&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483270865-b2ee2ee5-3818-4aa4-b13f-7f538bcb58ee.png#id=s2Ycs&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
点击创建按钮，创建新的仓库。
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483271114-061b6f09-55fe-4601-a811-105da190ca1b.png#id=uUvx4&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
### 4.2.3 本地仓库的基本操作指令
**# create a new repository on the command line**
echo "# git-study" >> README.md
git init
git add README.md
git commit -m "first commit"
git branch -M main
git remote add origin git@github.com:Aitiger-coffee/git-study.git
git push -u origin main
**# push an existing repository from the command line**
git remote add origin git@github.com:Aitiger-coffee/git-study.git
git branch -M main
git push -u origin main
### 4.2.4 SSH免密操作
github支持两种同步方式“https”和“ssh”。如果使用https很简单基本不需要配置就可以使用，但是每次提交代码和下载代码时都需要输入用户名和密码。ssh模式比https模式的一个重要好处就是，每次push、pull、fetch等操作时，不用重复填写遍用户名密码。前提是你必须是这个项目的拥有者或者合作者，且配好了ssh key。
#### 4.2.4.1 本地生成SSH密钥
**# ssh-keygen -t rsa -C GitHub账号**
ssh-keygen -t rsa -C 15811009164@163.com
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483271311-3bea5452-2b0c-47bd-8d31-63d049613052.png#id=bQ33N&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
#### 4.2.4.2 集成用户公钥
执行命令完成后,在window本地用户.ssh目录C:\Users\用户名\.ssh下面生成如下名称的公钥和私钥:
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483271489-ac703f76-c81e-41bf-bfc6-cb2227875f73.png#id=ok8Lc&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
按照操作步骤，将id_rsa.pub文件内容复制到GitHub仓库中
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483271725-2fbd70f7-d686-44fb-8d78-bc2ea540c439.png#id=Ca0js&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483271962-38d250ea-a8e4-40f5-9418-a2c8b652fef3.png#id=J1tr2&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
点击Add按钮，增加SSH公钥信息
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483272192-c4a69832-b8fd-4833-b077-6c1a44f7b7f6.png#id=M2PkF&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
### 4.2.5 设定全局用户
git config --global user.name '15811009164'
# 这里的邮箱地址需要为GitHub网站的注册账号
git config --global user.email '15811009164@163.com'
### 4.2.6 创建本地库以远程地址
# 初始化本地仓库
git init
# 设置远程仓库
git remote add origin git@github.com:Aitiger-coffee/git-study.git
### 4.2.7 新增，提交本地仓库文件
# 新增文件
git add test.txt
# 提交文件
git commit test.txt
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483272380-45004d8a-77a6-46b3-a76c-d6c46ba62683.png#id=wRqvk&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
### 4.2.8 推送到GitHub远程仓库
# 推送文件
git push origin master
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483272583-d3c14c53-cd4e-4b12-868e-eca242d44e53.png#id=LLNV4&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
### 4.2.9 查看GitHub远程仓库
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483272773-4f19a52f-a2d8-42ed-a6f5-90b55fb69f2d.png#id=lPKR6&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)

### 4.2.10 增加合作伙伴
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483273037-7995588d-43b0-4ddb-a457-135c5e6a9d99.png#id=KVyor&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
选择合作账号,发出合作申请
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483273323-6a78fe6f-3d66-4911-9a45-a8b9e3f8c3f5.png#id=WcKq5&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
### 4.2.11 合作伙伴确认
合作伙伴收到确认后，点击Join按钮继续
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483273506-6cbc07ec-aa00-418a-88eb-382e071b5509.png#id=wvywj&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
点击Accept Invitation按钮，进行确认
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483273711-f7fdaabb-8fe5-423a-8f53-7acccb25a7c6.png#id=K189Q&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
此时已经可以合作开发了。
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483273953-db818d99-37dd-4b65-91fa-5868c41aa2fd.png#id=lib1D&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
### 4.2.12 远程仓库fork操作
如果项目存在大量合作伙伴，对于版本库的管理明显是一个特别大的风险，所以如果不想要选择大量的合作伙伴，但依然有人想要对项目代码进行维护，更新和扩展的话，此时，我们就可以使用fork功能。
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483274178-b387573e-cafa-441a-838b-6b53527f4812.png#id=nau5L&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483274396-a254a860-61fb-42d1-aef7-07d47c26b31a.png#id=VBk5r&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
点击Create fork按钮即可
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483274610-53c2b73a-a945-4c73-8da8-bdb28cd72c38.png#id=D41Re&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
这样就等同于创建了一个自己的远程仓库。但是这个远程仓库等同于是一个分支远程仓库，你可以随便操作，并不会影响源仓库，但是如果你的修改，更新想要融合到源仓库中，就需要提交申请了。

- 我们这里首先将文件改一下。

![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483274876-48d7dfd4-702a-4bc2-bffe-bf8bbb4166de.png#id=teaBN&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483275117-36d8ebfa-fdec-4c45-b413-74f5e2441f27.png#id=li9VF&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)

- 发送提交申请

![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483275320-035e8f5b-c055-48f7-979e-4bdca77f02e6.png#id=Sn3rG&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483275528-4e9810e5-a3e2-444e-b56a-b5ce972dfc4b.png#id=mj8rA&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483275725-cb302cb6-6393-4b43-8e0c-0c92197399a9.png#id=oU9I2&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)

- 合并修改请求

![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483275984-d9e180a7-e4a5-4f93-88db-478314f0c446.png#id=MIUdK&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483276218-58913e59-0954-4b03-bc5a-4b075b23bf49.png#id=zQSFl&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483276570-5c552739-0d78-4817-ad83-bbc5c7cb6707.png#id=ABqxz&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483276818-8a92034f-a6ad-4e67-9c33-8f5387d5bf32.png#id=i6UYS&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)

- 修改请求确认

![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483277085-34dd96be-17cd-4d76-b5d9-f9ec9f38f65a.png#id=QHkpJ&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
## 4.3 IDEA集成GitHub
实际的开发中，代码都是采用IDE进行开发，所以我们这里介绍一下IDEA软件是如何集成GitHub远程仓库进行代码版本控制的。这里采用的IDEA版本为2022.2.1,其他版本的IDEA软件会略有差别
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483277265-7d4f889e-0ae0-42ad-a78b-6f7fa10ffc20.png#id=mDuTw&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
### 4.3.1 配置Git软件
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483277514-35ba729e-2571-4180-b898-c1ca96b385dd.png#id=fTJvF&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
### 4.3.2 配置GitHub账号
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483277740-fb742709-2005-4581-9b2f-f892aa4c87d4.png#id=PGNGq&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
继续点授权按钮
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483277971-9fb1a112-0525-4e6d-892b-3cf9fbad53b8.png#id=cGWHo&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
继续点击授权按钮
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483278145-0e27e6db-b3e9-411c-8b69-1605f552d41f.png#id=JgYux&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
输入GitHub账号密码
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483278391-9763aa8a-d0d2-45e9-98ad-8852474e2640.png#id=VCz69&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483278604-2351ef51-23f4-413c-91b8-f187ca82ddd4.png#id=UPw3p&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483278782-4157cb6b-3c30-43db-a3d3-5c1de3e3d87d.png#id=K5rQs&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
### 4.3.3 创建项目
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483278995-ee60d44c-490c-4477-8c62-8d9f19b0b614.png#id=Kxjr4&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
### 4.3.4 添加项目代码
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483279195-3ed6b2ff-1e84-49f5-b352-7c8ea9bf2472.png#id=wf6v9&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
### 4.3.5 创建本地版本库
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483279440-ce2507cb-8650-40db-a69c-d3f4c5283ce3.png#id=ErHLl&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483279628-b0fe18a9-8595-43c7-898b-9fc17fa093fe.png#id=HFGpu&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
### 4.3.6 提交本地版本库
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483279875-982ad3b0-d7d2-407e-8328-4251a910fe2f.png#id=g4vY1&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483280072-d890b2e8-9137-434a-9f42-ba94b8fd4643.png#id=gmANY&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483280272-92bd6579-004c-451e-bd10-8be0cb09f61e.png#id=Yz3LO&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483280499-6e95a19a-2d3d-442a-8e06-1c4b14a2482f.png#id=AczXN&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483280788-e21bd987-5401-42bd-bccd-c9d276e06897.png#id=VohjW&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483281014-a93e25bc-f392-4352-9b98-27091d5fc59d.png#id=Eg5ox&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
### 4.3.7 创建新的远程版本库
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483281215-24981c55-fdf9-4afa-aaba-f4ab5d5613ae.png#id=HP6pa&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
### 4.3.7 推送到远程版本库
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483281564-564c27d8-4026-4d6e-a018-17afd6e89fc3.png#id=i96YC&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483281731-5d798ae9-1b4f-45b0-9b28-1fea2036465d.png#id=QFtD3&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483281899-d93d78c2-0669-44b2-9d64-722d2674cb2f.png#id=ytqeQ&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483282102-784cf54e-38a5-4b5c-b849-68c5ec7e52d0.png#id=Lzd0W&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483282322-c2d72c13-e144-42b1-bc5b-b98bd24d393b.png#id=qqKZu&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
### 4.3.8 查看历史版本
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483282531-b628c4da-d4ba-4481-8533-1eefa8e22516.png#id=U6mm6&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483282785-76b89071-39e4-47fe-ab7c-15a5f53b819d.png#id=tGyS4&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)

![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483283004-bee4f71f-5126-4eab-9944-7a04409a5af8.png#id=Rv3m9&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483283237-26295a3e-e6f5-404f-aaeb-749e33e224c1.png#id=hzwEg&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
### 4.3.9 分支操作
#### 4.3.9.1 创建分支
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483283524-4ffd0c25-607d-4c00-86a6-b21f38c0bb98.png#id=lUync&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483283708-b70f83ef-981a-4545-9090-32bcee6da0ae.png#id=uiMbk&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483283968-6fa393d8-3e5a-49c3-adfe-2c51e40a3b8c.png#id=cRrHp&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
#### 4.3.9.2 将分支推送到远程仓库
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483284225-905082c4-4924-44ed-9a21-457e582bab65.png#id=DqFGb&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483284429-b4d00d66-bf60-40ea-96a9-98caa9d5ba41.png#id=TGaep&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
## 4.4 Gitee集成
相对于GitHub来讲，由于网络的原因，我们在连接时不是很稳定，所以我们在采用第三方远程仓库时，也可以选择国内的Gitee平台。
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483284778-a89726f2-21f4-4464-825d-076128b1480e.png#id=WvXRk&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
### 4.4.1 注册网站会员
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483285021-bed93c6e-d61a-4a72-83e7-9d4f93c1d042.png#id=x8dI0&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
### 4.4.2 用户中心
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483285241-7008e928-486d-4746-bf36-0c7a1ea7b0fb.png#id=c6ykL&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
### 4.4.3 创建远程仓库
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483285494-622db82a-409e-49a9-9dce-0e76b4568f45.png#id=xbmFz&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483285732-cf913e49-1858-4219-a673-cd70a0df182b.png#id=doYvP&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
### 4.4.4 远程仓库简易操作指令
**# Git 全局设置，修改成自己的信息**
git config --global user.name "Aitiger"
git config --global user.email ["12252591+aitiger@user.noreply.gitee.com"](mailto:\"12252591+aitiger@user.noreply.gitee.com\")
**# 创建 git 仓库，基本操作指令和其他远程仓库一致。**
mkdir git-study
cd git-study
git init 
touch README.md
git add README.md
git commit -m "first commit"
git remote add origin git@gitee.com:aitiger/git-study.git
git push -u origin "master"
**# 已有仓库**
cd existing_git_repo
git remote add origin git@gitee.com:aitiger/git-study.git
git push -u origin "master"
### 4.4.5 配置SSH免密登录
#### 4.4.5.1 本地生成SSH密钥
**# ssh-keygen -t rsa -C Gitee账号**
ssh-keygen -t rsa -C 12252591+aitiger@user.noreply.gitee.com
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483285981-169c940f-ec66-4ca0-a947-f1588cebb659.png#id=l2kfN&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
#### 4.4.5.2 集成用户公钥
执行命令完成后,在window本地用户.ssh目录C:\Users\用户名\.ssh下面生成如下名称的公钥和私钥:
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483286203-491e6a25-86bd-44ff-a1ad-a10a5f8b1c0a.png#id=H6JUs&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
按照操作步骤，将id_rsa.pub文件内容复制到Gitee仓库中
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483286482-cbcfa11f-9470-4987-8c1e-ec08efe01c2a.png#id=mOGGo&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483286772-1f56bc2a-e37c-45e5-9dc6-6b45919d48d7.png#id=B1YLx&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)

![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483287000-7a484fdd-7a2e-492f-a85a-62219a0df563.png#id=KP12Z&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483287220-26081b7f-0bf4-4a94-a764-27a001e46cb5.png#id=WGymU&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
### 4.4.6 集成IDEA
#### 4.4.6.1 创建新项目
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483287469-8af5cbe3-d0d1-4b77-a607-52b3b023d795.png#id=UUkYo&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
#### 4.4.6.2 安装Gitee插件
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483287686-6888599f-fc66-4e36-b720-5f419d6f77e4.png#id=Z9m3S&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
#### 4.4.6.3 配置Gitee账户授权
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483287877-55c7d3cb-28dd-4cd5-af69-646767653727.png#id=EIQ1U&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)

![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483288167-e867d648-968b-4043-94c1-a2f15622aa0b.png#id=bcQEO&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483288375-d85f093b-2408-44e8-9782-3a35b75df02a.png#id=LkJ29&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483288603-0deaba68-625a-4c79-acef-1b0544eed22c.png#id=mrdut&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483288812-35853421-871a-490e-84cf-12ea6e4aa1e3.png#id=RprZU&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
#### 4.4.6.4 增加远程地址
**# 增加远程地址**
git remote add gitee-study git@gitee.com:aitiger/git-study.git
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483289045-ea2b0990-b0fa-44fa-922a-48f912112bb1.png#id=qGqLE&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
#### 4.4.6.5 提交本地代码
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483289285-cb79889b-6c30-45a5-ab03-7484058f53f3.png#id=iiva9&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)

![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483289507-19c0de0d-a71b-475b-a192-4792cdb90a69.png#id=yfdsh&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483289701-605dff66-27cb-4f9a-9ef7-6db85eca0d12.png#id=BMNxq&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483289899-3bf9a3c5-eaa1-4f3b-9ef5-5902c8442414.png#id=kKGBm&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483290149-f293f2d4-75ed-49d8-bef0-59825b767ed8.png#id=Ig5vg&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
### 4.4.7 多用户协作
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483290350-909a9355-297e-4633-9e60-07bb20a354f0.png#id=HbRyq&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483290567-017158e1-5bd3-4f06-9389-fd84d4449d87.png#id=BtWi3&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483290854-aefcf5c2-9d22-4ce7-bd64-939252690395.png#id=VLj03&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483291082-d5a2b54e-cc92-42f8-ad00-bf6a789dd98f.png#id=kb3Y8&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483291266-ddb83fa8-8d8a-4071-b0c6-87b6a513a2d6.png#id=ppbFd&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483291566-a180c89d-02d3-458b-a6b6-ea0c4c78adc7.png#id=YXtQq&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
## 4.5 GitLab集成
前面给大家讲解的都是如何使用第三方代码托管平台来管理咱们的代码库。那么我们自己搭建一个这样的平台行不行呢？其实咱们之前已经用Git软件搭建了一个远程版本库，但是功能相对来讲，比较单一，而且操作起来也不像GitHub, Gitee平台那样更加人性化，所以我们这里介绍一个GitLab软件，用于搭建自己的代码托管平台。
### 4.5.1 GitLab介绍
GitLab是由GitLabInc开发，使用MIT许可证的基于网络的Git仓库管理工具，且具有wiki和issue跟踪功能。使用Git作为代码管理工具，并在此基础上搭建起来的Web服务。
GitLib由乌克兰程序员DmitriyZaporozhets和ValerySizov开发，它使用Ruby语言写成。后来，一些部分用Go语言重写。GitLab被IBM，Sony，JulichResearchCenter，NASA，Alibab，Invincea，O'ReillyMedia，Leibniz-Rechenzentrum(LRZ)，CERN，SpaceX等组织使用。
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483291778-d74adaa3-4313-4c95-ba40-db3fbcc411f1.png#id=iJRmX&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
### 4.5.2 GitLab软件下载
官网地址：[https://about.gitlab.com/](https://about.gitlab.com/)
这里我们可以根据个人情况，选择下载不同版本的软件：
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483292057-9765ced2-89af-4d68-b30b-d3b302066d56.png#id=yWOdZ&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
我们这里主要是教学，所以下载使用社区版(CE)即可
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483292335-e97a99c5-dd31-4cf7-a0d6-d02ef1a2aed3.png#id=hqEjT&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
这里我们选择下载适用CentOS 7系统的版本
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483292546-79c1933e-60fe-49d1-9298-f588cc217b8a.png#id=YuO2Z&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
下载地址：[https://packages.gitlab.com/gitlab/gitlab-ce](https://packages.gitlab.com/gitlab/gitlab-ce)
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483292788-538d339a-47a6-4c3c-b209-e52cb19e5e59.png#id=oN7Wx&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
如果下载不了，或下载比较慢，可以根据提示在在linux系统中直接采用wget指令下载
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483293046-dd187605-005b-44c5-9003-8c60886a80a8.png#id=zcmWe&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
### 4.5.3 GitLab安装
#### 4.5.3.1 安装linux系统
Linux系统的安装不在本课程学习范畴中，请同学们自行安装CentOS 7即可。
#### 4.5.3.2 安装GitLab
直接采用下载的RPM软件包安装即可
sudo rpm -ivh /opt/module/software/gitlab-ce-15.7.0-ce.0.el7.x86_64.rpm
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483293298-bdeebc11-aa3b-4fc0-9fd4-bd6ee8581ed1.png#id=u0UnL&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483293496-0a6c5f78-f74f-455c-809a-cad468416648.png#id=erEIt&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
#### 4.5.3.3 安装配置依赖项
在CentOS 7上，下面的命令也会在系统防火墙中打开HTTP、HTTPS和SSH访问。这是一个可选步骤，如果您打算仅从本地网络访问极狐GitLab，则可以跳过它
sudo yum install -y curl policycoreutils-python openssh-server perl
sudo systemctl enable sshd
sudo systemctl start sshd
sudo firewall-cmd --permanent --add-service=http
sudo firewall-cmd --permanent --add-service=https
sudo systemctl reload firewalld
# 为了演示方便，我们也可以直接关闭防火墙
sudo systemctl stop firewalld
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483293688-2911fcac-7017-4c31-bab4-7d88e753e749.png#id=PPeOs&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
#### 4.5.3.4 初始化GitLab
# 配置软件镜像
curl -fsSL [https://packages.gitlab.cn/repository/raw/scripts/setup.sh](https://packages.gitlab.cn/repository/raw/scripts/setup.sh) | /bin/bash
# 安装
sudo EXTERNAL_URL="https://linux1" yum install -y gitlab-ce
# 初始化
sudo gitlab-ctl reconfigure
#### 4.5.3.5 启动GitLab
# 启动
gitlab-ctl start
# 停止
gitlab-ctl stop
#### 4.5.3.6 访问GitLab
使用浏览器访问GitLab，输入网址：[http://linux1/users/sign_in](http://linux1/users/sign_in)
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483293857-93031724-66bf-4fc9-8ce3-81634ec06b5d.png#id=mJVxh&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
初始化时，软件会提供默认管理员账户：root,但是密码是随机生成的。
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483294061-5cb47435-bcb9-4f21-bc75-fe6245a2b8cb.png#id=H5cyK&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
根据提示，在/etc/gitlab/initial_root_password文件中查找密码
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483294746-a2afdf13-260a-4fb6-83e9-22e4249f921c.png#id=lqbX9&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
输入账号，密码，进入系统
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483295012-11247f76-2937-4320-9d1b-bb862c79c6c4.png#id=O09Xf&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
#### 4.5.3.7 修改密码
默认的密码是随机的，且不容易记忆，还会在系统初始化后24小时被删除，所以需要先修改一下密码
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483295237-8b3bbdd2-ebe5-4951-8cd0-74ea431ae309.png#id=WBTQ3&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483295549-c1fe2da7-f80c-4e7d-800f-53d1469dfc22.png#id=Y8nDP&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483295793-14d5d00b-fc38-4021-bf79-6b6cb79e239e.png#id=nyAK1&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
#### 4.5.3.8 创建项目
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483295992-d73e6f05-55f5-4033-93af-2a6cbf73481c.png#id=em9X9&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483296173-2cb4a3c2-123a-49de-a35b-441fa8a56438.png#id=gtKGu&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483296391-1c2d3c3e-6d9f-4105-8439-b7255cb87df7.png#id=j84bu&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483296678-3a83c216-842d-4cf7-bf3b-32c686ef8c0d.png#id=D0eQ0&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
### 4.5.4 集成IDEA
#### 4.5.4.1 安装GitLab插件
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483296944-6bcbfd6f-9e81-43d6-bfbe-424d14b52782.png#id=upf9A&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
#### 4.5.4.2 配置GitLab
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483297141-5d9fc89e-1623-46a6-88e8-c83a9e4d96ad.png#id=Fyg2U&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483297407-6beba806-0c9b-4c5a-939c-5296f83e772c.png#id=C7Q4w&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
#### 4.5.4.3 创建新项目
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483297619-5e700587-8fa3-49fc-8daf-1e5f02268b83.png#id=zp6ba&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
#### 4.5.4.4 创建本地仓库
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483297820-33ef8843-98ac-4da1-8763-be3736a05c09.png#id=Iob0q&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483298031-931e6df0-353d-4739-a80c-09e3623a3a70.png#id=yzte0&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
#### 4.5.4.5 创建新代码
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483298235-b17474b3-1500-415a-808a-a3b35d26d345.png#id=jKP1a&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
#### 4.5.4.6 提交文件
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483298439-7fa15f86-c973-4eea-8e45-0938f1a97e71.png#id=NfgPt&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483298655-6021b3fc-4431-4380-bdb2-9279670fc9e8.png#id=GfV6A&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483298890-97bf15ad-3f19-4c67-8cc7-f0419badade2.png#id=WQZpD&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
#### 4.5.4.7 推送远程库
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483299096-33725ea3-f81e-49b4-a23c-139db09a3d7f.png#id=aINyL&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
#### 4.5.4.8 配置远程库
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483299302-86ad9910-8ab6-49fe-a890-54988ea647ae.png#id=fPElK&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483299486-fe5051b9-7fa4-4a28-b4b9-4bbd83dd7789.png#id=yinvF&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
#### 4.5.4.9 推送文件
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483299687-f5abe207-a71e-4312-8b54-94d491f06813.png#id=SrUGR&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483299902-fa838234-500d-4e35-8789-e6cb4fb27cfd.png#id=fonlN&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
#### 4.5.4.10 合并提交请求
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483300111-68545e4c-fd3d-470c-b652-391c73182149.png#id=BmvmS&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483300331-52e7d251-a90f-48d3-b2cc-a43947711169.png#id=C88Tn&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
合并
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483300527-18587e6e-fb23-457a-8d64-040138559429.png#id=X1xJE&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
确认文件提交
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483300742-5093b6c1-baa9-412c-b6ff-021898198a63.png#id=gDpiW&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)

## 4.6 GitHub Desktop客户端
### 4.6.1 下载 & 安装
#### 4.6.1.1 下载
Git官网提供对应得下载链接页面：
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483300973-2c6b50d1-4799-4c2b-a64a-0ed22f6b3fdf.png#id=F6lg4&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
下载地址：[https://central.github.com/deployments/desktop/desktop/latest/win32s](https://central.github.com/deployments/desktop/desktop/latest/win32s)
#### 4.6.1.2 安装
无安装过程，安装完成后，弹出应用界面
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483301209-68af89c0-adce-40ba-ab85-69e23872ac5b.png#id=FtQFQ&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
#### 4.6.1.3 配置
点击软件得File菜单后，选择Options, 设定软件得操作用户名称及对应得邮箱地址。
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483301398-02c3eb2b-a920-442b-b13d-3645b65ae9e1.png#id=MzlH3&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)

#### 4.6.1.4 主题样式
可以根据自己得偏好设定软件主题样式。
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483301587-09607238-0719-4c2c-9e8b-8afe2d3294d5.png#id=h5sTa&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
#### 4.6.1.5 全屏
如果觉得软件界面比较小，可以适当进行调整或全屏
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483301804-847a460d-b544-40f6-a2bf-544957ad9175.png#id=ze8iw&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)

### 4.6.2 创建本地仓库
#### 4.6.2.1 创建仓库
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483302004-2ae50f6d-ae35-4001-b3be-a106d80addf0.png#id=HhUFO&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483302226-b3c5c482-1097-44f9-a39d-8873b0da61ce.png#id=ixbMT&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483302457-fa8daba9-e221-4bac-891d-6b2d49540c27.png#id=BNKE0&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483302707-10ed2cb4-1c1a-49ab-a45c-71b522617de0.png#id=lmcIw&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
#### 4.6.2.2 切换仓库

![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483302920-625adc05-88ca-4c99-8651-d3f5311c3a23.png#id=iOt6O&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
#### 4.6.2.3 删除仓库
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483303133-8a6764aa-c3ff-445d-ba59-9cca8f3ed022.png#id=msGpG&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483303337-99bb17a7-bbfe-4af1-a198-f8208b2325b3.png#id=cSidN&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
### 4.6.3 文件操作
#### 4.6.3.1 新增文件
当工作区域创建了一份新文件，工具可以自动识别并进行对应得显示
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483303510-0fb411d1-17b8-40c6-bc39-3d603d34cc1c.png#id=kS5kA&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
此时Git仓库中并没有这份文件，所以需要执行commit操作，将文件保存到Git仓库中。
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483303738-e2849c90-b1bb-4666-9ebd-8efa6514450f.png#id=vJE4L&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
#### 4.6.3.2 忽略文件
如果某一个文件或某一类得文件，不想被Git软件进行管理。可以在忽略文件中进行设定
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483303909-a0409346-9d11-46c4-94c2-e7952d33d21d.png#id=R8S6C&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483304125-7dc7f633-e873-4a0c-a10d-55ae070f8b02.png#id=SUZct&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
#### 4.6.3.3 修改文件
修改文件只是将工作区域得文件进行修改，但是对于Git软件来讲，其实本质上还是提交，因为底层会生成新得文件
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483304338-9926216a-19f1-48fc-a011-e0208909c5f4.png#id=kVU1m&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
#### 4.6.3.4 删除文件
删除文件对于Git软件来讲，依然是一个提交
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483304538-5e84aa25-7f01-4b7b-b7ef-0f07a966dff8.png#id=RRh0k&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
提交后，最新版本得文件也会被“删除”
#### 4.6.3.5 历史记录
如果存在多次得提交操作得话，可以查看提交得历史记录
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483304822-0b058451-8583-49b8-a2a4-08dda0580f15.png#id=Z0gEh&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)

### 4.6.4 分支操作
#### 4.6.4.1 默认分支
软件创建仓库时，默认创建得分支为main
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483305024-1b37947f-4073-494a-9d1a-1a228081401c.png#id=mQAdg&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
点击右键可以改名
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483305247-6e8aca5d-c429-464d-b06e-8243c395ba6a.png#id=WY3wh&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
#### 4.6.4.2 创建分支
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483305416-ef69b963-cefb-452d-b6cc-46078f19fb69.png#id=EdOkY&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483305624-03dbe589-75ff-4e65-959d-d101f3edaa41.png#id=GDOkr&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
#### 4.6.4.3 切换分支
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483305900-76db5879-ce96-4534-8beb-31808f747b55.png#id=ZAvPP&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
#### 4.6.4.4 删除分支
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483306077-7492beab-d557-4a3c-8c36-09f2c24b324f.png#id=a4NTi&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
#### 4.6.4.5 合并分支
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483306297-789ab51e-0e67-4c1e-9a6b-aa5411f74641.png#id=uwaZD&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483306492-360b0819-17e0-4d31-860c-88cee375566a.png#id=SJg7I&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
### 4.6.5 标签操作
#### 4.6.5.1 创建标签
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483306713-bf3dcfb8-66a3-454f-9238-67b9a3bc19c6.png#id=kTgun&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483306899-73b00942-a0aa-4093-8f0c-c4e04203ff98.png#id=wWQ6s&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483307158-574e50f6-5d22-457e-90e3-b23dd4b1ed0a.png#id=pATVT&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
#### 4.6.5.2 删除标签
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483307403-dda1cfdb-8cc2-42bf-abd6-3ebf863b5b58.png#id=W37Xc&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
### 4.6.6 远程仓库
#### 4.6.6.1 克隆仓库
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483307639-7e658c30-fd51-4d22-8d96-4bce0489da1f.png#id=u8eWv&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483307870-3e4d2d6f-f8ae-497a-883b-765b4abc437b.png#id=KXkig&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483308051-be25b042-28bc-403d-9cf4-6bc27880dae2.png#id=xI3dh&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483308258-3d202fa3-1b07-44b8-8378-1367c32a7cc0.png#id=AwCyE&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483308456-ecd44843-cde0-4b26-b699-8e80ae6340df.png#id=EPtA6&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
#### 4.6.6.2 拉取文件
远程仓库更新了文件
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483308688-f15704e7-53e9-4ceb-8181-37d1e1be0975.png#id=a1TVM&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483308909-c75cf603-f9f0-49ce-a193-a518b5476d59.png#id=x7ERC&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
拉取文件中
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483309124-0fb7c630-1354-4a06-9a5f-7a11f33c6181.png#id=jgugz&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483309455-8402d090-c3ca-402c-ab62-352a0c68aa86.png#id=FkKWl&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483309670-d92b1df4-07a4-4228-8f3d-4464e007a03d.png#id=iMNDr&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)

#### 4.6.6.3 推送文件
本地创建新文件
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483309928-1f27d250-548b-4b6e-85e7-b7c91a516921.png#id=SdVnS&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483310096-f144e130-1414-4f45-8cb4-e6aff4a9bbd8.png#id=gI7Ah&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483310286-5cd39fa0-09dc-4ffb-a782-2eaa8bac3e09.png#id=L3Hqq&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483310496-30ab6791-7048-4ade-b7db-e2ac28453ac5.png#id=Z08NZ&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483310771-19b02d31-f942-478f-babc-fd3551799d13.png#id=cuiIu&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)

# 5 ** Git问题**
## 5.1 SSH公钥错误
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483310951-6e0f2135-3a9b-4bb3-9d51-7be5c79fa32b.png#id=g7lHh&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
一般出现如上错误，就是Git远程仓库的SSH免密公钥和推送用户提供的公钥不一致导致的。
## 5.2 IDEA集成Gitee失败
如果IDEA集成Gitee时，向远程仓库push代码失败，且没有弹出账号窗口，可以尝试修改IDEA得相关配置。
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1724483311174-924c6553-8d72-4a11-a811-ac02d60c2c2f.png#id=XWHcZ&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)


