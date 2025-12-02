## 一、模块简介

Beautiful Soup 是一个可以从HTML或XML文件中提取数据的[Python库](https://so.csdn.net/so/search?q=Python%E5%BA%93&spm=1001.2101.3001.7020).它能够通过你喜欢的转换器实现惯用的文档导航,查找、修改文档的方式。Beautiful Soup会帮你节省工作时间。

## 二、方法利用

### 1、安装beautifulsoup

```python
pip install beautifulsoup4
1
```

### 2、引入模块

```python
from bs4 import beautifulsoup
1
```

### 3、选择解析器解析指定内容

```python
soup=beautifulsoup(解析内容,解析器)
1
```

常用解析器：html.parser,lxml,xml,html5lib

有时候需要安装安装解析器：比如pip3 install lxml

BeautifulSoup默认支持Python的标准HTML解析库，但是它也支持一些第三方的解析库：

| 解析器           |                                  使用方法                                  | 优势                                                      | 劣势                                            |
| ---------------- | :-------------------------------------------------------------------------: | --------------------------------------------------------- | ----------------------------------------------- |
| Python标准库     | `BeautifulSoup(markup, "html.parser")`  | Python的内置标准库、执行速度适中、文档容错能力强          | Python 2.7.3 or 3.2.2)前 的版本中文档容错能力差 |
| lxml HTML 解析器 | `BeautifulSoup(markup, "lxml")` | 速度快、文档容错能力强                                    | 需要安装C语言库                                 |
| lxml XML 解析器  | `BeautifulSoup(markup, ["lxml-xml"])` 或 `BeautifulSoup(markup, "xml")` | 速度快、唯一支持XML的解析器                               | 需要安装C语言库                                 |
| html5lib         | `BeautifulSoup(markup, "html5lib")`  | 最好的容错性、以浏览器的方式解析文档、生成HTML5格式的文档 | 速度慢、不依赖外部扩展                          |

几个简单的浏览结构化数据的方法

```python
#获取Tag，通俗点就是HTML中的一个个标签
soup.title                    # 获取整个title标签字段：<title>The Dormouse's story</title>
soup.title.name               # 获取title标签名称  ：title
soup.title.parent.name        # 获取 title 的父级标签名称：head
soup.p                        # 获取第一个p标签字段：<p class="title"><b>The Dormouse's story</b></p>
soup.p['class']               # 获取第一个p中class属性值：title
soup.p.get('class')           # 等价于上面
soup.a                        # 获取第一个a标签字段
soup.find_all('a')            # 获取所有a标签字段
soup.find(id="link3")         # 获取属性id值为link3的字段
soup.a['class'] = "newClass"  # 可以对这些属性和内容等等进行修改
del bs.a['class']             # 还可以对这个属性进行删除
soup.find('a').get('id')      # 获取class值为story的a标签中id属性的值
soup.title.string             # 获取title标签的值  ：The Dormouse's story
```

## 三、具体利用

### 1、获取拥有指定属性的标签

```python
方法一：获取单个属性
soup.find_all('div',id="even")            # 获取所有id=even属性的div标签
soup.find_all('div',attrs={'id':"even"})    # 效果同上

方法二:
soup.find_all('div',id="even",class_="square")            # 获取所有id=even并且class=square属性的div标签
soup.find_all('div',attrs={"id":"even","class":"square"})    # 效果同上
```

### 2、获取标签的属性值

```python
方法一：通过下标方式提取
for link in soup.find_all('a'):
    print(link['href'])        //等同于 print(link.get('href'))

方法二：利用attrs参数提取
for link in soup.find_all('a'):
    print(link.attrs['href'])
1234567
```

### 3、获取标签中的内容

```python
divs = soup.find_all('div')        # 获取所有的div标签
for div in divs:                   # 循环遍历div中的每一个div
    a = div.find_all('a')[0]      # 查找div标签中的第一个a标签   
    print(a.string)              # 输出a标签中的内容

如果结果没有正确显示，可以转换为list列表
123456
```

### 4、stripped_strings

去除\n换行符等其他内容 stripped_strings

```python
divs = soup.find_all('div')
for div in divs:
    infos = list(div.stripped_strings)        # 去掉空格换行等
    bring(infos)
1234
```

## 四、输出

### 1、格式化输出prettify()

prettify() 方法将Beautiful Soup的文档树格式化后以Unicode编码输出,每个XML/HTML标签都独占一行

```python
markup = '<a href="http://example.com/" rel="external nofollow"  rel="external nofollow"  rel="external nofollow"  rel="external nofollow" >I linked to <i>example.com</i></a>'
soup = BeautifulSoup(markup)
soup.prettify()
# '<html>\n <head>\n </head>\n <body>\n  <a href="http://example.com/" rel="external nofollow"  rel="external nofollow"  rel="external nofollow"  rel="external nofollow" >\n...'
print(soup.prettify())
# <html>
#  <head>
#  </head>
#  <body>
#   <a href="http://example.com/" rel="external nofollow"  rel="external nofollow"  rel="external nofollow"  rel="external nofollow" >
#    I linked to
#    <i>
#     example.com
#    </i>
#   </a>
#  </body>
# </html>
```

### 2、get_text()

如果只想得到tag中包含的文本内容,那么可以调用 get_text() 方法,这个方法获取到tag中包含的所有文版内容包括子孙tag中的内容,并将结果作为Unicode字符串返回:

```python
markup = '<a href="http://example.com/" rel="external nofollow"  rel="external nofollow"  rel="external nofollow"  rel="external nofollow" >\nI linked to <i>example.com</i>\n</a>'
soup = BeautifulSoup(markup)
soup.get_text()
'\nI linked to example.com\n'
soup.i.get_text()
'example.com'
123456
```
