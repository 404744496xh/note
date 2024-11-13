import urllib.request
from bs4 import BeautifulSoup

# 目标网页URL
url = 'http://www.example.com'

# 使用urllib.request.urlopen()打开URL
try:
    response = urllib.request.urlopen(url)
    # 读取网页内容
    html_content = response.read()
    # 将网页内容解码成字符串
    html_string = html_content.decode('utf-8')

    # 打印网页内容
    print(html_string)

    
    # 使用BeautifulSoup解析HTML
    soup = BeautifulSoup(html_string, 'html.parser')
    
    # 提取网页标题
    title = soup.title.string if soup.title else 'No title found'
    
    print(f'网页标题: {title}')
except urllib.error.URLError as e:
    print(f'无法访问网页: {e.reason}')
except Exception as e:
    print(f'发生错误: {e}')