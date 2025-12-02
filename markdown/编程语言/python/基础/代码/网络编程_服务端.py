"""
演示Socket服务端开发
"""
import socket
# 创建Socket对象
socket_server = socket.socket()
# 绑定ip地址和端口
socket_server.bind(("localhost", 8888))
# 监听端口
socket_server.listen(1)
# listen方法接受一个整数传参，表示接受的连接数量

# 等待客户端链接
# result = socket_server.accept()
# conn = result[0]        # conn表示客户端的链接对象
# address = result[1]     # address表示客户端的ip地址和端口号

conn , address = socket_server.accept()
# accept方法返回的是二元元组（链接对象，客户端地址信息）
# 可以通过 变量1，变量2 = socket.accept() 来接受返回值
# accept方法会阻塞程序，直到有客户端链接
print(f"接受到了客户端的连接，客户端地址信息为：{address}")
while True:
    # 接受客户端信息，要使用客户端和服务器的连接对象而非socket_server对象
    data: str = conn.recv(1024).decode("UTF-8")  # 接受客户端发送的数据
    # recv方法接受一个整数传参，表示接受的字节数（缓冲区大小）
    # 返回值是字节数组，不是字符串，可以通过decode方法转换为字符串
    print(f"客户端发送的数据为：{data}")
    if data == "exit":
        break
    # 发送回复消息
    msg = input("请输入回复消息：").encode("UTF-8")
    conn.send(msg)

# 关闭链接
conn.close()
socket_server.close()
