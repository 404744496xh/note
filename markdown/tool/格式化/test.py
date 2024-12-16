import os
import re

# 原始路径字符串
file_path = "markdown/\346\225\260\346\215\256\345\272\223&OS/Linux/shell\347\274\226\347\250\213_.md"
file_path = file_path.encode('latin-1').decode('utf-8')
print(file_path)

# 正则表达式匹配代码块
pattern = r'(`{3,})\s*([a-zA-Z0-9_+-]+)?\s*([\s\S]*?)(`{3,})'

# 定义一个函数来处理每个匹配的代码块
def process_code_block(match):
    # match.group(1) 是开始的反引号
    # match.group(2) 是语言标识符（如果有）
    # match.group(3) 是代码块内容
    # match.group(4) 是结束的反引号
    # 这里可以根据需要对代码块进行处理
    # 例如，我们在这里只是简单地在代码块前后添加了一些文本
    lines = match.group(3).splitlines(True)
    new_group3 = ""
    for line in lines:
        if len(line)<=4 and line[0].isdigit():
            continue
        else:
            new_group3 += line
            
    # print(new_group3)
    if match.group(2) != None:
        new_group3 = match.group(2) + '\n' + new_group3
    processed_block = match.group(1) + new_group3 + match.group(4)
    return processed_block

# 读取文件内容
with open(file_path, 'r', encoding='utf-8') as f:
    content = f.read()

# 使用 re.sub() 替换所有匹配的代码块
new_content = re.sub(pattern, process_code_block, content)

# 将修改后的内容写回文件
with open("file_path.md", 'w', encoding='utf-8') as f:
    f.write(new_content)

print("代码块已处理并保存到文件。")