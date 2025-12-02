package 网络编程;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;

public class UDPClient {
    public static void main(String[] args) {
        try {
            // 创建DatagramSocket对象
            DatagramSocket socket = new DatagramSocket();

            InetAddress serverAddress = InetAddress.getByName("127.0.0.1");
            int serverPort = 12345;

            // 从控制台读取用户输入
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String message;

            while (true) {
                System.out.println("请输入要发送的信息（输入 'exit' 退出）：");
                message = reader.readLine();

                if (message.equalsIgnoreCase("exit")) {
                    // 如果用户输入 'exit'，退出循环
                    break;
                }

                byte[] sendData = message.getBytes();

                // 创建发送数据的DatagramPacket对象
                DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, serverAddress, serverPort);

                // 发送数据
                socket.send(sendPacket);

                byte[] receiveData = new byte[1024];

                // 创建接收数据的DatagramPacket对象
                DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);

                // 接收服务端的响应
                socket.receive(receivePacket);

                // 将接收到的数据转换为字符串并打印
                String response = new String(receivePacket.getData(), 0, receivePacket.getLength());
                System.out.println("服务端响应：" + response);
            }

            // 关闭Socket连接
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}