from urllib.request import urlopen, Request

# 基本用法
response = urlopen("http://example.com")
html = response.read()
# 使用 Request 对象
headers = {'User-Agent': 'Mozilla/5.0'}
request = Request("http://example.com", headers=headers)
response = urlopen(request)
html = response.read()
# print(html)

import requests

response = requests.get('http://example.com/api/data')
if 'application/json' in response.headers.get('Content-Type'):
    data = response.json()# 将响应内容解析为 JSON
    print(data)
else:
    print("响应内容不是JSON格式")