[TOC]

在工程中，并不是所有文件都需要保存到版本库中的，例如“target”目录及目录下的文件就可以忽略。在Git工作区的根目录下创建一个特殊的.gitignore文件，然后把要忽略的文件名填进去，Git就会自动忽略这些文件或目录。

### Git 忽略规则优先级

在 .gitingore 文件中，每一行指定一个忽略规则，Git 检查忽略规则的时候有多个来源，它的优先级如下（由高到低）：

    解释从命令行中读取可用的忽略规则
    当前目录定义的规则
    父级目录定义的规则，依次递推
    $GIT_DIR/info/exclude 文件中定义的规则
    core.excludesfile中定义的全局规则
    12345

### Git 忽略规则匹配语法

在 .gitignore 文件中，每一行的忽略规则的语法如下：

    解释空格不匹配任意文件，可作为分隔符，可用反斜杠转义
    开头的文件标识注释，可以使用反斜杠进行转义
    ! 开头的模式标识否定，该文件将会再次被包含，如果排除了该文件的父级目录，则使用 ! 也不会再次被包含。可以使用反斜杠进行转义
    / 结束的模式只匹配文件夹以及在该文件夹路径下的内容，但是不匹配该文件
    / 开始的模式匹配项目跟目录
    如果一个模式不包含斜杠，则它匹配相对于当前 .gitignore 文件路径的内容，如果该模式不在 .gitignore 文件中，则相对于项目根目录
    ** 匹配多级目录，可在开始，中间，结束
    ? 通用匹配单个字符
    * 通用匹配零个或多个字符
    [] 通用匹配单个字符列表
    12345678910

### 常用匹配示例

    解释bin/: 忽略当前路径下的bin文件夹，该文件夹下的所有内容都会被忽略，不忽略 bin 文件
    /bin: 忽略根目录下的bin文件
    /*.c: 忽略 cat.c，不忽略 build/cat.c
    debug/*.obj: 忽略 debug/io.obj，不忽略 debug/common/io.obj 和 tools/debug/io.obj
    **/foo: 忽略/foo, a/foo, a/b/foo等
    a/**/b: 忽略a/b, a/x/b, a/x/y/b等
    !/bin/run.sh: 不忽略 bin 目录下的 run.sh 文件
    *.log: 忽略所有 .log 文件
    config.php: 忽略当前路径的 config.php 文件
    123456789

### .gitignore规则不生效

.gitignore只能忽略那些原来没有被track的文件，如果某些文件已经被纳入了版本管理中，则修改.gitignore是无效的。

解决方法就是先把本地缓存删除（改变成未track状态），然后再提交:

    git rm -r --cached .
    git add .
    git commit -m 'update .gitignore'
    123

你想添加一个文件到Git，但发现添加不了，原因是这个文件被.gitignore忽略了：

    解释$ git add App.class
    The following paths are ignored by one of your .gitignore files:
    App.class
    Use -f if you really want to add them.
    1234

如果你确实想添加该文件，可以用-f强制添加到Git：

    $ git add -f App.class
    1

或者你发现，可能是.gitignore写得有问题，需要找出来到底哪个规则写错了，可以用git check-ignore命令检查：

    $ git check-ignore -v App.class
    .gitignore:3:*.class    App.class
    12

Git会告诉我们，.gitignore的第3行规则忽略了该文件，于是我们就可以知道应该修订哪个规则。

### Java项目中常用的.gitignore文件

    解释# Compiled class file
    *.class

    # Eclipse
    .project
    .classpath
    .settings/

    # Intellij
    *.ipr
    *.iml
    *.iws
    .idea/

    # Maven
    target/

    # Gradle
    build
    .gradle

    # Log file
    *.log
    log/

    # out
    **/out/

    # Mac
    .DS_Store

    # others
    *.jar
    *.war
    *.zip
    *.tar
    *.tar.gz
    *.pid
    *.orig
    temp/
    12345678910111213141516171819202122232425262728293031323334353637383940

