<a name="08806ea3"></a>
## 总览
Markdown 速查表提供了所有 Markdown 语法元素的基本解释。如果你想了解某些语法元素的更多信息，请参阅更详细的 [基本语法](https://markdown.com.cn/basic-syntax) 和 [扩展语法](https://markdown.com.cn/extended-syntax).
<a name="c4dd9766"></a>
## 基本语法
这些是 John Gruber 的原始设计文档中列出的元素。所有 Markdown 应用程序都支持这些元素。

| 元素 | Markdown 语法                      |
| --- |----------------------------------|
| [标题（Heading）](https://markdown.com.cn/basic-syntax/headings.html) | `# H1 <br/>  ## H2 <br/> ### H3` |
| [粗体（Bold）](https://markdown.com.cn/basic-syntax/bold.html) | `**bold text**`                  |
| [斜体（Italic）](https://markdown.com.cn/basic-syntax/italic.html) | `*italicized text*`              |
| [引用块（Blockquote）](https://markdown.com.cn/basic-syntax/blockquotes.html) | `> blockquote`                   |
| [有序列表（Ordered List）](https://markdown.com.cn/basic-syntax/ordered-lists.html) | `1. First item`                  

`2. Second item`

`3. Third item`

 |
| [无序列表（Unordered List）](https://markdown.com.cn/basic-syntax/unordered-lists.html) | `- First item<br />- Second item<br />- Third item<br />` |
| [代码（Code）](https://markdown.com.cn/basic-syntax/code.html) | ``code`` |
| [分隔线（Horizontal Rule）](https://markdown.com.cn/basic-syntax/horizontal-rules.html) | `---` |
| [链接（Link）](https://markdown.com.cn/basic-syntax/links.html) | `[title](https://www.example.com)` |
| [图片（Image）](https://markdown.com.cn/basic-syntax/images.html) | `![alt text](image.jpg)` |

<a name="49ad4863"></a>
## 扩展语法
这些元素通过添加额外的功能扩展了基本语法。但是，并非所有 Markdown 应用程序都支持这些元素。

| 元素 | Markdown 语法 |
| --- | --- |
| [表格（Table）](https://markdown.com.cn/extended-syntax/tables.html) | `&#124; Syntax      &#124; Description &#124;<br />&#124; ----------- &#124; ----------- &#124;<br />&#124; Header      &#124; Title       &#124;<br />&#124; Paragraph   &#124; Text        &#124;` |
| [代码块（Fenced Code Block）](https://markdown.com.cn/extended-syntax/fenced-code-blocks.html) | ````<br />{<br />"firstName": "John",<br />"lastName": "Smith",<br />"age": 25<br />}<br />```` |
| [脚注（Footnote）](https://markdown.com.cn/extended-syntax/footnotes.html) | Here's a sentence with a footnote. `[^1]`

`[^1]`<br />: This is the footnote. |
| [标题编号（Heading ID）](https://markdown.com.cn/extended-syntax/heading-ids.html) | `### My Great Heading {#custom-id}` |
| [定义列表（Definition List）](https://markdown.com.cn/extended-syntax/definition-lists.html) | `term<br />: definition` |
| [删除线（Strikethrough）](https://markdown.com.cn/extended-syntax/strikethrough.html) | `~~The world is flat.~~` |
| [任务列表（Task List）](https://markdown.com.cn/extended-syntax/task-lists.html) | `- [x] Write the press release<br />- [ ] Update the website<br />- [ ] Contact the media` |

## HTML嵌入（用过的）
### 分页
<div style="float: left; width: 50%; padding: 10px;">

![img.png](images/img5.png)

</div>

<div style="float: right; width: 50%; padding: 10px;">
  使用工厂类的get_person()方法去创建具体的类对象

优点：
- 大批量创建对象的时候有统一的入口，易于代码维护
- 当发生修改，仅修改工厂类的创建方法即可
- 符合现实世界的模式，即由工厂来制作产品（对象）
</div>

<div style="clear: both;"></div>