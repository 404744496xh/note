import re
import os

def clean_markdown(markdown_text):
    # 正则表达式匹配HTML标签
    html_tag_pattern = re.compile(r'<[^>]+>', re.DOTALL)
    
    # 去除HTML标签
    cleaned_markdown = html_tag_pattern.sub('', markdown_text)
    
    # 正则表达式匹配代码块后的行号
    # 优化：确保只匹配代码块后的行号，并且避免过多的回溯
    line_number_pattern = re.compile(r'(```\s*\w*\s*\n(?:.*?\n)*?)\s*\d+\s*\n?', re.DOTALL)

    # 去除代码块中的行号
    cleaned_markdown = line_number_pattern.sub(lambda m: m.group(1), cleaned_markdown)
    
    return cleaned_markdown

# 文件路径
file_path = 'markdown/数据库&OS/Linux/总/Linux.md'
cleaned_file_path = 'markdown/数据库&OS/Linux/总/cleaned_Linux命令2.md'

# 确保目录存在
os.makedirs(os.path.dirname(cleaned_file_path), exist_ok=True)

# 读取Markdown文件
with open(file_path, 'r', encoding='utf-8') as file:
    markdown_content = file.read()

# 清理Markdown内容
cleaned_content = clean_markdown(markdown_content)

# 将清理后的内容写入文件
with open(cleaned_file_path, 'w', encoding='utf-8') as file:
    file.write(cleaned_content)

print(f"Cleaned content has been written to {cleaned_file_path}")