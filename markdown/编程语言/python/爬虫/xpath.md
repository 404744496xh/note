### <font style="color:rgb(79, 79, 79);">Xpath简介</font>
<font style="color:rgb(0, 0, 0);background-color:rgb(248, 248, 64);">XPath是一种用于在</font>[<font style="color:rgb(0, 0, 0);background-color:rgb(248, 248, 64);">XML</font>](https://blog.csdn.net/weixin_50020236/article/details/126314990?ops_request_misc=%257B%2522request%255Fid%2522%253A%2522167947782316782427410461%2522%252C%2522scm%2522%253A%252220140713.130102334..%2522%257D&request_id=167947782316782427410461&biz_id=0&utm_medium=distribute.pc_search_result.none-task-blog-2~all~top_positive~default-2-126314990-null-null.142%5Ev76%5Epc_new_rank,201%5Ev4%5Eadd_ask,239%5Ev2%5Einsert_chatgpt&utm_term=XML&spm=1018.2226.3001.4187)<font style="color:rgb(0, 0, 0);background-color:rgb(248, 248, 64);">文档中定位节点的语言，它可以用于从XML文档中提取数据，以及在XML文档中进行搜索和过滤操作</font><font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">。它是</font>[<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">W3C</font>](https://blog.csdn.net/weixin_48594833/article/details/121326752?ops_request_misc=%257B%2522request%255Fid%2522%253A%2522167948703016800225515738%2522%252C%2522scm%2522%253A%252220140713.130102334..%2522%257D&request_id=167948703016800225515738&biz_id=0&utm_medium=distribute.pc_search_result.none-task-blog-2~all~top_positive~default-1-121326752-null-null.142%5Ev76%5Epc_new_rank,201%5Ev4%5Eadd_ask,239%5Ev2%5Einsert_chatgpt&utm_term=W3C&spm=1018.2226.3001.4187)<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">标准的一部分，被广泛应用于XML文档的处理和分析。</font>

<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">XPath使用路径表达式来描述节点的位置，这些路径表达式类似于文件系统中的路径。</font><font style="color:rgb(0, 0, 0);background-color:rgb(248, 248, 64);">路径表达式由一个或多个步骤(step)组成，每个步骤描述了一个节点或一组节点</font><font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">。步骤可以使用</font>[<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">关系运算符</font>](https://so.csdn.net/so/search?q=%E5%85%B3%E7%B3%BB%E8%BF%90%E7%AE%97%E7%AC%A6&spm=1001.2101.3001.7020)<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">(如/和//)来连接，以便描述更复杂的节点位置。</font>

<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">XPath还提供了一些内置函数和运算符，可以对XML文档中的数据进行操作和计算。例如，可以使用XPath的数学函数来计算节点的数值，或使用字符串函数来处理节点的文本内容。</font>

<font style="color:rgb(0, 0, 0);background-color:rgb(248, 248, 64);">在Python中，XPath可以使用lxml库来实现。lxml提供了一个</font>[<font style="color:rgb(0, 0, 0);background-color:rgb(248, 248, 64);">etree模块</font>](https://blog.csdn.net/GrofChen/article/details/101211209?ops_request_misc=%257B%2522request%255Fid%2522%253A%2522167948712816800180668685%2522%252C%2522scm%2522%253A%252220140713.130102334..%2522%257D&request_id=167948712816800180668685&biz_id=0&utm_medium=distribute.pc_search_result.none-task-blog-2~all~sobaiduend~default-1-101211209-null-null.142%5Ev76%5Epc_new_rank,201%5Ev4%5Eadd_ask,239%5Ev2%5Einsert_chatgpt&utm_term=etree%E6%A8%A1%E5%9D%97&spm=1018.2226.3001.4187)<font style="color:rgb(0, 0, 0);background-color:rgb(248, 248, 64);">，该模块包含了XPath的实现，可以方便地对XML文档进行解析和操作，同时支持XPath语法</font><font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">。</font>

### <font style="color:rgb(79, 79, 79);">Xpath解析</font>
#### <font style="color:rgb(79, 79, 79);">节点选择</font>
<font style="color:rgb(0, 0, 0);background-color:rgb(248, 248, 64);">XPath用于在XML文档中定位和选择节点，以下是XPath的一些常用用法：</font><font style="color:rgb(77, 77, 77);">  
</font>![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1726666077129-e46ec49e-9f28-4e23-83cd-56190afefd48.png)

**<font style="color:rgb(77, 77, 77);">1. 选择所有节点：</font>**

<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">使用双斜杠//选择文档中的所有节点，例如：</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">//node()</font>`

**<font style="color:rgb(77, 77, 77);">2. 按标签名选择节点：</font>**

<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">使用标签名选择节点，例如：</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">//book</font>`

**<font style="color:rgb(77, 77, 77);">3. 按属性选择节点：</font>**

<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">使用方括号[]和@符号选择具有特定属性值的节点，例如：</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">//book[@category="children"]</font>`

**<font style="color:rgb(77, 77, 77);">4. 选择父节点、子节点和兄弟节点：</font>**

<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">使用父节点(…)、子节点(/)和兄弟节点(//)选择节点，例如：</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">//book/title/..</font>`<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">、</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">//book/author/following-sibling::title</font>`<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">等</font>

**<font style="color:rgb(77, 77, 77);">5. 使用通配符选择节点：</font>**

<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">使用星号*选择任何节点，例如：</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">//book/*</font>`<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">选择所有book节点的子节点</font>

**<font style="color:rgb(77, 77, 77);">6. 使用逻辑运算符选择节点：</font>**

<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">使用and、or、not等逻辑运算符选择节点，例如：</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">//book[price<10 and @category="children"]</font>`

**<font style="color:rgb(77, 77, 77);">7. 使用内置函数处理节点：</font>**

<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">使用内置函数处理节点的文本和数值，例如：</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">//book[substring(title,1,3)="The"]</font>`<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">选择标题以"The"开头的书籍</font>

**<font style="color:rgb(77, 77, 77);">8. 使用轴选择节点：</font>**

<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">使用轴选择节点，例如：</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">//book/ancestor::library</font>`<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">选择book节点的</font><font style="color:rgb(78, 161, 219);background-color:rgb(238, 240, 244);">library</font><font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">祖先节点</font>

<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">在Python中，使用lxml库的etree模块可以方便地使用XPath进行节点定位和选择。例如，可以使用</font>[<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">etree.parse()函数</font>](https://blog.csdn.net/qq_35208583/article/details/89041912?ops_request_misc=%257B%2522request%255Fid%2522%253A%2522167948747816800184134255%2522%252C%2522scm%2522%253A%252220140713.130102334.pc%255Fall.%2522%257D&request_id=167948747816800184134255&biz_id=0&utm_medium=distribute.pc_search_result.none-task-blog-2~all~first_rank_ecpm_v1~pc_rank_34-1-89041912-null-null.142%5Ev76%5Epc_new_rank,201%5Ev4%5Eadd_ask,239%5Ev2%5Einsert_chatgpt&utm_term=etree.parse%28%29%E5%87%BD%E6%95%B0&spm=1018.2226.3001.4187)<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">解析XML文档，并使用xpath()方法执行XPath表达式，以便选择和操作XML文档中的节点。</font>

#### <font style="color:rgb(79, 79, 79);">路径表达式</font>
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1726666077734-e44aee0d-7d7f-45b2-be77-31c54dc074fb.png)

<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">XPath路径表达式是一种用于在XML文档中定位节点的语法。</font><font style="color:rgb(0, 0, 0);background-color:rgb(248, 248, 64);">它由一系列节点名、轴、谓词和运算符组成，可以构造出一个完整的路径，以定位到目标节点。</font>

<font style="color:rgb(0, 0, 0);background-color:rgb(248, 248, 64);">XPath路径表达式的基本语法如下：</font>

```plain
/          : 从根节点开始，定位到目标节点
//         : 从当前节点开始，递归查找所有符合条件的节点
.          : 表示当前节点
..         : 表示当前节点的父节点
*          : 匹配任意节点
@          : 表示属性节点
[]         : 表示谓词，用于筛选符合条件的节点


1
2
3
4
5
6
7
```

<font style="color:rgb(0, 0, 0);background-color:rgb(248, 248, 64);">例如，以下是一些XPath路径表达式的示例：</font>

```plain
/                 : 定位到根节点
/bookstore        : 定位到根节点下的bookstore节点
/bookstore/book   : 定位到bookstore节点下的所有book节点
//book            : 递归查找所有book节点
//book[@category='web'] : 查找所有category属性值为web的book节点


1
2
3
4
5
```

<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">XPath路径表达式是XPath语言的核心，它可以用于查询XML文档中的数据，并且在XPath语言中还有很多其他的功能，例如函数、运算符等，可以更加灵活地处理XML数据。</font>

#### <font style="color:rgb(79, 79, 79);">谓语</font>
<font style="color:rgb(0, 0, 0);background-color:rgb(248, 248, 64);">XPath谓语是一种用于筛选XML文档中特定节点的表达式，它可以在XPath路径中使用。谓语通常由方括号包围，并包括一个条件表达式。</font>

<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">例如，以下XPath路径选择所有名为“book”的元素：</font>

```plain
/bookstore/book


1
```

<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">如果我们想要选择所有具有价格大于10美元的书籍，我们可以使用以下XPath路径和谓语：</font>

```plain
/bookstore/book[price > 10]


1
```

<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">在这个例子中，谓语是“[price > 10]”，它指定了一个条件，它只选择价格大于10美元的书籍。</font>

![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1726666077753-c5049d77-a563-4138-a016-3094899feab7.png)

#### <font style="color:rgb(79, 79, 79);">未知节点</font>
<font style="color:rgb(77, 77, 77);">当我们需要选择一个未知节点时，意味着我们无法确定节点的位置或名称，但我们知道节点具有某些特定属性或特征。</font><font style="color:rgb(0, 0, 0);background-color:rgb(248, 248, 64);">在这种情况下，我们可以使用通配符、轴、谓词等技术来选择未知节点。</font>

<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">通配符（*）可以用来匹配任何节点，轴可以用来选择与当前节点相关的节点，谓词可以用来筛选符合条件的节点。使用这些技术，我们可以选择任何未知节点，使我们的XPath表达式更加灵活和通用。</font>

![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1726666077817-2ddd2e36-65fc-4669-87f3-565f0725ce2e.png)

<font style="color:rgb(0, 0, 0);background-color:rgb(248, 248, 64);">Xpath语法较多，我不一一演示，但在后面实战演示中，会依次讲解，帮助大家理解学习。理论讲解完毕，我们进入实战！！！</font><font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);"> </font><font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">💨💨</font>

