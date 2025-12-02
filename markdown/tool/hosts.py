import requests
import os
import re
from datetime import datetime

def download_hosts():
    url = "https://raw.hellogithub.com/hosts"
    try:
        response = requests.get(url)
        response.raise_for_status()
        return response.text
    except requests.RequestException as e:
        print(f"下载hosts文件失败: {e}")
        return None

def update_hosts():
    # Windows系统hosts文件路径
    system_hosts_path = r"C:\\Windows\\System32\\drivers\\etc\\hosts"
    
    # 下载新的hosts内容
    new_content = download_hosts()
    if not new_content:
        return False
    
    # 读取当前系统hosts文件
    try:
        with open(system_hosts_path, 'r', encoding='utf-8') as f:
            current_hosts = f.read()
    except Exception as e:
        print(f"读取系统hosts文件失败: {e}")
        return False
    
    # 定义标记，用于识别更新部分
    start_mark = "# GitHub520 Host Start"
    end_mark = "# GitHub520 Host End X"
    
    # 为新内容添加标记
    current_time = datetime.now().strftime("%Y-%m-%d %H:%M:%S")
    marked_content = f"\n{start_mark} ({current_time})\n{new_content}\n{end_mark}\n"
    
    # 查找并替换旧的部分
    pattern = f"{start_mark}.*?{end_mark}\n?"
    if re.search(pattern, current_hosts, re.DOTALL):
        updated_hosts = re.sub(pattern, marked_content, current_hosts, flags=re.DOTALL)
    else:
        # 如果没有找到旧的部分，就附加到文件末尾
        updated_hosts = current_hosts.rstrip() + "\n" + marked_content
    
    # 写入更新后的内容
    try:
        # 首先尝试直接写入
        with open(system_hosts_path, 'w', encoding='utf-8') as f:
            f.write(updated_hosts)
        print("hosts文件更新成功！")
        return True
    except PermissionError:
        print("错误：没有写入权限。请以管理员身份运行此脚本。")
        return False
    except Exception as e:
        print(f"写入hosts文件时发生错误: {e}")
        return False

if __name__ == "__main__":
    update_hosts()