# urllib
Python 的 `urllib` 库是用于处理 URL 和与网页交互的一个标准库。它包含多个模块，每个模块都用于处理不同的任务。以下是 `urllib` 库中一些主要模块的用法：

### 1. **urllib.request** - 用于打开和读取 URL。
   - `urlopen()`: 打开一个 URL 并返回一个类似文件的对象。
   - `Request()`: 用于创建一个请求对象，可以设置 headers 等。
   - 示例代码：

```python
     from urllib.request import urlopen, Request

    # 基本用法
     response = urlopen("http://example.com")
     html = response.read()

     # 使用 Request 对象
     headers = {'User-Agent': 'Mozilla/5.0'}
     request = Request("http://example.com", headers=headers)
     response = urlopen(request)
     html = response.read()
```

### 2. **urllib.error** - 包含 `urllib.request` 抛出的异常。
   - `URLError`: 处理 URL 错误。
   - `HTTPError`: 处理 HTTP 错误。
   - 示例代码：

```python
     from urllib import request, error

     try:
         response = request.urlopen("http://example.com")
     except error.HTTPError as e:
         print("HTTP Error:", e.code, e.reason)
     except error.URLError as e:
         print("URL Error:", e.reason)
```

### 3. **urllib.parse** - 解析 URL。

   - `urlparse()`: 解析 URL 为组件。
   - `urlencode()`: 将字典编码为查询字符串。
   - 示例代码：
  
```python
     from urllib.parse import urlparse, urlencode

     # 解析 URL
     o = urlparse("http://example.com/path?name=value")
     print(o.scheme, o.netloc, o.path, o.query)

     # 编码字典为查询字符串
     query = urlencode({'name': 'value'})
     print("http://example.com/path?" + query)
```

### 4. **urllib.robotparser** - 解析 robots.txt 文件。

   - `RobotFileParser()`: 解析 robots.txt 文件。
   - 示例代码：

```python
     import urllib.robotparser

     rp = urllib.robotparser.RobotFileParser()
     rp.set_url("http://example.com/robots.txt")
     rp.read()
     can_fetch = rp.can_fetch("*", "http://example.com/path")
     print(can_fetch)
```

### 5. 指定编码格式
在使用 Python 的 `urllib` 库处理网络请求时，有时需要指定或处理特定的编码格式。这通常涉及到两个方面：请求时指定编码格式，以及处理响应时解析编码格式。

## 指定请求的编码格式

当你向服务器发送数据时（如表单数据），可能需要指定数据的编码格式。这通常在构建请求时通过设置 headers 来实现。

示例：发送 POST 请求并指定内容类型

```python
import urllib.request
import urllib.parse

url = 'http://example.com/post'
data = {'key': 'value'}  # 要发送的数据
data_encoded = urllib.parse.urlencode(data).encode('utf-8')  # 编码数据为 utf-8

headers = {
    'Content-Type': 'application/x-www-form-urlencoded; charset=utf-8'  # 指定内容类型和编码
}

request = urllib.request.Request(url, data=data_encoded, headers=headers)
response = urllib.request.urlopen(request)
print(response.read().decode('utf-8'))  # 读取响应并解码
```

### 2. 处理响应的编码格式

服务器响应的数据可能包含指定的编码格式，你需要正确地解码这些数据。

示例：读取并解码响应
```python
import urllib.request

url = 'http://example.com/data'
response = urllib.request.urlopen(url)
html = response.read()

# 尝试自动检测编码
from charset_normalizer import from_bytes
decoded_html = from_bytes(html).best().decode('utf-8', errors='ignore')

print(decoded_html)
```

### 3. 处理 URL 编码

当你构建 URL 时，可能需要对某些部分进行编码，以确保 URL 的正确性。

示例：对 URL 进行编码

```python
import urllib.parse

url = 'http://example.com/search'
query = 'name=John Doe'
encoded_query = urllib.parse.quote_plus(query)  # 对查询字符串进行编码

full_url = f"{url}?{encoded_query}"
print(full_url)
```


## requests

`requests` 是一个非常流行的第三方 Python 库，用于发送 HTTP 请求。它比 Python 标准库中的 `urllib` 更易用，功能也更丰富。以下是 `requests` 库的一些基本用法：

### 安装 `requests` 库

如果你还没有安装 `requests` 库，可以通过 pip 进行安装：

```bash
pip install requests
```

### 基本用法

1. **GET 请求**

   获取网页内容：

   ```python
   import requests

   response = requests.get('http://example.com')
   print(response.text)  # 打印响应内容
   ```

2. **POST 请求**

   发送表单数据：

   ```python
   import requests

   url = 'http://example.com/post'
   data = {'key': 'value'}
   response = requests.post(url, data=data)
   print(response.text)
   ```

3. **Headers**

   自定义请求头：

   ```python
   import requests

   url = 'http://example.com'
   headers = {'User-Agent': 'My App/0.0.1'}
   response = requests.get(url, headers=headers)
   ```

4. **响应内容**

   获取 JSON 响应：

   ```python
   import requests

   response = requests.get('http://example.com/api/data')
   data = response.json()  # 将响应内容解析为 JSON
   print(data)
   ```

5. **异常处理**

   处理请求时可能出现的异常：

   ```python
   import requests
   from requests.exceptions import HTTPError

   url = 'http://example.com'

   try:
       response = requests.get(url)
       response.raise_for_status()  # 检查响应状态码
   except HTTPError as http_err:
       print(f'HTTP error occurred: {http_err}')
   except Exception as err:
       print(f'Other error occurred: {err}')
   else:
       print('Success!')
   ```

6. **超时设置**

   设置请求超时：

   ```python
   import requests

   url = 'http://example.com'
   try:
       response = requests.get(url, timeout=5)  # 设置超时为 5 秒
   except requests.Timeout:
       print('The request timed out')
   ```

7. **发送文件**

   上传文件：

   ```python
   import requests

   url = 'http://example.com/upload'
   files = {'file': open('report.csv', 'rb')}
   response = requests.post(url, files=files)
   ```

8. **Session 对象**

   使用 Session 对象来维持会话：

   ```python
   import requests

   with requests.Session() as session:
       session.headers.update({'User-Agent': 'My App/0.0.1'})
       response = session.get('http://example.com', params={'key': 'value'})
       print(response.text)
   ```

9. **Cookies**

   处理 Cookies：

   ```python
   import requests

   url = 'http://example.com'
   response = requests.get(url)
   cookies = response.cookies
   print(cookies.get_dict())
   ```

`requests` 库的这些基本用法覆盖了大部分常见的 HTTP 请求场景。通过这个库，你可以轻松地发送请求、处理响应和维护会话。