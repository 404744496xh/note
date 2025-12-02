import os

# 获取当前文件所在目录的绝对路径
current_dir = os.path.dirname(os.path.abspath(__file__))
# 构建example.txt的完整路径
file_path = os.path.join(current_dir, "example.txt")
print(f"文件路径: {current_dir}")

with open(file_path, "r", encoding='utf-8') as file:
    content = file.read()
    print(content + "*---*")
