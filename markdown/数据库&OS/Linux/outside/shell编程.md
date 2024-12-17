## Shell编程
这里说的Shell 脚本（shell script），是在Linux 环境下运行的脚本程序

Shell 编程跟 JavaScript、php 编程一样，只要有一个能编写代码的文本编辑器和一个能解释执行的脚本解释器就可以了。

Linux 的 Shell 种类众多，常见的有：

+ Bourne Shell（/usr/bin/sh或/bin/sh）
+ Bourne Again Shell（/bin/bash）
+ C Shell（/usr/bin/csh）
+ K Shell（/usr/bin/ksh）
+ Shell for Root（/sbin/sh）
+ ……

Bash是大多数Linux 系统默认的 Shell，本文也仅关注Bash Shell。

在一般情况下，并不区分 Bourne Shell 和 Bourne Again Shell，所以，像 **#!/bin/sh**，它同样也可以改为 **#!/bin/bash**。

**#!** 告诉系统其后路径所指定的程序即是解释此脚本文件的 Shell 程序。

### 入门
#### 运行Shell脚本
编写shell脚本：

```plain
vi test.sh

#!/bin/bash
echo "Hello World !"

```

**#!** 是一个约定的标记，它告诉系统这个脚本需要什么解释器来执行，即使用哪一种 Shell。

echo 命令用于向窗口输出文本。

运行 Shell 脚本有两种方法：

**1、作为可执行程序**

```plain
chmod +x ./test.sh  #使脚本具有执行权限
./test.sh  #执行脚本

```

默认情况下，一定要写成 **./test.sh**，而不是 **test.sh**，运行其它二进制的程序也一样。

除非将当前目录.加入到PATH环境变量中，配置方法：

```plain
sudo vi /etc/profile
加入一行
export PATH=$PATH:.
保存之后，执行
source /etc/profile

```

**2、作为解释器参数**

直接运行解释器，其参数就是 shell 脚本的文件名：

```plain
/bin/sh test.sh

```

这种方式运行的脚本，不需要在第一行指定解释器信息，写了也没用。

#### 编写一个快捷创建shell脚本的命令
```plain
#!/bin/bash
if test -z $1;then
  newfile="./script_`date +%m%d_%s`"
else
  newfile=$1
fi
echo $newfile
if  ! grep "^#!" $newfile &>/dev/null; then
cat >> $newfile 将以上内容编写好之后保存为shell文件，然后执行

```plain
chmod u+x shell
sudo mv shell /usr/bin/

```

#### echo命令
Shell 的 echo 指令与 PHP 的 echo 指令类似，都是用于字符串的输出。命令格式：

```plain
echo string

```

显示普通字符串:

```plain
echo "It is a test"

```

这里的双引号完全可以省略，以下命令与上面实例效果一致：

```plain
echo It is a test

```

显示转义字符:

```plain
echo "\"It is a test\""

```

结果将是:

```plain
"It is a test"

```

同样，双引号也可以省略

read 命令从标准输入中读取一行,并把输入行的每个字段的值指定给 shell 变量

```plain
#!/bin/sh
read name 
echo "$name It is a test"

```

以上代码保存为 test.sh，name 接收标准输入的变量，结果将是:

```plain
[root@www ~]# sh test.sh
OK                     #标准输入
OK It is a test        #输出

```

##### 显示换行
```plain
echo -e "OK! \n" # -e 开启转义
echo "It is a test"

```

输出结果：

```plain
OK!

It is a test

```

##### 显示不换行
```plain
#!/bin/sh
echo -e "OK! \c" # -e 开启转义 \c 不换行
echo "It is a test"

```

输出结果：

```plain
OK! It is a test

```

#### printf 命令
printf 命令的语法：

```plain
printf  format-string  [arguments...]

```

**参数说明：**

+ **format-string:** 为格式控制字符串
+ **arguments:** 为参数列表。

实例如下：

```plain
#!/bin/bash

printf "%-10s %-8s %-4s\n" 姓名 性别 体重kg  
printf "%-10s %-8s %-4.2f\n" 郭靖 男 66.1234 
printf "%-10s %-8s %-4.2f\n" 杨过 男 48.6543 
printf "%-10s %-8s %-4.2f\n" 郭芙 女 47.9876 

```

执行脚本，输出结果如下所示：

```plain
姓名     性别   体重kg
郭靖     男      66.12
杨过     男      48.65
郭芙     女      47.99

```

+ %s %c %d %f都是格式替代符
+ %-10s 指一个宽度为10个字符（-表示左对齐，没有则表示右对齐），任何字符都会被显示在10个字符宽的字符内，如果不足则自动以空格填充，超过也会将内容全部显示出来。
+ %-4.2f 指格式化为小数，其中.2指保留2位小数。

printf的转义序列：

| **序列** | **说明** |
| :---: | :---: |
| \a | 警告字符，通常为ASCII的BEL字符 |
| \b | 后退 |
| \c | 抑制（不显示）输出结果中任何结尾的换行字符（只在%b格式指示符控制下的参数字符串中有效），而且，任何留在参数里的字符、任何接下来的参数以及任何留在格式字符串中的字符，都被忽略 |
| \f | 换页（formfeed） |
| \n | 换行 |
| \r | 回车（Carriage return） |
| \t | 水平制表符 |
| \v | 垂直制表符 |
| \ | 一个字面上的反斜杠字符 |
| \ddd | 表示1到3位数八进制值的字符。仅在格式字符串中有效 |
| \0ddd | 表示1到3位的八进制值字符 |


例子：

```plain
python@ubuntu:~/test$ printf "a string, no processing:\n" "A\nB"
a string, no processing:
python@ubuntu:~/test$ printf "a string, no processing:\n" "A\nB"
a string, no processing:
python@ubuntu:~/test$ printf "www.runoob.com \a"
www.runoob.com python@ubuntu:~/test$ 

```

#### Shell 注释
以 **#** 开头的行就是注释，会被解释器忽略：

```plain
#--------------------------------------------
# 这是一个注释
# author：菜鸟教程
# site：www.taobao.com
# slogan：学的不仅是技术，更是梦想！
#--------------------------------------------
##### 用户配置区 开始 #####
#
#
# 这里可以添加脚本描述信息
# 
#
##### 用户配置区 结束  #####

```

多行注释还可以使用以下格式：

```plain
:EOF 也可以使用其他符号:

```plain
:Shell变量
#### 定义变量
```plain
your_name="taobao.com"

```

变量名的命名须遵循如下规则：

+ 命名只能使用英文字母，数字和下划线，首个字符不能以数字开头。
+ 中间不能有空格，可以使用下划线（_）。
+ 不能使用标点符号。
+ 不能使用bash里的关键字（可用help命令查看保留关键字）。

#### 使用变量
在变量名前面加美元符号即可，如：

```plain
your_name="qinjx"
echo $your_name
echo ${your_name}

```

加花括号可以帮助解释器识别变量的边界，比如：

```plain
for skill in Ada Coffe Action Java; do
    echo "I am good at ${skill}Script"
done

```

#### 只读变量
使用 readonly 命令可以将变量定义为只读变量，只读变量的值不能被改变。

下面的例子尝试更改只读变量，结果报错：

```plain
python@ubuntu:~/shell$ myUrl="http://www.google.com"
python@ubuntu:~/shell$ readonly myUrl
python@ubuntu:~/shell$ myUrl="http://www.baidu.com"
-bash: myUrl: 只读变量

```

#### 删除变量
使用 unset 命令可以删除变量，但不能删除只读变量：

```plain
#!/bin/sh
myUrl="http://www.baidu.com"
unset myUrl
echo $myUrl

```

#### 变量类型
运行shell时，会同时存在三种变量：

+ **1) 局部变量** 局部变量在脚本或命令中定义，仅在当前shell实例中有效，其他shell启动的程序不能访问局部变量。
+ **2) 环境变量** 所有的程序，包括shell启动的程序，都能访问环境变量，有些程序需要环境变量来保证其正常运行。必要的时候shell脚本也可以定义环境变量。
+ **3) shell变量** shell变量是由shell程序设置的特殊变量。shell变量中有一部分是环境变量，有一部分是局部变量，这些变量保证了shell的正常运行

### Shell 函数
shell中函数的定义格式如下：

```plain
[ function ] funname [()]
{
    action;
    [return int;]
}

```

说明：

+ 1、可以带function fun() 定义，也可以直接fun() 定义,不带任何参数。
+ 2、参数返回，可以显示加：return 返回，如果不加，将以最后一条命令运行结果，作为返回值。 return后跟数值n(0-255)

示例：

```plain
#!/bin/bash

funWithReturn(){
    echo "这个函数会对输入的两个数字进行相加运算..."
    echo "输入第一个数字: "
    read aNum
    echo "输入第二个数字: "
    read anotherNum
    echo "两个数字分别为 $aNum 和 $anotherNum !"
    return $(($aNum+$anotherNum))
}
funWithReturn
echo "输入的两个数字之和为 $? !"

```

输出，类似下面：

```plain
这个函数会对输入的两个数字进行相加运算...
输入第一个数字: 
输入第二个数字: 
两个数字分别为 1 和 2 !
输入的两个数字之和为 3 !

```

函数返回值在调用该函数后通过 $? 来获得。

注意：所有函数在使用前必须定义。这意味着必须将函数放在脚本开始部分，直至shell解释器首次发现它时，才可以使用。调用函数仅使用其函数名即可。

在Shell中，调用函数时可以向其传递参数。在函数体内部，通过 `$n` 的形式来获取参数的值，例如，`$1`表示第一个参数，`$2`表示第二个参数…

带参数的函数示例：

```plain
#!/bin/bash

funWithParam(){
    echo "第一个参数为 $1 !"
    echo "第二个参数为 $2 !"
    echo "第十个参数为 $10 !"
    echo "第十个参数为 ${10} !"
    echo "第十一个参数为 ${11} !"
    echo "参数总数有 $# 个!"
    echo "作为一个字符串输出所有参数 $* !"
}
funWithParam 1 2 3 4 5 6 7 8 9 34 73

```

输出结果：

```plain
第一个参数为 1 !
第二个参数为 2 !
第十个参数为 10 !
第十个参数为 34 !
第十一个参数为 73 !
参数总数有 11 个!
作为一个字符串输出所有参数 1 2 3 4 5 6 7 8 9 34 73 !

```

当n>=10时，需要使用`${n}`来获取参数。

另外，还有几个特殊字符用来处理参数：

| **参数处理** | **说明** |
| :---: | :---: |
| $# | 传递到脚本的参数个数 |
| $* | 以一个单字符串显示所有向脚本传递的参数 |
| $$ | 脚本运行的当前进程ID号 |
| $! | 后台运行的最后一个进程的ID号 |
| $@ | 与$*相同，但是使用时加引号，并在引号中返回每个参数。 |
| $- | 显示Shell使用的当前选项，与set命令功能相同。 |
| $? | 显示最后命令的退出状态。0表示没有错误，其他任何值表明有错误。 |


### 文件包含
Shell 文件包含的语法格式如下：

```plain
. filename   # 注意点号(.)和文件名中间有一空格
或
source filename

```

**实例**

创建两个 shell 脚本文件。

test1.sh 代码如下：

```plain
#!/bin/bash

url="http://www.baidu.com"

```

test2.sh 代码如下：

```plain
#!/bin/bash

#使用 . 号来引用test1.sh 文件
. ./test1.sh
# 或者使用以下包含文件代码
# source ./test1.sh

echo "url地址：$url"

```

接下来，我们为 test2.sh 添加可执行权限并执行：

```plain
$ chmod +x test2.sh 
$ ./test2.sh 
url地址：http://www.baidu.com

```

**注：**被包含的文件 test1.sh 不需要可执行权限。

### shell数据类型
#### 字符串
字符串可以用单引号，也可以用双引号，也可以不用引号。

单引号：

```plain
str='this is a string'

```

单引号字符串的限制：

+ 单引号里的任何字符都会原样输出，单引号字符串中的变量是无效的；
+ 单引号字串中不能出现单独一个的单引号（对单引号使用转义符后也不行），但可成对出现，作为字符串拼接使用。

双引号：

```plain
your_name='taobao'
str="Hello, I know you are \"$your_name\"! \n"
echo -e $str

```

输出结果为：

```plain
Hello, I know you are "taobao"! 

```

双引号的优点：

+ 双引号里可以有变量
+ 双引号里可以出现转义字符

拼接字符串：

```plain
your_name="taobao"
# 使用双引号拼接
greeting="hello, "$your_name" !"
greeting_1="hello, ${your_name} !"
echo $greeting  $greeting_1
# 使用单引号拼接
greeting_2='hello, '$your_name' !'
greeting_3='hello, ${your_name} !'
echo $greeting_2  $greeting_3

```

输出结果为：

```plain
hello, taobao ! hello, taobao !
hello, taobao ! hello, ${your_name} !

```

**获取字符串长度**`**${#s}**`

```plain
string="abcd"
echo ${#string} #输出 4

```

**截取字符串${s:n1:n2}**

以下实例从字符串第 **2** 个字符开始截取 **4** 个字符：

```plain
string="taobao is a great site"
echo ${string:1:4} # 输出 unoo

```

**查找字符出现的位置**`**expr index**`

查找字符 **i** 或 **o** 的位置(哪个字母先出现就计算哪个)：

```plain
string="taobao is a great site"
echo `expr index "$string" io`  # 输出 3

```

**注意：** 以上脚本中 **`** 是反引号，而不是单引号 **'**。

#### 数组
bash支持一维数组（不支持多维数组），并且没有限定数组的大小。

数组元素的下标由 0 开始编号。

##### 定义数组
在 Shell 中，用括号来表示数组，数组元素用"空格"符号分割开。定义数组的一般形式为：

```plain
array_name=(value0 value1 value2 value3)

```

或者

```plain
array_name=(
value0
value1
value2
value3
)

```

或单独定义数组的各个分量：

```plain
array_name[0]=value0
array_name[1]=value1
array_name[n]=valuen

```

可以不使用连续的下标，而且下标的范围没有限制。

##### 读取数组
读取数组元素值的一般格式是：

```plain
valuen=${array_name[n]}

```

例子：

```plain
#!/bin/bash

my_array=(A B "C" D)

echo "第一个元素为: ${my_array[0]}"
echo "第二个元素为: ${my_array[1]}"
echo "第三个元素为: ${my_array[2]}"
echo "第四个元素为: ${my_array[3]}"

```

执行脚本，输出结果如下所示：

```plain
$ chmod +x test.sh 
$ ./test.sh
第一个元素为: A
第二个元素为: B
第三个元素为: C
第四个元素为: D

```

使用 `@`或`*` 符号可以获取数组中的所有元素，例如：

```plain
echo ${array_name[@]}

```

例子：

```plain
#!/bin/bash

my_array[0]=A
my_array[1]=B
my_array[2]=C
my_array[3]=D

echo "数组的元素为: ${my_array[*]}"
echo "数组的元素为: ${my_array[@]}"

```

执行脚本，输出结果如下所示：

```plain
$ chmod +x test.sh 
$ ./test.sh
数组的元素为: A B C D
数组的元素为: A B C D

```

##### 获取数组的长度
获取数组长度的方法与获取字符串长度的方法相同，例如：

```plain
# 取得数组元素的个数
length=${#array_name[@]}
# 或者
length=${#array_name[*]}
# 取得数组单个元素的长度
lengthn=${#array_name[n]}

```

例子：

```plain
#!/bin/bash

my_array[0]=A
my_array[1]=B
my_array[2]=C
my_array[3]=D

echo "数组元素个数为: ${#my_array[*]}"
echo "数组元素个数为: ${#my_array[@]}"

```

执行脚本，输出结果如下所示：

```plain
$ chmod +x test.sh 
$ ./test.sh
数组元素个数为: 4
数组元素个数为: 4

```

#### Shell传递参数
执行 Shell 脚本时，向脚本传递参数，脚本内获取参数的格式为：**$n**。

**n** 代表一个数字，1 为执行脚本的第一个参数，2 为执行脚本的第二个参数，以此类推……

**$0** 为执行的文件名

test.sh文件内容如下：

```plain
vi test.sh
#!/bin/bash

echo "Shell 传递参数实例！";
echo "执行的文件名：$0";
echo "第一个参数为：$1";
echo "第二个参数为：$2";
echo "第三个参数为：$3";

```

运行结果：

```plain
python@ubuntu:~/test$ sh test.sh 1 2 3
Shell 传递参数实例！
执行的文件名：test.sh
第一个参数为：1
第二个参数为：2
第三个参数为：3

```

参数获取：

| **参数处理** | **说明** |
| :---: | :---: |
| $# | 传递到脚本的参数个数 |
| `$*` | 传递的参数作为一个字符串显示 |
| $$ | 脚本运行的当前进程ID号 |
| $! | 后台运行的最后一个进程的ID号 |
| `$@` | 与`$*`相同，但是使用时加引号 |
| $? | 显示最后命令的退出状态。0表示没有错误，其他任何值表明有错误。 |


```plain
#!/bin/bash

echo "参数个数为：$#";
echo "$*传递的参数作为一个字符串显示：$*";
echo "$@传递的参数作为一个字符串显示：$@";
echo "脚本运行的当前进程ID号：$$";
echo "后台运行的最后一个进程的ID号：$!";
echo "$?"

```

执行脚本，输出结果如下所示：

```plain
python@ubuntu:~/test$ ./test.sh 1 2 3
参数个数为：3
1 2 3传递的参数作为一个字符串显示：1 2 3
1 2 3传递的参数作为一个字符串显示：1 2 3
脚本运行的当前进程ID号：5059
后台运行的最后一个进程的ID号：

```

`$*`与`$@`的区别：

+ 只有在双引号中体现出来。假设在脚本运行时写了三个参数 1、2、3，，则`$*` 等价于 “1 2 3”（传递了一个参数），而`$@`等价于 “1” “2” “3”（传递了三个参数）。

```plain
#!/bin/bash

echo "-- \"\$*\" 演示 ---"
for i in "$*"; do
    echo $i
done

echo "-- \"\$@\" 演示 ---"
for i in "$@"; do
    echo $i
done

echo "-- \$* 演示 ---"
for i in $*; do
    echo $i
done

echo "-- \$@ 演示 ---"
for i in $@; do
    echo $i
done

```

执行脚本，输出结果如下所示：

```plain
python@ubuntu:~/test$ sh test 1 2 3
-- "$*" 演示 ---
1 2 3
-- "$@" 演示 ---
-- $* 演示 ---
-- $@ 演示 ---

```

### Shell基本运算符
Shell 和其他编程语言一样，支持多种运算符，包括：

+ 算数运算符
+ 关系运算符
+ 布尔运算符
+ 字符串运算符
+ 文件测试运算符

原生bash不支持简单的数学运算，但是可以通过其他命令来实现，例如 awk 和 expr，expr 最常用。

expr 是一款表达式计算工具，使用它能完成表达式的求值操作。

```plain
#!/bin/bash

val=`expr 2 + 2`
echo "两数之和为 : $val"

```

执行脚本，输出结果如下所示：

```plain
两数之和为 : 4

```

两点注意：

+ 表达式和运算符之间要有空格，例如 2+2 是不对的，必须写成 2 + 2。
+ 完整的表达式要被 ` ` 包含，这个字符是**反引号**在 Esc 键下边。

#### 算术运算符
下表列出了常用的算术运算符，假定变量 a 为 10，变量 b 为 20：

| **运算符** | **说明** | **举例** |
| :---: | :---: | :---: |
| + | 加法 | `expr $a + $b` 结果为 30。 |
| - | 减法 | `expr $a - $b` 结果为 -10。 |
| * | 乘法 | `expr $a \* $b` 结果为 200。 |
| / | 除法 | `expr $b / $a` 结果为 2。 |
| % | 取余 | `expr $b % $a` 结果为 0。 |
| = | 赋值 | a=$b 将把变量 b 的值赋给 a。 |
| == | 相等。用于比较两个数字，相同则返回 true。 | `[ $a == $b ]` 返回 false。 |
| != | 不相等。用于比较两个数字，不相同则返回 true。 | `[ $a != $b ]` 返回 true。 |


算术运算符实例如下：

```plain
#!/bin/bash

a=10
b=20

val=`expr $a + $b`
echo "a + b : $val"

val=`expr $a - $b`
echo "a - b : $val"

val=`expr $a \* $b`
echo "a * b : $val"

val=`expr $b / $a`
echo "b / a : $val"

val=`expr $b % $a`
echo "b % a : $val"

if [ $a == $b ]
then
   echo "a 等于 b"
fi
if [ $a != $b ]
then
   echo "a 不等于 b"
fi

```

执行脚本，输出结果如下所示：

```plain
a + b : 30
a - b : -10
a * b : 200
b / a : 2
b % a : 0
a 不等于 b

```

**注意：**

+ 乘号(*)前边必须加反斜杠`\`才能实现乘法运算；
+ if…then…fi 是条件语句，后续将会讲解。
+ 在 MAC 中 shell 的 expr 语法是：**$((表达式))**，此处表达式中的 “*” 不需要转义符号 `\` 。

```plain
let varName=算术表达式
varName=$[算术表达式]
varName=$((算术表达式))

```

#### 关系运算符
关系运算符只支持数字，不支持字符串，除非字符串的值是数字。

下表列出了常用的关系运算符，假定变量 a 为 10，变量 b 为 20：

| **运算符** | **说明** | **举例** |
| :---: | :---: | :---: |
| -eq | 检测两个数是否相等，相等返回 true。 | `[ $a -eq $b ]` 返回 false。 |
| -ne | 检测两个数是否不相等，不相等返回 true。 | `[ $a -ne $b ]` 返回 true。 |
| -gt | 检测左边的数是否大于右边的，如果是，则返回 true。 | `[ $a -gt $b ]` 返回 false。 |
| -lt | 检测左边的数是否小于右边的，如果是，则返回 true。 | `[ $a -lt $b ]` 返回 true。 |
| -ge | 检测左边的数是否大于等于右边的，如果是，则返回 true。 | `[ $a -ge $b ]`返回 false。 |
| -le | 检测左边的数是否小于等于右边的，如果是，则返回 true。 | `[ $a -le $b ]` 返回 true。 |


关系运算符实例如下：

```plain
#!/bin/bash

a=10
b=20

if [ $a -eq $b ]
then
   echo "$a -eq $b : a 等于 b"
else
   echo "$a -eq $b: a 不等于 b"
fi
if [ $a -ne $b ]
then
   echo "$a -ne $b: a 不等于 b"
else
   echo "$a -ne $b : a 等于 b"
fi
if [ $a -gt $b ]
then
   echo "$a -gt $b: a 大于 b"
else
   echo "$a -gt $b: a 不大于 b"
fi
if [ $a -lt $b ]
then
   echo "$a -lt $b: a 小于 b"
else
   echo "$a -lt $b: a 不小于 b"
fi
if [ $a -ge $b ]
then
   echo "$a -ge $b: a 大于或等于 b"
else
   echo "$a -ge $b: a 小于 b"
fi
if [ $a -le $b ]
then
   echo "$a -le $b: a 小于或等于 b"
else
   echo "$a -le $b: a 大于 b"
fi

```

执行脚本，输出结果如下所示：

```plain
10 -eq 20: a 不等于 b
10 -ne 20: a 不等于 b
10 -gt 20: a 不大于 b
10 -lt 20: a 小于 b
10 -ge 20: a 小于 b
10 -le 20: a 小于或等于 b

```

#### 布尔运算符
下表列出了常用的布尔运算符，假定变量 a 为 10，变量 b 为 20：

| **运算符** | **说明** | **举例** |
| :---: | :---: | :---: |
| ! | 非运算，表达式为 true 则返回 false，否则返回 true。 | `[ ! false ]` 返回 true。 |
| -o | 或运算，有一个表达式为 true 则返回 true。 | `[ $a -lt 20 -o $b -gt 100 ]` 返回 true。 |
| -a | 与运算，两个表达式都为 true 才返回 true。 | `[ $a -lt 20 -a $b -gt 100 ]` 返回 false。 |


布尔运算符实例如下：

```plain
#!/bin/bash

a=10
b=20

if [ $a != $b ]
then
   echo "$a != $b : a 不等于 b"
else
   echo "$a == $b: a 等于 b"
fi
if [ $a -lt 100 -a $b -gt 15 ]
then
   echo "$a 小于 100 且 $b 大于 15 : 返回 true"
else
   echo "$a 小于 100 且 $b 大于 15 : 返回 false"
fi
if [ $a -lt 100 -o $b -gt 100 ]
then
   echo "$a 小于 100 或 $b 大于 100 : 返回 true"
else
   echo "$a 小于 100 或 $b 大于 100 : 返回 false"
fi
if [ $a -lt 5 -o $b -gt 100 ]
then
   echo "$a 小于 5 或 $b 大于 100 : 返回 true"
else
   echo "$a 小于 5 或 $b 大于 100 : 返回 false"
fi

```

执行脚本，输出结果如下所示：

```plain
10 != 20 : a 不等于 b
10 小于 100 且 20 大于 15 : 返回 true
10 小于 100 或 20 大于 100 : 返回 true
10 小于 5 或 20 大于 100 : 返回 false

```

#### 逻辑运算符
以下介绍 Shell 的逻辑运算符，假定变量 a 为 10，变量 b 为 20:

| **运算符** | **说明** | **举例** |
| :---: | :---: | :---: |
| && | 逻辑的 AND | `[[ $a -lt 100 && $b -gt 100 ]]` 返回 false |
|  |  |  |


逻辑运算符实例如下：

```plain
#!/bin/bash

a=10
b=20

if [[ $a -lt 100 && $b -gt 100 ]]
then
   echo "返回 true"
else
   echo "返回 false"
fi

if [[ $a -lt 100 || $b -gt 100 ]]
then
   echo "返回 true"
else
   echo "返回 false"
fi

```

执行脚本，输出结果如下所示：

```plain
返回 false
返回 true

```

#### 字符串运算符
下表列出了常用的字符串运算符，假定变量 a 为 “abc”，变量 b 为 “efg”：

| **运算符** | **说明** | **举例** |
| :---: | :---: | :---: |
| = | 检测两个字符串是否相等，相等返回 true。 | `[ $a = $b ]` 返回 false。 |
| != | 检测两个字符串是否相等，不相等返回 true。 | `[ $a != $b ]` 返回 true。 |
| -z | 检测字符串长度是否为0，为0返回 true。 | `[ -z $a ]` 返回 false。 |
| -n | 检测字符串长度是否为0，不为0返回 true。 | `[ -n "$a" ]` 返回 true。 |
| $ | 检测字符串是否为空，不为空返回 true。 | `[ $a ]` 返回 true。 |


字符串运算符实例如下：

```plain
#!/bin/bash

a="abc"
b="efg"

if [ $a = $b ]
then
   echo "$a = $b : a 等于 b"
else
   echo "$a = $b: a 不等于 b"
fi
if [ $a != $b ]
then
   echo "$a != $b : a 不等于 b"
else
   echo "$a != $b: a 等于 b"
fi
if [ -z $a ]
then
   echo "-z $a : 字符串长度为 0"
else
   echo "-z $a : 字符串长度不为 0"
fi
if [ -n "$a" ]
then
   echo "-n $a : 字符串长度不为 0"
else
   echo "-n $a : 字符串长度为 0"
fi
if [ $a ]
then
   echo "$a : 字符串不为空"
else
   echo "$a : 字符串为空"
fi

```

执行脚本，输出结果如下所示：

```plain
abc = efg: a 不等于 b
abc != efg : a 不等于 b
-z abc : 字符串长度不为 0
-n abc : 字符串长度不为 0
abc : 字符串不为空

```

#### 文件测试运算符
文件测试运算符用于检测 Unix 文件的各种属性。

属性检测描述如下：

| **操作符** | **说明** | **举例** |
| :---: | :---: | :---: |
| -b file | 检测文件是否是块设备文件，如果是，则返回 true。 | [ -b $file ] 返回 false。 |
| -c file | 检测文件是否是字符设备文件，如果是，则返回 true。 | [ -c $file ] 返回 false。 |
| -d file | 检测文件是否是目录，如果是，则返回 true。 | [ -d $file ] 返回 false。 |
| -f file | 检测文件是否是普通文件（既不是目录，也不是设备文件），如果是，则返回 true。 | [ -f $file ] 返回 true。 |
| -g file | 检测文件是否设置了 SGID 位，如果是，则返回 true。 | [ -g $file ] 返回 false。 |
| -k file | 检测文件是否设置了粘着位(Sticky Bit)，如果是，则返回 true。 | [ -k $file ] 返回 false。 |
| -p file | 检测文件是否是有名管道，如果是，则返回 true。 | [ -p $file ] 返回 false。 |
| -u file | 检测文件是否设置了 SUID 位，如果是，则返回 true。 | [ -u $file ] 返回 false。 |
| -r file | 检测文件是否可读，如果是，则返回 true。 | [ -r $file ] 返回 true。 |
| -w file | 检测文件是否可写，如果是，则返回 true。 | [ -w $file ] 返回 true。 |
| -x file | 检测文件是否可执行，如果是，则返回 true。 | [ -x $file ] 返回 true。 |
| -s file | 检测文件是否为空（文件大小是否大于0），不为空返回 true。 | [ -s $file ] 返回 true。 |
| -e file | 检测文件（包括目录）是否存在，如果是，则返回 true。 | [ -e $file ] 返回 true。 |


其他检查符：

+ **-S**: 判断某文件是否 socket。
+ **-L**: 检测文件是否存在并且是一个符号链接。

变量 file 表示文件 **/var/www/runoob/test.sh**，它的大小为 100 字节，具有 **rwx** 权限。下面的代码，将检测该文件的各种属性：

```plain
#!/bin/bash

file="/var/www/runoob/test.sh"
if [ -r $file ]
then
   echo "文件可读"
else
   echo "文件不可读"
fi
if [ -w $file ]
then
   echo "文件可写"
else
   echo "文件不可写"
fi
if [ -x $file ]
then
   echo "文件可执行"
else
   echo "文件不可执行"
fi
if [ -f $file ]
then
   echo "文件为普通文件"
else
   echo "文件为特殊文件"
fi
if [ -d $file ]
then
   echo "文件是个目录"
else
   echo "文件不是个目录"
fi
if [ -s $file ]
then
   echo "文件不为空"
else
   echo "文件为空"
fi
if [ -e $file ]
then
   echo "文件存在"
else
   echo "文件不存在"
fi

```

执行脚本，输出结果如下所示：

```plain
文件可读
文件可写
文件可执行
文件为普通文件
文件不是个目录
文件不为空
文件存在

```

### test命令
Shell中的 test 命令用于检查某个条件是否成立，它可以进行数值、字符和文件三个方面的测试。

#### 数值测试
| **参数** | **说明** |
| :---: | :---: |
| -eq | 等于则为真 |
| -ne | 不等于则为真 |
| -gt | 大于则为真 |
| -ge | 大于等于则为真 |
| -lt | 小于则为真 |
| -le | 小于等于则为真 |


实例演示：

```plain
num1=100
num2=100
if test $[num1] -eq $[num2]
then
    echo '两个数相等！'
else
    echo '两个数不相等！'
fi

```

输出结果：

```plain
两个数相等！

```

代码中的 [] 执行基本的算数运算，如：

```plain
#!/bin/bash

a=5
b=6

result=$[a+b] # 注意等号两边不能有空格
echo "result 为： $result"

```

结果为:

```plain
result 为： 11

```

#### 字符串测试
| **参数** | **说明** |
| :---: | :---: |
| = | 等于则为真 |
| != | 不相等则为真 |
| -z 字符串 | 字符串的长度为零则为真 |
| -n 字符串 | 字符串的长度不为零则为真 |


实例演示：

```plain
num1="ru1noob"
num2="runoob"
if test $num1 = $num2
then
    echo '两个字符串相等!'
else
    echo '两个字符串不相等!'
fi

```

输出结果：

```plain
两个字符串不相等!

```

#### 文件测试
| **参数** | **说明** |
| :---: | :---: |
| -e 文件名 | 如果文件存在则为真 |
| -r 文件名 | 如果文件存在且可读则为真 |
| -w 文件名 | 如果文件存在且可写则为真 |
| -x 文件名 | 如果文件存在且可执行则为真 |
| -s 文件名 | 如果文件存在且至少有一个字符则为真 |
| -d 文件名 | 如果文件存在且为目录则为真 |
| -f 文件名 | 如果文件存在且为普通文件则为真 |
| -c 文件名 | 如果文件存在且为字符型特殊文件则为真 |
| -b 文件名 | 如果文件存在且为块特殊文件则为真 |


实例演示：

```plain
cd /bin
if test -e ./bash
then
    echo '文件已存在!'
else
    echo '文件不存在!'
fi

```

输出结果：

```plain
文件已存在!

```

另外，Shell还提供了与( -a )、或( -o )、非( ! )三个逻辑操作符用于将测试条件连接起来，其优先级为："!“最高，”-a"次之，"-o"最低。例如：

```plain
cd /bin
if test -e ./notFile -o -e ./bash
then
    echo '至少有一个文件存在!'
else
    echo '两个文件都不存在'
fi

```

输出结果：

```plain
至少有一个文件存在!

```

### Shell 流程控制
#### if else判断语句
if 语句语法格式：

```plain
if condition
then
    command1 
    command2
    ...
    commandN 
fi

```

写成一行（适用于终端命令提示符）：

```plain
if [ $(ps -ef | grep -c "ssh") -gt 1 ]; then echo "true"; fi

```

if else 语法格式：

```plain
if condition
then
    command1 
    command2
    ...
    commandN
else
    command
fi

```

if else-if else 语法格式：

```plain
if condition1
then
    command1
elif condition2 
then 
    command2
else
    commandN
fi

```

以下实例判断两个变量是否相等：

```plain
a=10
b=20
if [ $a == $b ]
then
   echo "a 等于 b"
elif [ $a -gt $b ]
then
   echo "a 大于 b"
elif [ $a -lt $b ]
then
   echo "a 小于 b"
else
   echo "没有符合的条件"
fi

```

输出结果：

```plain
a 小于 b

```

if else语句经常与test命令结合使用，如下所示：

```plain
num1=$[2*3]
num2=$[1+5]
if test $[num1] -eq $[num2]
then
    echo '两个数字相等!'
else
    echo '两个数字不相等!'
fi

```

输出结果：

```plain
两个数字相等!

```

#### for循环
for循环一般格式为：

```plain
for var in item1 item2 ... itemN
do
    command1
    command2
    ...
    commandN
done

```

写成一行：

```plain
for var in item1 item2 ... itemN; do command1; command2… done;

```

例如，顺序输出当前列表中的数字：

```plain
for loop in 1 2 3 4 5
do
    echo "The value is: $loop"
done

```

输出结果：

```plain
The value is: 1
The value is: 2
The value is: 3
The value is: 4
The value is: 5

```

顺序输出字符串中的字符：

```plain
for str in 'This is a string'
do
    echo $str
done

```

输出结果：

```plain
This is a string

```

#### while循环
while循环格式为：

```plain
while condition
do
    command
done

```

示例：

```plain
#!/bin/bash
int=1
while(( $int运行脚本，输出：

```plain

```

while循环可用于读取键盘信息。下面的例子中，输入信息被设置为变量FILM，按`Ctrl-D`结束循环。

```plain
echo '按下  退出'
echo -n '输入你最喜欢的网站名: '
while read FILM
do
    echo "是的！$FILM 是一个好网站"
done

```

运行脚本，输出类似下面：

```plain
按下  退出
输入你最喜欢的网站名:淘宝
是的！淘宝 是一个好网站

```

#### 无限循环
无限循环语法格式：

```plain
while :
do
    command
done

```

或者

```plain
while true
do
    command
done

```

或者

```plain
for (( ; ; ))

```

#### until 循环
until 循环执行一系列命令直至条件为 true 时停止。

until 循环与 while 循环在处理方式上刚好相反。

一般 while 循环优于 until 循环，但在某些时候—也只是极少数情况下，until 循环更加有用。

until 语法格式:

```plain
until condition
do
    command
done

```

condition 一般为条件表达式，如果返回值为 false，则继续执行循环体内的语句，否则跳出循环。

以下实例我们使用 until 命令来输出 0 ~ 9 的数字：

```plain
#!/bin/bash

a=0

until [ ! $a -lt 10 ]
do
   echo $a
   a=`expr $a + 1`
done

```

运行结果：

输出结果为：

```plain

```

#### case
Shell case语句为多选择语句。可以用case语句匹配一个值与一个模式，如果匹配成功，执行相匹配的命令。case语句格式如下：

```plain
case 值 in
模式1)
    command1
    command2
    ...
    commandN
    ;;
模式2）
    command1
    command2
    ...
    commandN
    ;;
esac

```

下面的脚本提示输入1到4，与每一种模式进行匹配：

```plain
echo '输入 1 到 4 之间的数字:'
echo '你输入的数字为:'
read aNum
case $aNum in
    1)  echo '你选择了 1'
    ;;
    2)  echo '你选择了 2'
    ;;
    3)  echo '你选择了 3'
    ;;
    4)  echo '你选择了 4'
    ;;
    *)  echo '你没有输入 1 到 4 之间的数字'
    ;;
esac

```

输入不同的内容，会有不同的结果，例如：

```plain
输入 1 到 4 之间的数字:
你输入的数字为:
你选择了 3

```

#### 跳出循环
在循环过程中，有时候需要在未达到循环结束条件时强制跳出循环，Shell使用两个命令来实现该功能：break和continue。

break命令允许跳出所有循环（终止执行后面的所有循环）。

下面的例子中，脚本进入死循环直至用户输入数字大于5。要跳出这个循环，返回到shell提示符下，需要使用break命令。

```plain
#!/bin/bash
while :
do
    echo -n "输入 1 到 5 之间的数字:"
    read aNum
    case $aNum in
        1|2|3|4|5) echo "你输入的数字为 $aNum!"
        ;;
        *) echo "你输入的数字不是 1 到 5 之间的! 游戏结束"
            break
        ;;
    esac
done

```

执行以上代码，输出结果为：

```plain
输入 1 到 5 之间的数字:3
你输入的数字为 3!
输入 1 到 5 之间的数字:7
你输入的数字不是 1 到 5 之间的! 游戏结束

```

continue命令与break命令类似，只有一点差别，它不会跳出所有循环，仅仅跳出当前循环。

### Shell输入/输出重定向
重定向命令列表如下：

| **命令** | **说明** |
| :---: | :---: |
| command > file | 将输出重定向到 file。 |
| command | 将输入重定向到 file。 |
| command >> file | 将输出以追加的方式重定向到 file。 |
| n > file | 将文件描述符为 n 的文件重定向到 file。 |
| n >> file | 将文件描述符为 n 的文件以追加的方式重定向到 file。 |
| n >& m | 将输出文件 m 和 n 合并。 |
| n | 将输入文件 m 和 n 合并。 |
|  | 将开始标记 tag 和结束标记 tag 之间的内容作为输入。 |


需要注意的是文件描述符 0 通常是标准输入（STDIN），1 是标准输出（STDOUT），2 是标准错误输出（STDERR）。

---

#### 输出重定向
重定向一般通过在命令间插入特定的符号来实现。特别的，这些符号的语法如下所示:

```plain
command1 > file1

```

上面这个命令执行command1然后将输出的内容存入file1。

注意任何file1内的已经存在的内容将被新内容替代。如果要将新内容添加在文件末尾，请使用>>操作符。

输出重定向会覆盖文件内容：

```plain
$ echo "www.baidu.com" > users
$ cat users
www.baidu.com
$

```

如果不希望文件内容被覆盖，可以使用 >> 追加到文件末尾，例如：

```plain
$ echo "www.baidu.com" >> users
$ cat users
www.baidu.com
www.baidu.com
$

```

#### 输入重定向
和输出重定向一样，Unix 命令也可以从文件获取输入，语法为：

```plain
command1 这样，本来需要从键盘获取输入的命令会转移到文件读取内容。

注意：输出重定向是大于号(>)，输入重定向是小于号(

统计 users 文件的行数,执行以下命令：

```plain
python@ubuntu:~/test$ wc -l test 
4 test

```

也可以将输入重定向到 users 文件：

```plain
python@ubuntu:~/test$ wc -l 注意：上面两个例子的结果不同：第一个例子，会输出文件名；第二个不会，因为它仅仅知道从标准输入读取内容。

同时替换输入和输出，执行command1，从文件infile读取内容，然后将输出写入到outfile中:

```plain
command1  outfile

```

#### 重定向深入讲解
一般情况下，每个 Unix/Linux 命令运行时都会打开三个文件：

+ 标准输入文件(stdin)：stdin的文件描述符为0，Unix程序默认从stdin读取数据。
+ 标准输出文件(stdout)：stdout 的文件描述符为1，Unix程序默认向stdout输出数据。
+ 标准错误文件(stderr)：stderr的文件描述符为2，Unix程序会向stderr流中写入错误信息。

默认情况下，command > file 将 stdout 重定向到 file，command 

如果希望 stderr 重定向到 file，可以这样写：

```plain
$ command 2 > file

```

如果希望 stderr 追加到 file 文件末尾，可以这样写：

```plain
$ command 2 >> file

```

**2** 表示标准错误文件(stderr)。

如果希望将 stdout 和 stderr 合并后重定向到 file，可以这样写：

```plain
$ command > file 2>&1
或者
$ command >> file 2>&1

```

如果希望对 stdin 和 stdout 都重定向，可以这样写：

```plain
$ command file2

```

command 命令将 stdin 重定向到 file1，将 stdout 重定向到 file2。

#### Here Document
Here Document 是 Shell 中的一种特殊的重定向方式，用来将输入重定向到一个交互式 Shell 脚本或程序。

它的基本的形式如下：

```plain
command 它的作用是将两个 delimiter 之间的内容(document) 作为输入传递给 command。

注意：结尾的delimiter 一定要顶格写，前面不能有任何字符，后面也不能有任何字符，包括空格和 tab 缩进。

在命令行中通过 wc -l 命令计算 Here Document 的行数：

```plain
$ wc -l /dev/null 文件
如果希望执行某个命令，但又不希望在屏幕上显示输出结果，那么可以将输出重定向到 /dev/null：

```plain
$ command > /dev/null

```

/dev/null 是一个特殊的文件，写入到它的内容都会被丢弃；如果尝试从该文件读取内容，那么什么也读不到。但是 /dev/null 文件非常有用，将命令的输出重定向到它，会起到"禁止输出"的效果。

如果希望屏蔽 stdout 和 stderr，可以这样写：

```plain
$ command > /dev/null 2>&1

```

0 是标准输入（STDIN），1 是标准输出（STDOUT），2 是标准错误输出（STDERR）。

### 实例
#### 杨辉三角：
```plain
#!/bin/bash

if (test -z $1) ;then 
 read -p "Input high Int Lines:" high 
else 
 high=$1 
fi 
if (test -z $2) ;then 
 space=4
else 
 space=$2
fi

printspace(){
  #空位填充
  for((z=1;z0;j--));do 
    ((a[$j]+=a[$j-1])) 
  done
  printspace $((($high-$i)*$space/2))
  for ((j=0;jsum()&max():
```plain
#!/bin/bash

echo "shell的函数返回值只能为0~255的整数，高位自动丢弃"
sum(){
 sum=0
 for i in $@
 do
  if test $i -ne $1;then
   echo -n "+"
  fi
  echo -n "$i"
  sum=$(($sum+$i))
 done
 echo "=$sum"
 return $(($sum))
}
sum $@
echo "‘sum()’函数返回值："$?

max(){
 max=0
 for i in $@;do
  if test $i -ge $max;then
    max=$i
  fi
 done
 echo "参数最大值：$max"
 return $(($max))
}

max $@

echo "‘max()’函数返回值："$?

```

#### 99乘法表：
```plain
#!/bin/bash

for i in {1..9};do
 for((j=1;j文本编辑命令
### cut命令
```plain
选项与参数：
-d  ：后面接分隔字符。与 -f 一起使用；
-f  ：依据 -d 的分隔字符将一段信息分割成为数段，用 -f 取出第几段的意思；
-c  ：以字符 (characters) 的单位取出固定字符区间；

```

cut以行为单位，根据分隔符把行分成若干列，这样就可以指定选取哪些列了。

```plain
cut -d '分隔字符' -f 选取的列数
echo $PATH|cut -d ':' -f 2  	--选取第2列
echo $PATH|cut -d ':' -f 3,5  	--选取第3列和第5列
echo $PATH|cut -d ':' -f 3-5  	--选取第3列到第5列
echo $PATH|cut -d ':' -f 3-   	--选取第3列到最后1列
echo $PATH|cut -d ':' -f 1-3,5	--选取第1到第3列还有第5列

```

只显示/etc/passwd的用户和shell：

```plain
#cat /etc/passwd | cut -d ':' -f 1,7 
root:/bin/bash
daemon:/bin/sh
bin:/bin/sh

```

### sed命令
sed 可依照脚本的指令来处理、编辑文本文件。

Sed 主要用来自动编辑一个或多个文件、简化对文件的反复操作、编写转换程序等。

语法:

```plain
sed [-e][-f][文本文件]

```

**参数说明**：

+ `-e `以指定的script来处理输入的文本文件。
+ `-f`以指定的script文件来处理输入的文本文件。
+ `-n`仅显示script处理后的结果，一般跟p动作搭配使用。
+ `-i`使用处理后的结果修改文件。

**动作说明**：

+ a：在指定行后面插入内容
+ i：在指定行前面插入内容
+ d：删除指定行
+ c ：替换指定行
+ p ：打印指定行的数据，通常需要跟`-n`选项搭配使用
+ s ：替换指定字符，兼容vim的替换语法，例如 1,20s/old/new/g

#### 元字符集
sed支持一般的正则表达式，下面是支持的正则语法：  
`^`行的开始 如：/^sed/匹配所有以sed开头的行。  
`$`行的结束 如：/sed$/匹配所有以sed结尾的行。  
`.`匹配一个非换行符的任意字符 如：/s.d/匹配s后接一个任意字符，然后是d。  
`*`匹配零或多个字符 如：/*sed/匹配所有模板是一个或多个空格后紧跟sed的行。  
`[]`匹配一个指定范围内的字符，如`/[Ss]ed/`匹配sed和Sed。  
`[^]`匹配一个不在指定范围内的字符，如：`/[^A-RT-Z]ed/`匹配不包含A-R和T-Z的一个字母开头，紧跟ed的行。  
`\(..\)`保存匹配的字符，如s/(love)able/\1rs，loveable被替换成lovers。  
`&`保存搜索字符用来替换其他字符，如`s/love/**&**/`，love这成`**love**`。  
`\`单词的开始，如:/`\>`单词的结束，如/love>/匹配包含以love结尾的单词的行。  
`x\+`重复字符x，至少1次，如：`/o\+/`匹配至少有1个o的行。  
`x\{m\}`重复字符x，m次，如：`/o\{5\}/`匹配包含5个o的行。  
`x\{m,\}`重复字符x,至少m次，如：`/o\{5,\}/`匹配至少有5个o的行。  
`x\{m,n\}`重复字符x，至少m次，不多于n次，如：`/o\{5,10\}/`匹配5-10个o的行。

#### a|i:在指定行位置添加行
```plain
python@xxx:~/test$ cat testfile              
 LINUX!  
 Linux is a free unix-type opterating system.  
 This is a linux testfile!  
 Linux test 

python@xxx:~/test$ sed -e 2a\newline testfile 
 LINUX!  
 Linux is a free unix-type opterating system.  
newline
 This is a linux testfile!  
 Linux test 

```

默认情况下`-e`参数可以省略：

```plain
python@xxx:~/test$ cat testfile|sed '2a\newline'
 LINUX!  
 Linux is a free unix-type opterating system.  
newline
 This is a linux testfile!  
 Linux test 

python@xxx:~/test$ sed '2a newline' testfile
 LINUX!  
 Linux is a free unix-type opterating system.  
newline
 This is a linux testfile!  
 Linux test 

```

``中的内容最好用单引号括起来，如果脚本内容不存在空白字符也可以省略单引号。

在第二行之前添加一行：

```plain
python@xxx:~/test$ sed '2i newline' testfile 
 LINUX!  
newline
 Linux is a free unix-type opterating system.  
 This is a linux testfile!  
 Linux test 

```

最后一行加入 `# This is a test`:

```plain
python@xxx:~/test$ sed '$a # This is a test' testfile 
 LINUX!  
 Linux is a free unix-type opterating system.  
 This is a linux testfile!  
 Linux test 
# This is a test

```

同时添加多行：

```plain
python@xxx:~/test$ cat testfile|sed '2a\newline1\
> newline2'
 LINUX!  
 Linux is a free unix-type opterating system.  
newline1
newline2
 This is a linux testfile!  
 Linux test 

```

#### d:删除指定行
将 /etc/passwd 的内容列出行号，并将第 2~5 行删除！

```plain
[root@www ~]# nl /etc/passwd | sed '2,5d'
1 root:x:0:0:root:/root:/bin/bash
6 sync:x:5:0:sync:/sbin:/bin/sync
7 shutdown:x:6:0:shutdown:/sbin:/sbin/shutdown
.....(后面省略).....

```

只删除第2行：

```plain
nl /etc/passwd | sed '2d' 

```

删除第3到最后一行：

```plain
nl /etc/passwd | sed '3,$d' 

```

删除/etc/passwd所有包含`/usr/sbin/nologin`的行，其他行输出：

```plain
python@xxx:~/test$ nl /etc/passwd | sed  '/\/usr\/sbin\/nologin/d'
1  root:x:0:0:root:/root:/bin/bash
5  sync:x:4:65534:sync:/bin:/bin/sync
19  systemd-timesync:x:100:102:systemd Time Synchronization,,,:/run/systemd:/bin/false
20  systemd-network:x:101:103:systemd Network Management,,,:/run/systemd/netif:/bin/false
....下面忽略

```

#### c:替换指定行
将第2-5行的内容替换成为『No 2-5 number』：

```plain
python@xxx:~/test$ nl /etc/passwd | sed '2,5c No 2-5 number'
1  root:x:0:0:root:/root:/bin/bash
No 2-5 number
6  games:x:5:60:games:/usr/games:/usr/sbin/nologin
.....(后面省略).....

```

#### p:仅显示指定行
不加`-n`选项时，除了输出匹配行，还同时会输出所有行，所以需要加`-n`选项。

仅列出 /etc/passwd 文件内的第 5-7 行：

```plain
python@xxx:~/test$ nl /etc/passwd | sed -n '5,7p'
5  sync:x:4:65534:sync:/bin:/bin/sync
6  games:x:5:60:games:/usr/games:/usr/sbin/nologin
7  man:x:6:12:man:/var/cache/man:/usr/sbin/nologin

```

搜索 /etc/passwd有root关键字的行：

```plain
python@xxx:~/test$ cat /etc/passwd | sed -n '/root/p'  
root:x:0:0:root:/root:/bin/bash
python@xxx:~/test$ sed -n '/root/p' /etc/passwd      
root:x:0:0:root:/root:/bin/bash

```

打印/etc/passwd有以root和bin开头之间的行：

```plain
python@xxx:~/test$ cat /etc/passwd | sed -n '/^root/,/^bin/p'
root:x:0:0:root:/root:/bin/bash
daemon:x:1:1:daemon:/usr/sbin:/usr/sbin/nologin
bin:x:2:2:bin:/bin:/usr/sbin/nologin

```

打印从第五行开始到第一个包含以`/var/mail`开始的行之间的所有行：

```plain
python@xxx:~/test$ nl /etc/passwd | sed -n '5,\/var\/mail/p'   
     5  sync:x:4:65534:sync:/bin:/bin/sync
     6  games:x:5:60:games:/usr/games:/usr/sbin/nologin
     7  man:x:6:12:man:/var/cache/man:/usr/sbin/nologin
     8  lp:x:7:7:lp:/var/spool/lpd:/usr/sbin/nologin
     9  mail:x:8:8:mail:/var/mail:/usr/sbin/nologin

```

#### s:字符串替换
语法：

```plain
sed 's/要被取代的字串/新的字串/g'

```

不论什么字符，紧跟着s命令的都被认为是新的分隔符.

`sed 's#10#100#g'`表示把所有10替换成100，“#”在这里是分隔符，代替了默认的“/”分隔符。

提取本机所有的ip地址：

```plain
[root@VM_0_9_centos ~]# ifconfig | grep 'inet '
        inet 172.16.0.9  netmask 255.255.240.0  broadcast 172.16.15.255
        inet 127.0.0.1  netmask 255.0.0.0
[root@VM_0_9_centos ~]# ifconfig | grep 'inet '|sed 's/^[^0-9]*\([0-9\.]*\).*$/\1/g'
172.16.0.9
127.0.0.1

```

对于以root和bin开头之间的行，每行的末尾添加sed test：

```plain
python@xxx:~/test$ cat /etc/passwd | sed '/^root/,/^bin/s/$/--sed test/'  
root:x:0:0:root:/root:/bin/bash--sed test
daemon:x:1:1:daemon:/usr/sbin:/usr/sbin/nologin--sed test
bin:x:2:2:bin:/bin:/usr/sbin/nologin--sed test
sys:x:3:3:sys:/dev:/usr/sbin/nologin

```

#### y:单字符替换
跟s一样也用于替换，不过s替换的是整体，y替换的是每一字母对应的单个字母

把data中的第一行至第三行中的a替换成A，b替换成B，c替换成C：

```plain
sed '1,3y/abc/ABC/' data 

```

示例：

```plain
python@ubuntu:~/test$ echo "123" | sed 'y/13/34/' 
python@ubuntu:~/test$ echo "axxbxxcxx" | sed 'y/abc/123/'
1xx2xx3xx

```

#### `hHgG`模式空间&保持空间
h命令是将当前模式空间中内容覆盖至保持空间，H命令是将当前模式空间中的内容追加至保持空间

g命令是将当前保持空间中内容覆盖至模式空间，G命令是将当前保持空间中的内容追加至模式空间

模拟tac命令：

```plain
python@ubuntu:~/test$ cat log.txt 
2 this is a test
3 Are you like awk
This's a test
10 There are orange,apple,mongo
python@ubuntu:~/test$ cat log.txt |sed '1!G;h;$!d'
10 There are orange,apple,mongo
This's a test
3 Are you like awk
2 this is a test

```

1!G第1行不 执行“G”命令，从第2行开始执行。

$!d，最后一行不删除（保留最后1行）

下图P表示模式空间，H代表保持空间：

![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1734360091132-c55c9ea1-4934-4b3d-83af-87ddf98e31a8.png)

递增序列：

```plain
python@ubuntu:~/test$ seq 3
python@ubuntu:~/test$ seq 3|sed 'H;g'

```

#### 多次指定`-e`选项进行多点编辑
删除/etc/passwd第三行到末尾的数据，并把bash替换为blueshell：

```plain
nl /etc/passwd | sed -e '3,$d' -e 's/bash/blueshell/'
1  root:x:0:0:root:/root:/bin/blueshell
2  daemon:x:1:1:daemon:/usr/sbin:/bin/sh

```

删除一个文件以#开头的行和空行：

```plain
python@xxx:~/test$ nl abc -ba
     1
     2  b
     3  a
     4
     5  # aaaa
     6
     7  ddd
     8
     9  # sss
    10  eeee
    11
python@xxx:~/test$ sed -e '/^#/d' -e '/^$/d' abc
b
a
ddd
eeee

```

也可以通过`;`实现

```plain
python@ubuntu:~/test$ nl /etc/passwd | sed '3,$d;s/bash/blueshell/'
     1  root:x:0:0:root:/root:/bin/blueshell
     2  daemon:x:1:1:daemon:/usr/sbin:/usr/sbin/nologin
python@ubuntu:~/test$ sed '/^#/d;/^$/d' abc
b
a
ddd
eeee

```

#### 选项`-i`直接修改文件内容
默认情况下sed命令仅仅只是将处理结果显示在控制台，加`-i`选项则会修改文件内容。

将 regular_express.txt 内每一行结尾若为 . 则换成 !

```plain
[root@www ~]# cat regular_express.txt 
taobao.
google.
taobao.
facebook.
zhihu-
weibo-
[root@www ~]# sed -i 's/\.$/\!/g' regular_express.txt
[root@www ~]# cat regular_express.txt 
taobao!
google!
taobao!
facebook!
zhihu-
weibo-

```

### awk命令
AWK是一种处理文本文件的语言，是一个强大的文本分析工具。

之所以叫AWK是因为其取了三位创始人 Alfred Aho，Peter Weinberger, 和 Brian Kernighan 的 Family Name 的首字符。

语法：

```plain
awk [选项参数] 'script' var=value file(s)
或
awk [选项参数] -f scriptfile var=value file(s)

```

**选项参数说明：**

+ -F fs or --field-separator fs  
指定输入文件折分隔符，fs是一个字符串或者是一个正则表达式，如-F:。
+ -v var=value or --asign var=value  
赋值一个用户定义变量。
+ -f scripfile or --file scriptfile  
从脚本文件中读取awk命令。

#### 基本用法
```plain
awk '{[pattern] action}' file

```

每行按空格或TAB分割，输出文本中的1、4列：

```plain
python@ubuntu:~/test$ cat log.txt 
2 this is a test
3 Are you like awk
This's a test
10 There are orange,apple,mongo
python@ubuntu:~/test$ awk '{print $1,$4}' log.txt
3 like
This's 
10 orange,apple,mongo

```

格式化输出：

```plain
python@ubuntu:~/test$ awk '{printf "%-8s %-10s\n",$1,$4}' log.txt
2        a         
3        like      
This's             

```

##### `-F`指定分割字符
```plain
awk -F  #-F相当于内置变量FS, 指定分割字符

```

使用:分割,取/etc/passwd文件每个用户对应shell：

```plain
python@ubuntu:~/test$ awk -F: '{print $1,$7}'  /etc/passwd 
root /bin/bash
daemon /usr/sbin/nologin
bin /usr/sbin/nologin
sys /usr/sbin/nologin
sync /bin/sync
# 或者使用内建变量
python@ubuntu:~/test$ awk 'BEGIN{FS=":"} {print $1,$7}'  /etc/passwd  
root /bin/bash
daemon /usr/sbin/nologin
bin /usr/sbin/nologin

```

同时使用:和/l两个分隔符分割/etc/passwd文件

```plain
python@ubuntu:~/test$ awk -F '[:\/]' '{print $1,$7}'  /etc/passwd      
root root
daemon usr
bin bin

```

##### `-v`设置变量
```plain
awk -v  # 设置变量

```

例子：

```plain
python@ubuntu:~/test$ cat log.txt 
2 this is a test
3 Are you like awk
This's a test
10 There are orange,apple,mongo
python@ubuntu:~/test$ awk -va=1 '{print $1,$1+a}' log.txt
This's 1
10 11
python@ubuntu:~/test$ awk -va=1 -vb=s '{print $1,$1+a,$1b}' log.txt
2 3 2s
3 4 3s
This's 1 This'ss
10 11 10s

```

##### `-f`指定awk脚本
```plain
awk -f {awk脚本} {文件名}

```

脚本模块：

+ BEGIN{ 这里面放的是执行前的语句 }
+ END {这里面放的是处理完所有的行后要执行的语句 }
+ {这里面放的是处理每一行时要执行的语句}

假设有这么一个文件（学生成绩表）：

```plain
$ cat score.txt
Marry   2143 78 84 77
Jack    2321 66 78 45
Tom     2122 48 77 71
Mike    2537 87 97 95
Bob     2415 40 57 62

```

awk脚本如下：

```plain
$ cat cal.awk
#!/bin/awk -f
#运行前
BEGIN {
    math = 0
    english = 0
    computer = 0

    printf "NAME    NO.   MATH  ENGLISH  COMPUTER   TOTAL\n"
    printf "---------------------------------------------\n"
}
#运行中
{
    math+=$3
    english+=$4
    computer+=$5
    printf "%-6s %-6s %4d %8d %8d %8d\n", $1,$2,$3,$4,$5,$3+$4+$5
}
#运行后
END {
    printf "---------------------------------------------\n"
    printf "  TOTAL:%10d %8d %8d \n", math, english, computer
    printf "AVERAGE:%10.2f %8.2f %8.2f\n", math/NR, english/NR, computer/NR
}

```

我们来看一下执行结果：

```plain
$ awk -f cal.awk score.txt
NAME    NO.   MATH  ENGLISH  COMPUTER   TOTAL
---------------------------------------------
Marry  2143     78       84       77      239
Jack   2321     66       78       45      189
Tom    2122     48       77       71      196
Mike   2537     87       97       95      279
Bob    2415     40       57       62      159
---------------------------------------------
  TOTAL:       319      393      350
AVERAGE:     63.80    78.60    70.00

```

#### AWK工作原理
AWK 工作流程可分为三个部分：

+ 读输入文件之前执行的代码段（由BEGIN关键字标识）。
+ 主循环执行输入文件的代码段。
+ 读输入文件之后的代码段（由END关键字标识）。

命令结构:

```plain
awk 'BEGIN{ commands } pattern{ commands } END{ commands }'

```

下面的流程图描述出了 AWK 的工作流程：

![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1734360092255-4129295f-b6f6-4d66-a714-7be4f38e1e40.png)

+ 1、通过关键字 BEGIN 执行 BEGIN 块的内容，即 BEGIN 后花括号 **{}** 的内容。
+ 2、完成 BEGIN 块的执行，开始执行body块。
+ 3、读入有 **\n** 换行符分割的记录。
+ 4、将记录按指定的域分隔符划分域，填充域，**$0** 则表示所有域(即一行内容)，**1 ∗ ∗ 表 示 第 一 个 域 ， ∗ ∗ 1** 表示第一个域，**1****∗****∗****表****示****第****一****个****域****，**∗**∗****n** 表示第 n 个域。
+ 5、依次执行各 BODY 块，pattern 部分匹配该行内容成功后，才会执行 awk-commands 的内容。
+ 6、循环读取并执行各行直到文件结束，完成body块执行。
+ 7、开始 END 块执行，END 块可以输出最终结果。

##### 运算符
| **运算符** | **描述** |
| :---: | :---: |
| = += -= *= /= %= ^= **= | 赋值 |
| ?: | C条件表达式 |
|  |  |
| && | 逻辑与 |
| ~ 和 !~ | 匹配正则表达式和不匹配正则表达式 |
| >= != == | 关系运算符 |
| 空格 | 连接 |
| + - | 加，减 |
| * / % | 乘，除与求余 |
| + - ! | 一元加，减和逻辑非 |
| ^ *** | 求幂 |
| ++ – | 增加或减少，作为前缀或后缀 |
| $ | 字段引用 |
| in | 数组成员 |


**过滤第一列大于2的行**

```plain
$ awk '$1>2' log.txt    #命令
3 Are you like awk
This's a test
10 There are orange,apple,mongo

```

**过滤第一列等于2的行**

```plain
$ awk '$1==2 {print $1,$3}' log.txt    #命令
#输出
2 is

```

**过滤第一列大于2并且第二列等于’Are’的行**

```plain
$ awk '$1>2 && $2=="Are" {print $1,$2,$3}' log.txt    #命令
#输出
3 Are you

```

**内建变量**

| **变量** | **描述** |
| :---: | :---: |
| $n | 当前记录的第n个字段，字段间由FS分隔 |
| $0 | 完整的输入记录 |
| ARGC | 命令行参数的数目 |
| ARGIND | 命令行中当前文件的位置(从0开始算) |
| ARGV | 包含命令行参数的数组 |
| CONVFMT | 数字转换格式(默认值为%.6g)ENVIRON环境变量关联数组 |
| ERRNO | 最后一个系统错误的描述 |
| FIELDWIDTHS | 字段宽度列表(用空格键分隔) |
| FILENAME | 当前文件名 |
| FNR | 各文件分别计数的行号 |
| FS | 字段分隔符(默认是任何空格) |
| IGNORECASE | 如果为真，则进行忽略大小写的匹配 |
| NF | 一条记录的字段的数目 |
| NR | 已经读出的记录数，就是行号，从1开始 |
| OFMT | 数字的输出格式(默认值是%.6g) |
| OFS | 输出记录分隔符（输出换行符），输出时用指定的符号代替换行符 |
| ORS | 输出记录分隔符(默认值是一个换行符) |
| RLENGTH | 由match函数所匹配的字符串的长度 |
| RS | 记录分隔符(默认是一个换行符) |
| RSTART | 由match函数所匹配的字符串的第一个位置 |
| SUBSEP | 数组下标分隔符(默认值是/034) |


格式化变量说明：

+ %s 输出字符串
+ %i 输出整数
+ %f 输出浮点数

%-5s 格式为左对齐且宽度为5的字符串代替（-表示左对齐），不使用则是又对齐。  
%-4.2f 格式为左对齐宽度为4，保留两位小数。

```plain
python@ubuntu:~/test$ awk 'BEGIN{printf "%4s %4s %4s %4s %4s %4s %4s %4s %4s\n","FILENAME","ARGC","FNR","FS","NF","NR","OFS","ORS","RS";printf "---------------------------------------------\n"} {printf "%4s %4s %4s %4s %4s %4s %4s %4s %4s\n",FILENAME,ARGC,FNR,FS,NF,NR,OFS,ORS,RS}'  log.txt
FILENAME ARGC  FNR   FS   NF   NR  OFS  ORS   RS
---------------------------------------------
log.txt    2    1         5    1         
log.txt    2    2         5    2         
log.txt    2    3         3    3          
log.txt    2    4         4    4         

python@ubuntu:~/test$ awk -F: 'BEGIN{printf "%4s %4s %4s %4s %4s %4s %4s %4s %4s\n","FILENAME","ARGC","FNR","FS","NF","NR","OFS","ORS","RS";printf "---------------------------------------------\n"} {printf "%4s %4s %4s %4s %4s %4s %4s %4s %4s\n",FILENAME,ARGC,FNR,FS,NF,NR,OFS,ORS,RS}'  log.txt
FILENAME ARGC  FNR   FS   NF   NR  OFS  ORS   RS
---------------------------------------------
log.txt    2    1    :    1    1         
log.txt    2    2    :    1    2         
log.txt    2    3    :    1    3         
log.txt    2    4    :    1    4    

```

##### 输出顺序号 NR, 匹配文本行号
```plain
python@ubuntu:~/test$ awk '{print NR,FNR,$1,$2,$3}' log.txt
1 1 2 this is
2 2 3 Are you
3 3 This's a test
4 4 10 There are

```

##### 指定输出分割符
```plain
python@ubuntu:~/test$ cat log.txt 
2 this is a test
3 Are you like awk
This's a test
10 There are orange,apple,mongo
python@ubuntu:~/test$ awk '{print $1,$2,$5}' OFS=" $ "  log.txt
2 $ this $ test
3 $ Are $ awk
This's $ a $ 
10 $ There $ 

```

##### 忽略大小写
```plain
$ awk 'BEGIN{IGNORECASE=1} /this/' log.txt
---------------------------------------------
2 this is a test
This's a test

```

#### 正则字符串匹配
**~ 表示模式开始。// 中是模式。**

输出第二列包含 “th”，并打印第二列与第四列：

```plain
python@ubuntu:~/test$ awk '$2 ~ /th/ {print $2,$4}' log.txt
this a

```

输出包含"re"的行：

```plain
python@ubuntu:~/test$ awk '/re/' log.txt
3 Are you like awk
10 There are orange,apple,mongo

```

**!表示取反**

输出第二列不包含 “th”，并打印第二列与第四列：

```plain
python@ubuntu:~/test$ awk '$2 !~ /th/ {print $2,$4}' log.txt
Are like
a 
There orange,apple,mongo

```

输出不包含"re"的行：

```plain
python@ubuntu:~/test$ awk '!/re/' log.txt
2 this is a test
This's a test

```

#### 一些实例
**计算文件大小**

```plain
$ ls -l *.txt | awk '{sum+=$6} END {print sum}'
--------------------------------------------------
666581

```

**从文件中找出长度大于80的行**

```plain
awk 'length>80' log.txt

```

**打印九九乘法表**

```plain
seq 9 | sed 'H;g' | awk -v RS='' '{for(i=1;i访问日志分析**

日志格式

```plain
python@ubuntu:~/test$ head access.log -n1
42.236.10.75 "changtou.xiaoxiaoming.xyz" [14/Oct/2019:12:47:18 +0800] "GET /logo/8@3x.png HTTP/1.1" 200 26053 "https://changtou.xiaoxiaoming.xyz/" "Mozilla/5.0 (Linux; U; Android 8.1.0; zh-CN; EML-AL00 Build/HUAWEIEML-AL00) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/57.0.2987.108 baidu.sogo.uc.UCBrowser/11.9.4.974 UWS/2.13.1.48 Mobile Safari/537.36 AliApp(DingTalk/4.5.11) com.alibaba.android.rimet/10487439 Channel/227200 language/zh-CN" "42.236.10.75" rt="0.000" uct="-" uht="-" urt="-"

```

示例：

```plain
1.数据清洗
awk '($6 ~ /.html/) && ($8 ~ /200/)  {print $0}' access.log > clean.log

2.统计PV
python@ubuntu:~/test$ awk '{print $0}'  clean.log | wc -l
python@ubuntu:~/test$ cut -d ' ' -f 1 clean.log|wc -l    

3:UV
python@ubuntu:~/test$ awk '{print $1}'  clean.log |sort|uniq| wc -l
python@ubuntu:~/test$ cut -d ' ' -f 1 clean.log|sort|uniq| wc -l

4:获取每天访问网站最多的前10名用户
awk '{print $1}' clean.log|sort|uniq -c|sort -k 1nr|head
或
cut -d ' ' -f 1 clean.log|sort|uniq -c|sort -k 1nr|head

```

### awk编程
#### 条件语句IF&ELSE
IF 条件语句语法格式如下：

```plain
if (condition)
    action

```

也可以使用花括号来执行一组操作：

```plain
if (condition)
{
    action-1
    action-1
    .
    .
    action-n
}

```

判断数字是奇数还是偶数：

```plain
python@ubuntu:~/test$ awk 'BEGIN {num = 10; if (num % 2 == 0) printf "%d 是偶数\n", num }'
10 是偶数

```

IF - ELSE 条件语句语法格式如下：

```plain
if (condition)
    action-1
else
    action-2

```

在条件语句 condition 为 true 时只需 action-1，否则执行 action-2。

```plain
python@ubuntu:~/test$ awk 'BEGIN {
>     num = 11; 
>     if (num % 2 == 0) printf "%d 是偶数\n", num; 
>     else printf "%d 是奇数\n", num 
> }'
11 是奇数
python@ubuntu:~/test$ awk 'BEGIN {num = 11; if (num % 2 == 0) printf "%d 是偶数\n", num; else printf "%d 是奇数\n", num }'
11 是奇数

```

可以创建多个 IF - ELSE 格式的判断语句来实现多个条件的判断：

```plain
$ awk 'BEGIN {
a=30;
if (a==10)
  print "a = 10";
else if (a == 20)
  print "a = 20";
else if (a == 30)
  print "a = 30";
}'

```

输出结果：

```plain
python@ubuntu:~/test$ awk 'BEGIN {
> a=30;
> if (a==10)
>   print "a = 10";
> else if (a == 20)
>   print "a = 20";
> else if (a == 30)
>   print "a = 30";
> }'
a = 30

```

#### 循环语句For&While
For 循环的语法如下：

```plain
for (initialisation; condition; increment/decrement)
    action

```

下面的例子使用 For 循环输出数字 1 至 5：

```plain
python@ubuntu:~/test$ awk 'BEGIN { for (i = 1; i While 循环的语法如下：

```plain
while (condition)
    action

```

下面是使用 While 循环输出数字 1 到 5 的例子：

```plain
python@ubuntu:~/test$ awk 'BEGIN {i = 1; while (i 在下面的示例子中，当计算的和大于 50 的时候使用 break 结束循环：

```plain
$ awk 'BEGIN {
   sum = 0; for (i = 0; i  50) break; else print "Sum =", sum 
   } 
}'

```

输出结果为：

```plain
python@ubuntu:~/test$ awk 'BEGIN {
>    sum = 0; for (i = 0; i        sum += i; if (sum > 50) break; else print "Sum =", sum 
>    } 
> }'
Sum = 0
Sum = 1
Sum = 3
Sum = 6
Sum = 10
Sum = 15
Sum = 21
Sum = 28
Sum = 36
Sum = 45

```

Continue 语句用于在循环体内部结束本次循环，从而直接进入下一次循环迭代。

下面的例子输出 1 到 20 之间的偶数：

```plain
python@ubuntu:~/test$ awk 'BEGIN {for (i = 1; i Exit 用于结束脚本程序的执行。

该函数接受一个整数作为参数表示 AWK 进程结束状态。 如果没有提供该参数，其默认状态为 0。

下面例子中当和大于 50 时结束 AWK 程序。

```plain
$ awk 'BEGIN {
   sum = 0; for (i = 0; i  50) exit(10); else print "Sum =", sum 
   } 
}'

```

输出结果为：

```plain
python@ubuntu:~/test$ awk 'BEGIN {
>    sum = 0; for (i = 0; i        sum += i; if (sum > 50) exit(10); else print "Sum =", sum 
>    } 
> }'
Sum = 0
Sum = 1
Sum = 3
Sum = 6
Sum = 10
Sum = 15
Sum = 21
Sum = 28
Sum = 36
Sum = 45
python@ubuntu:~/test$ echo $?

```

#### awk数组
AWK的数组底层数据结构是散列表，索引可以是数字或字符串。

数组使用的语法格式：

```plain
array_name[index]=value

```

创建数组并访问数组元素：

```plain
$ awk 'BEGIN {
sites["taobao"]="www.taobao.com";
sites["google"]="www.google.com"
print sites["taobao"] "\n" sites["google"]
}'

```

删除数组元素语法格式：

```plain
delete array_name[index]

```

下面的例子中，数组中的 google 元素被删除（删除命令没有输出）：

```plain
$ awk 'BEGIN {
sites["taobao"]="www.taobao.com";
sites["google"]="www.google.com"
delete sites["google"];
print sites["google"]
}'

```

AWK 本身不支持多维数组，不过我们可以很容易地使用一维数组模拟实现多维数组。

如下示例为一个 3x3 的三维数组：

```plain
100 200 300
400 500 600
700 800 900

```

以上实例中，`array[0][0]` 存储 100，`array[0][1]` 存储 200 ，依次类推。为了在 `array[0][0]` 处存储 100, 可以使用字符串0,0 作为索引： array[“0,0”] = 100。

下面是模拟二维数组的例子：

```plain
$ awk 'BEGIN {
array["0,0"] = 100;
array["0,1"] = 200;
array["0,2"] = 300;
array["1,0"] = 400;
array["1,1"] = 500;
array["1,2"] = 600;
# 输出数组元素
print "array[0,0] = " array["0,0"];
print "array[0,1] = " array["0,1"];
print "array[0,2] = " array["0,2"];
print "array[1,0] = " array["1,0"];
print "array[1,1] = " array["1,1"];
print "array[1,2] = " array["1,2"];
}'

```

执行上面的命令可以得到如下结果：

```plain
array[0,0] = 100
array[0,1] = 200
array[0,2] = 300
array[1,0] = 400
array[1,1] = 500
array[1,2] = 600

```

在数组上可以执行很多操作，比如，使用 asort 完成数组元素的排序，或者使用 asorti 实现数组索引的排序等等。

#### AWK 用户自定义函数
自定义函数的语法格式为：

```plain
function function_name(argument1, argument2, ...)
{
    function body
}

```

以下实例实现了两个简单函数，它们分别返回两个数值中的最小值和最大值。

文件 functions.awk 代码如下：

```plain
# 返回最小值
function find_min(num1, num2)
{
  if (num1  num2)
    return num1
  return num2
}

# 主函数
function main(num1, num2)
{
  # 查找最小值
  result = find_min(10, 20)
  print "Minimum =", result

  # 查找最大值
  result = find_max(10, 20)
  print "Maximum =", result
}

# 脚本从这里开始执行
BEGIN {
  main(10, 20)
}

```

执行 functions.awk 文件，可以得到如下的结果：

```plain
$ awk -f functions.awk 
Minimum = 10
Maximum = 20

```

#### AWK 内置函数
AWK 内置函数主要有以下几种：

+ 算数函数
+ 字符串函数
+ 时间函数
+ 位操作函数
+ 其它函数

#### 算数函数
| **函数名** | **说明** | **实例** |
| :---: | :---: | :---: |
| atan2( y, x ) | 返回 y/x 的反正切。 | `$ awk 'BEGIN { PI = 3.14159265 x = -10 y = 10 result = atan2 (y,x) * 180 / PI; printf "The arc tangent for (x=%f, y=%f) is %f degrees\n", x, y, result }'`输出结果为：`The arc tangent for (x=-10.000000, y=10.000000) is 135.000000 degrees` |
| cos( x ) | 返回 x 的余弦；x 是弧度。 | `$ awk 'BEGIN { PI = 3.14159265 param = 60 result = cos(param * PI / 180.0); printf "The cosine of %f degrees is %f.\n", param, result }'`输出结果为：`The cosine of 60.000000 degrees is 0.500000.` |
| sin( x ) | 返回 x 的正弦；x 是弧度。 | `$ awk 'BEGIN { PI = 3.14159265 param = 30.0 result = sin(param * PI /180) printf "The sine of %f degrees is %f.\n", param, result }'`输出结果为：`The sine of 30.000000 degrees is 0.500000.` |
| exp( x ) | 返回 x 幂函数。 | `$ awk 'BEGIN { param = 5 result = exp(param); printf "The exponential value of %f is %f.\n", param, result }'`输出结果为：`The exponential value of 5.000000 is 148.413159.` |
| log( x ) | 返回 x 的自然对数。 | `$ awk 'BEGIN { param = 5.5 result = log (param) printf "log(%f) = %f\n", param, result }'`输出结果为：`log(5.500000) = 1.704748` |
| sqrt( x ) | 返回 x 平方根。 | `$ awk 'BEGIN { param = 1024.0 result = sqrt(param) printf "sqrt(%f) = %f\n", param, result }'`输出结果为：`sqrt(1024.000000) = 32.000000` |
| int( x ) | 返回 x 的截断至整数的值。 | `$ awk 'BEGIN { param = 5.12345 result = int(param) print "Truncated value =", result }'`输出结果为：`Truncated value = 5` |
| rand( ) | 返回任意数字 n，其中 0 | `$ awk 'BEGIN { print "Random num1 =" , rand() print "Random num2 =" , rand() print "Random num3 =" , rand() }'`输出结果为：`Random num1 = 0.237788 Random num2 = 0.291066 Random num3 = 0.845814` |
| srand( [Expr] ) | 将 rand 函数的种子值设置为 Expr 参数的值，或如果省略 Expr 参数则使用某天的时间。返回先前的种子值。 | `$ awk 'BEGIN { param = 10 printf "srand() = %d\n", srand() printf "srand(%d) = %d\n", param, srand(param) }'`输出结果为：`srand() = 1 srand(10) = 1417959587` |


##### 字符串函数
| **函数** | **说明** | **实例** |
| :---: | :---: | :---: |
| gsub( Ere, Repl, [ In ] ) | gsub 是全局替换( global substitution )的缩写。除了正则表达式所有具体值被替代这点，它和 sub 函数完全一样地执行。 | `$ awk 'BEGIN { str = "Hello, World" print "String before replacement = " str gsub("World", "Jerry", str) print "String after replacement = " str }'`输出结果为：`String before replacement = Hello, World String after replacement = Hello, Jerry` |
| sub(regex,sub,string) | sub 函数执行一次子串替换。它将第一次出现的子串用 regex 替换。第三个参数是可选的，默认为 $0。 | `$ awk 'BEGIN { str = "Hello, World" print "String before replacement = " str sub("World", "Jerry", str) print "String after replacement = " str }'`输出结果为：`String before replacement = Hello, World String after replacement = Hello, Jerry` |
| substr(str, start, l) | substr 函数返回 str 字符串中从第 start 个字符开始长度为 l 的子串。如果没有指定 l 的值，返回 str 从第 start 个字符开始的后缀子串。 | `$ awk 'BEGIN { str = "Hello, World !!!" subs = substr(str, 1, 5) print "Substring = " subs }'`输出结果为：`Substring = Hello` |
| index( String1, String2 ) | 在由 String1 参数指定的字符串（其中有出现 String2 指定的参数）中，返回位置，从 1 开始编号。如果 String2 参数不在 String1 参数中出现，则返回 0（零）。 | `$ awk 'BEGIN { str = "One Two Three" subs = "Two" ret = index(str, subs) printf "Substring \"%s\" found at %d location.\n", subs, ret }'`输出结果为：`Substring "Two" found at 5 location.` |
| length [(String)] | 返回 String 参数指定的字符串的长度（字符形式）。如果未给出 String 参数，则返回整个记录的长度（$0 记录变量）。 | `$ awk 'BEGIN { str = "Hello, World !!!" print "Length = ", length(str) }'`输出结果为：`Substring "Two" found at 5 location.` |
| blength [(String)] | 返回 String 参数指定的字符串的长度（以字节为单位）。如果未给出 String 参数，则返回整个记录的长度（$0 记录变量）。 |  |
| substr( String, M, [ N ] ) | 返回具有 N 参数指定的字符数量子串。子串从 String 参数指定的字符串取得，其字符以 M 参数指定的位置开始。M 参数指定为将 String 参数中的第一个字符作为编号 1。如果未指定 N 参数，则子串的长度将是 M 参数指定的位置到 String 参数的末尾 的长度。 | `$ awk 'BEGIN { str = "Hello, World !!!" subs = substr(str, 1, 5) print "Substring = " subs }'`输出结果为：`Substring = Hello` |
| match( String, Ere ) | 在 String 参数指定的字符串（Ere 参数指定的扩展正则表达式出现在其中）中返回位置（字符形式），从 1 开始编号，或如果 Ere 参数不出现，则返回 0（零）。RSTART 特殊变量设置为返回值。RLENGTH 特殊变量设置为匹配的字符串的长度，或如果未找到任何匹配，则设置为 -1（负一）。 | `$ awk 'BEGIN { str = "One Two Three" subs = "Two" ret = match(str, subs) printf "Substring \"%s\" found at %d location.\n", subs, ret }'`输出结果为：`Substring "Two" found at 5 location.` |
| split( String, A, [Ere] ) | 将 String 参数指定的参数分割为数组元素 A[1], A[2], . . ., A[n]，并返回 n 变量的值。此分隔可以通过 Ere 参数指定的扩展正则表达式进行，或用当前字段分隔符（FS 特殊变量）来进行（如果没有给出 Ere 参数）。除非上下文指明特定的元素还应具有一个数字值，否则 A 数组中的元素用字符串值来创建。 | `$ awk 'BEGIN { str = "One,Two,Three,Four" split(str, arr, ",") print "Array contains following values" for (i in arr) { print arr[i] } }'`输出结果为：`Array contains following values One Two Three Four` |
| tolower( String ) | 返回 String 参数指定的字符串，字符串中每个大写字符将更改为小写。大写和小写的映射由当前语言环境的 LC_CTYPE 范畴定义。 | `$ awk 'BEGIN { str = "HELLO, WORLD !!!" print "Lowercase string = " tolower(str) }'`输出结果为：`Lowercase string = hello, world !!!` |
| toupper( String ) | 返回 String 参数指定的字符串，字符串中每个小写字符将更改为大写。大写和小写的映射由当前语言环境的 LC_CTYPE 范畴定义。 | `$ awk 'BEGIN { str = "hello, world !!!" print "Uppercase string = " toupper(str) }'`输出结果为：`Uppercase string = HELLO, WORLD !!!` |
| sprintf(Format, Expr, Expr, . . . ) | 根据 Format 参数指定的 printf 子例程格式字符串来格式化 Expr 参数指定的表达式并返回最后生成的字符串。 | `$ awk 'BEGIN { str = sprintf("%s", "Hello, World !!!") print str }'`输出结果为：`Hello, World !!!` |
| strtonum(str) | strtonum 将字符串 str 转换为数值。 如果字符串以 0 开始，则将其当作十进制数；如果字符串以 0x 或 0X 开始，则将其当作十六进制数；否则，将其当作浮点数。 | `$ awk 'BEGIN { print "Decimal num = " strtonum("123") print "Octal num = " strtonum("0123") print "Hexadecimal num = " strtonum("0x123") }'`输出结果为：`Decimal num = 123 Octal num = 83 Hexadecimal num = 291` |


**注：****Ere** 部分可以是正则表达式。

**1、gsub、sub 使用**

```plain
$ awk 'BEGIN{info="this is a test2012test!";gsub(/[0-9]+/,"||",info);print info}'
this is a test||test!

```

**2、查找字符串（index 使用）**

使用了三元运算符: **表达式 ? 动作1 : 动作2**

```plain
$ awk 'BEGIN{info="this is a test2012test!";print index(info,"11111")?"ok":"no found";}'
no found
$ awk 'BEGIN{info="this is a test2012test!";print index(info,"is")?"ok":"no found";}'
ok
$ awk 'BEGIN{info="this is a test2012test!";print index(info,"test")?"ok":"no found";}'
ok

```

**3、正则表达式匹配查找(match 使用）**

```plain
$ awk 'BEGIN{info="this is a test2012test!";print match(info,/[0-9]+/)?"ok":"no found";}'
ok

```

**4、截取字符串(substr使用）**

从第 4 个 字符开始，截取 10 个长度字符串。

```plain
$ awk 'BEGIN{info="this is a test2012test!";print substr(info,4,10);}'
s is a tes

```

**5、字符串分割（split使用）**

```plain
$ awk 'BEGIN{info="this is a test";split(info,tA," ");print length(tA);for(k in tA){print k,tA[k];}}'
2 is
4 test
1 this

```

分割 info，将 info 字符串使用空格切分为动态数组 tA。注意 awk for …in 循环，是一个无序的循环。 并不是从数组下标 1…n ，因此使用时候需要特别注意。

##### 时间函数
| **函数名** | **说明** | **实例** |
| :---: | :---: | :---: |
| mktime( YYYY MM DD HH MM SS[ DST]) | 生成时间格式 | `$ awk 'BEGIN { print "Number of seconds since the Epoch = " mktime("2014 12 14 30 20 10") }'`输出结果为：`Number of seconds since the Epoch = 1418604610` |
| strftime([format [, timestamp]]) | 格式化时间输出，将时间戳转为时间字符串 具体格式，见下表. | `$ awk 'BEGIN { print strftime("Time = %m/%d/%Y %H:%M:%S", systime()) }'`输出结果为：`Time = 12/14/2014 22:08:42` |
| systime() | 得到时间戳,返回从1970年1月1日开始到当前时间(不计闰年)的整秒数 | `awk 'BEGIN{now=systime();print now}'`输出结果为：`1343210982` |


strftime 日期和时间格式说明符:

| **序号** | **描述** |
| :---: | :---: |
| %a | 星期缩写(Mon-Sun)。 |
| %A | 星期全称（Monday-Sunday）。 |
| %b | 月份缩写（Jan）。 |
| %B | 月份全称（January）。 |
| %c | 本地日期与时间。 |
| %C | 年份中的世纪部分，其值为年份整除100。 |
| %d | 十进制日期(01-31) |
| %D | 等价于 %m/%d/%y. |
| %e | 日期，如果只有一位数字则用空格补齐 |
| %F | 等价于 %Y-%m-%d，这也是 ISO 8601 标准日期格式。 |
| %g | ISO8610 标准周所在的年份模除 100（00-99)。比如，1993 年 1 月 1 日属于 1992 年的第 53 周。所以，虽然它是 1993 年第 1 天，但是其 ISO8601 标准周所在年份却是 1992。同样，尽管 1973 年 12 月 31 日属于 1973 年但是它却属于 1994 年的第一周。所以 1973 年 12 月 31 日的 ISO8610 标准周所在的年是 1974 而不是 1973。 |
| %G | ISO 标准周所在年份的全称。 |
| %h | 等价于 %b. |
| %H | 用十进制表示的 24 小时格式的小时(00-23) |
| %I | 用十进制表示的 12 小时格式的小时（00-12） |
| %j | 一年中的第几天（001-366） |
| %m | 月份（01-12） |
| %M | 分钟数（00-59) |
| %n | 换行符 (ASCII LF) |
| %p | 十二进制表示法（AM/PM） |
| %r | 十二进制表示法的时间（等价于 %I:%M:%S %p）。 |
| %R | 等价于 %H:%M。 |
| %S | 时间的秒数值（00-60） |
| %t | 制表符 (tab) |
| %T | 等价于 %H:%M:%S。 |
| %u | 以数字表示的星期(1-7),1 表示星期一。 |
| %U | 一年中的第几个星期（第一个星期天作为第一周的开始），00-53 |
| %V | 一年中的第几个星期（第一个星期一作为第一周的开始），01-53。 |
| %w | 以数字表示的星期（0-6），0表示星期日 。 |
| %W | 十进制表示的一年中的第几个星期（第一个星期一作为第一周的开始），00-53。 |
| %x | 本地日期表示 |
| %X | 本地时间表示 |
| %y | 年份模除 100。 |
| %Y | 十进制表示的完整年份。 |
| %z | 时区，表示格式为+HHMM（例如，格式要求生成的 RFC 822或者 RFC 1036 时间头） |
| %Z | 时区名称或缩写，如果时区待定则无输出。 |


##### 位操作函数
| **函数名** | **说明** | **实例** |
| :---: | :---: | :---: |
| and | 位与操作。 | `$ awk 'BEGIN { num1 = 10 num2 = 6 printf "(%d AND %d) = %d\n", num1, num2, and(num1, num2) }'`输出结果为：`(10 AND 6) = 2` |
| compl | 按位求补。 | `$ awk 'BEGIN { num1 = 10 printf "compl(%d) = %d\n", num1, compl(num1) }'`输出结果为：`compl(10) = 9007199254740981` |
| lshift | 左移位操作 | `$ awk 'BEGIN { num1 = 10 printf "lshift(%d) by 1 = %d\n", num1, lshift(num1, 1) }'`输出结果为：`lshift(10) by 1 = 20` |
| rshift | 右移位操作 | `$ awk 'BEGIN { num1 = 10 printf "rshift(%d) by 1 = %d\n", num1, rshift(num1, 1) }'`输出结果为：`rshift(10) by 1 = 5` |
| or | 按位或操作 | `$ awk 'BEGIN { num1 = 10 num2 = 6 printf "(%d OR %d) = %d\n", num1, num2, or(num1, num2) }'`输出结果为：`(10 OR 6) = 14` |
| xor | 按位异或操作 | `$ awk 'BEGIN { num1 = 10 num2 = 6 printf "(%d XOR %d) = %d\n", num1, num2, xor(num1, num2) }'`输出结果为：`(10 bitwise xor 6) = 12` |


##### 其他函数
| **函数名** | **说明** | **实例** |
| :---: | :---: | :---: |
| close(expr) | 关闭管道的文件 | `$ awk 'BEGIN { cmd = "tr [a-z] [A-Z]" print "hello, world !!!" |
| delete | 用于从数组中删除元素 | `$ awk 'BEGIN { arr[0] = "One" arr[1] = "Two" arr[2] = "Three" arr[3] = "Four" print "Array elements before delete operation:" for (i in arr) { print arr[i] } delete arr[0] delete arr[1] print "Array elements after delete operation:" for (i in arr) { print arr[i] } }'`输出结果为：`Array elements before delete operation: One Two Three Four Array elements after delete operation: Three Four` |
| exit | 终止脚本执行，它可以接受可选的参数 expr 传递 AWK 返回状态。 | `$ awk 'BEGIN { print "Hello, World !!!" exit 10 print "AWK never executes this statement." }'`输出结果为：`Hello, World !!!` |
| flush | 刷新打开文件或管道的缓冲区 |  |
| getline | 读入下一行 | 使用 getline 从文件 marks.txt 中读入一行并输出：`$ awk '{getline; print $0}' marks.txt`，AWK 从文件 marks.txt 中读入一行存储到变量 0 中。在下一条语句中，我们使用 getline 读入下一行。因此AWK读入第二行并存储到 0 中。最后，AWK 使用 print 输出第二行的内容。这个过程一直到文件结束。 |
| next | 停止处理当前记录，并且进入到下一条记录的处理过程。 | 当模式串匹配成功后程序并不执行任何操作：`$ awk '{if ($0 ~/Shyam/) next; print $0}' marks.txt` |
| nextfile | 停止处理当前文件，从下一个文件第一个记录开始处理。 | 首先创建两个文件。 file1.txt 内容如下:`file1:str1 file1:str2 file1:str3 file1:str4`文件 file2.txt 内容如下：`file2:str1 file2:str2 file2:str3 file2:str4`现在我们来测试 nextfile 函数。`$ awk '{ if ($0 ~ /file1:str2/) nextfile; print $0 }' file1.txt file2.txt`输出结果为：`file1:str1 file2:str1 file2:str2 file2:str3 file2:str4` |
| return | 从用户自定义的函数中返回值。请注意，如果没有指定返回值，那么的返回值是未定义的。 | 创建文件 functions.awk，内容如下：`function addition(num1, num2) { result = num1 + num2 return result } BEGIN { res = addition(10, 20) print "10 + 20 = " res }`执行该文件：`$ awk -f functions.awk 10 + 20 = 30` |
| system | 执行特定的命令然后返回其退出状态。返回值为 0 表示命令执行成功；非 0 表示命令执行失败。 | `$ awk 'BEGIN { ret = system("date"); print "Return value = " ret }'`输出结果为：`Sun Dec 21 23:16:07 IST 2014 Return value = 0` |




