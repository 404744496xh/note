import re
import os

def remove_html_tags(markdown_text):
    # 正则表达式匹配HTML标签
    html_tag_pattern = re.compile(r'<[^>]+>', re.DOTALL)
    
    # 使用正则表达式替换HTML标签
    cleaned_markdown = html_tag_pattern.sub('', markdown_text)
    
    return cleaned_markdown

# 文件路径
file_path = 'markdown/数据库&OS/Linux/总/Linux命令.md'
cleaned_file_path = 'markdown/数据库&OS/Linux/总/cleaned_Linux命令.md'

# 确保目录存在
os.makedirs(os.path.dirname(cleaned_file_path), exist_ok=True)

# 读取Markdown文件
with open(file_path, 'r', encoding='utf-8') as file:
    markdown_content = file.read()

# 去除HTML标签
cleaned_content = remove_html_tags(markdown_content)

# 将清理后的内容写入文件
with open(cleaned_file_path, 'w', encoding='utf-8') as file:
    file.write(cleaned_content)

print(f"Cleaned content has been written to {cleaned_file_path}")