"""
演示 Socket客户端开发
"""
import socket
#创建socket对象
socket_client =socket.socket()

#连接到服务端
socket_client.connect(("localhost",8888))

while True:
    #发送消息
    msg = input("请输入消息:")
    socket_client.send(msg.encode("UTF-8"))
    if msg == "exit":
        break

    # 接收返回消息
    recv_data =socket_client.recv(1024)

    #1024是缓冲区的大小，一般1024即可。同样recv方法是阻塞的
    print(f"服务端回复的消息是:{recv_data.decode('UTF-8')}")

# 关闭链接
socket_client.close()