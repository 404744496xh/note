import re
import os

def remove_line_numbers(markdown_text):
    # 正则表达式匹配代码块及其后的行号
    code_block_pattern = re.compile(r'(```.*?\n(?:.*?\n)*?)(\s*\d+\s*\n?)+', re.DOTALL)

    # 使用正则表达式替换行号
    cleaned_markdown = code_block_pattern.sub(lambda m: m.group(1), markdown_text)
    
    return cleaned_markdown

# 文件路径
file_path = 'markdown/数据库&OS/Linux/总/Linux命令.md'
cleaned_file_path = 'markdown/数据库&OS/Linux/总/cleaned_Linux命令.md'

# 确保目录存在
os.makedirs(os.path.dirname(cleaned_file_path), exist_ok=True)

# 读取Markdown文件
with open(file_path, 'r', encoding='utf-8') as file:
    markdown_content = file.read()

# 去除行号
cleaned_content = remove_line_numbers(markdown_content)

# 将清理后的内容写入文件
with open(cleaned_file_path, 'w', encoding='utf-8') as file:
    file.write(cleaned_content)

print(f"Cleaned content has been written to {cleaned_file_path}")