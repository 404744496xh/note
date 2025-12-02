import os
import re

def decode_path(path):
    # 去除路径字符串两端的引号
    path = path.strip('"')
    # 将路径中的八进制转义序列转换为字节
    path_bytes = bytes(path, 'utf-8').decode('unicode_escape').encode('latin1')
    # 将字节以 UTF-8 编码解码为正确的字符串
    decoded_path = path_bytes.decode('utf-8')
    return decoded_path

def yuque_formot(file_path):

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
        processed_block = match.group(1) + new_group3 + '\n' + match.group(4) + '\n'
        return processed_block

    # 读取文件内容
    with open(file_path, 'r', encoding='utf-8') as f:
        content = f.read()

    # 使用 re.sub() 替换所有匹配的代码块
    new_content = re.sub(pattern, process_code_block, content)

    # 正则表达式匹配HTML标签
    html_tag_pattern = re.compile(r'<[^>]+>', re.DOTALL)
    # 去除HTML标签
    new_content = html_tag_pattern.sub('', new_content)

    # 去除多余的空行，确保只保留一个换行符
    new_content = re.sub(r'\n\s*\n+', '\n\n', new_content)  # 将多个空行替换为两个换行符

    # 将修改后的内容写回文件
    with open(file_path, 'w', encoding='utf-8') as f:
        f.write(new_content)

    print("代码块已处理并保存到文件。")

if __name__ == "__main__":
    # 原始路径字符串
    file_path = r"E:\office\资料\笔记\markdown\我的笔记\笔试基础知识.md"
    # file_path = decode_path(file_path)
    print(file_path)
    yuque_formot(file_path)


