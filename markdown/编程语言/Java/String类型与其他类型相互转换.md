###### 1.String转char
1>toCharArray()

说明：将字符串转换为一个新的字符数组

演示：String s="哈哈hah";

char[]c=s.toCharArray();

备注：将string中所有的字符都存到字符数组中

2>charAt(int index)

说明：返回指定索引处的 char 值

演示：String s="哈哈hah";

char c=s.charAt(0);

（c="哈"）

备注：只转一个字符

###### 2.String转byte
1>getBytes()

说明：使用平台的默认字符集将此 String 编码为 byte 序列，并将结果存储到一个新的 byte 数组中。

演示:String s="哈哈啦啦Ahah";

byte[]b=s.getBytes();

详解：默认情况下，汉字会被转成两个负整数，英文字母和符号会被转成ASCII码。

备注：如果需要对编码过程进行更多控制，则应该使用 CharsetEncoder 类。

###### 3.String转int
1>parseInt(String s)throws NumberFormatException

说明：将字符串参数作为有符号的十进制整数进行解析。

演示：String s="1010101";

int i = Integer.parseInt(s);

详解：这个方法是将int 表示形式的 String转化为int，也就是说s中必须是数字（“-”也可以，十六进制中的ABCDEF需要设置参数，参见方法2>）。在这个方法中，默认s中的                    int是十进制的。抛出异常参见方法2.

备注：如果s不是十进制，则需要用到方法2>。

2>parseInt(String s,int radix)throws NumberFormatException

说明：使用第二个参数指定的基数，将字符串参数解析为有符号的整数。

演示：String s="1010101";

int i = Integer.parseInt(s,2);

//设置s为二进制int，然后将二进制的s转化成十进制。i=85

详解：如果不设置参数，默认radix是10.

遇到以下情况会抛出NumberFormatException异常：

A.第一个参数为 null 或一个长度为零的字符串。

B.基数小于 Character.MIN_RADIX 或者大于 Character.MAX_RADIX。

C.假如字符串的长度超过 1，那么除了第一个字符可以是减号 '-' ('u002D’) 外，字符串中存在

任意不是由指定基数的数字表示的字符。

D.字符串表示的值不是 int 类型的值。

备注：记得trycatch。

3>valueOf(String s, int radix)throws NumberFormatException + intValue()以

说明：valueOf/   返回一个 Integer 对象，该对象中保存了用第二个参数提供的基数进行解析时从指定的 String 中提取的值。

intValue/  int 类型返回该 Integer 的值。

演示：String s="1010101";

int i = Integer.valueOf(s).intValue();//将s视为十进制 i=1010101

//这样写其实也可以 int i = (new Integer(s)).intValue();

String s="1010101";

int i = Integer.valueOf(s，2).intValue();//将s视为二进制 i=85

详解：方法一和方法二的具体实现方式。

备注：注意抛出异常。建议用上面的方法。

###### 4.String转double，String转long，string转short参见String转int
说明：方法都一样，唯一不同的是函数名不一样。对于int而言是intValue()，Integer.parseInt（）；对于double来说是doubleValue()，Double.parseDouble（）。

转成其他形式也一样。

###### 5.String转Boolean
1>parseBoolean(String s)

说明：将字符串参数解析为 boolean 值

演示：Boolean.parseBoolean("True") //返回 true。

Boolean.parseBoolean("yes") //返回 false。

详解：将字符串参数解析为 boolean 值。如果 String 参数不是 null 且在忽略大小写时等于 "true"，则返回的 boolean 表示 true 值。

备注：用的不太多。

2>getBoolean(String name)

