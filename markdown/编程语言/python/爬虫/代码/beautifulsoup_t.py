# beautifulsoup_t.py

from bs4 import BeautifulSoup

# 示例HTML内容
html_content = """
<!DOCTYPE html>
<html>
<head>
    <title>示例页面</title>
</head>
<body>
    <h1>欢迎来到示例页面</h1>
    <p class="description">这是一个简单的示例页面，用于演示 BeautifulSoup 的用法。</p>
    <a href="https://example.com">访问示例网站</a>
    <a href="https://example.org">访问另一个示例网站</a>
</body>
</html>
"""

# 使用 BeautifulSoup 解析 HTML 内容
soup = BeautifulSoup(html_content, 'html.parser')

# 获取整个 title 标签
title_tag = soup.title
print(f"Title 标签: {title_tag}")

# 获取 title 标签的名称
title_name = soup.title.name
print(f"Title 标签名称: {title_name}")

# 获取 title 标签的父级标签名称
title_parent_name = soup.title.parent.name
print(f"Title 标签的父级标签名称: {title_parent_name}")

# 获取第一个 p 标签
first_p_tag = soup.p
print(f"第一个 p 标签: {first_p_tag}")

# 获取第一个 p 标签的 class 属性值
p_class = soup.p['class']
print(f"第一个 p 标签的 class 属性值: {p_class}")

# 获取所有 a 标签
all_a_tags = soup.find_all('a')
print(f"所有 a 标签: {all_a_tags}")

# 获取属性 id 值为 link3 的字段（假设存在）
# link3_tag = soup.find(id="link3")
# print(f"属性 id 值为 link3 的字段: {link3_tag}")

# 获取所有 id=even 属性的 div 标签（假设存在）
# even_divs = soup.find_all('div', id="even")
# print(f"所有 id=even 属性的 div 标签: {even_divs}")

# 获取所有 id=even 并且 class=square 属性的 div 标签（假设存在）
# even_square_divs = soup.find_all('div', id="even", class_="square")
# print(f"所有 id=even 并且 class=square 属性的 div 标签: {even_square_divs}")

# 获取标签的属性值
for link in soup.find_all('a'):
    print(f"链接地址: {link['href']}")

# 获取标签中的内容
for link in soup.find_all('a'):
    print(f"链接文本: {link.string}")

# 格式化输出 prettify()
print("格式化后的 HTML 内容:")
print(soup.prettify())

# 获取所有文本内容
all_text = soup.get_text()
print("所有文本内容:")
print(all_text)