import subprocess
import os
import 语雀导出格式调整 as yuque_out

def decode_path(path):
    # 去除路径字符串两端的引号
    path = path.strip('"')
    # 将路径中的八进制转义序列转换为字节
    path_bytes = bytes(path, 'utf-8').decode('unicode_escape').encode('latin1')
    # 将字节以 UTF-8 编码解码为正确的字符串
    decoded_path = path_bytes.decode('utf-8')
    return decoded_path

def get_uncommitted_md_files():
    # 获取未提交的.md文件
    result = subprocess.run(['git', 'ls-files', '--others', '--exclude-standard', '--full-name', '*.md'], stdout=subprocess.PIPE, text=True)
    uncommitted_files = result.stdout.splitlines()
    return uncommitted_files

def write_files_to_output(uncommitted_files, output_file):
    with open(output_file, 'w') as f:
        for file in uncommitted_files:
            #调整格式
            # 解码文件路径
            file = decode_path(file)
            print(file)
            yuque_out.yuque_formot(file)
            f.write(file + '\n')

def main():
    # 获取未提交的.md文件
    uncommitted_md_files = get_uncommitted_md_files()
    # 输出文件路径
    output_file = 'log/uncommitted_md_files.txt'
    
    # 将文件路径写入输出文件
    write_files_to_output(uncommitted_md_files, output_file)
    
    print(f"Uncommitted .md files have been written to {output_file}")

if __name__ == "__main__":
    main()