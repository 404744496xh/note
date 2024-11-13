import requests  
url = 'http://www.baidu.com' # 生成get请求  
rqg = requests.get(url)  

# 常用的请求方法
# requests.get("http://httpbin.org/get") #GET请求  
# requests.post("http://httpbin.org/post") #POST请求  
# requests.put("http://httpbin.org/put") #PUT请求  
# requests.delete("http://httpbin.org/delete") #DELETE请求  
# requests.head("http://httpbin.org/get") #HEAD请求  
# requests.options("http://httpbin.org/get") #OPTIONS请求  


# 查看结果类型  
print('查看结果类型：', type(rqg))  
# 查看状态码  
print('状态码：',rqg.status_code)  
# 查看编码  
print('编码 ：',rqg.encoding)  
# 查看响应头  
print('响应头：',rqg.headers)  
# 打印查看网页内容  
print('查看网页内容：',rqg.text)