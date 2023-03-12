package d2_udp.no1;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

//目标：掌握使用UDP通信实现发送消息
public class SendDemo01 {
    public static void main(String[] args) throws Exception {
        /**
         * 数据包对象：
         *      DatagramPacket(byte[] buf, int length, InetAddress address, int port)
         *
         * Socket通道：
         *      DatagramSocket()：创建发送端的Socket对象，系统会随机分配一个端口号
         *
         * 常用方法：
         *      send(DatagramPacket dp)：发送数据包
         */

        //Socket通道
        DatagramSocket ds = new DatagramSocket();
        byte[] bytes = "你好，帅哥，交个朋友~".getBytes();
        //数据包对象
        DatagramPacket dp = new DatagramPacket(
                bytes,
                bytes.length,
                InetAddress.getByName("127.0.0.1"),
                10000);
        //发送数据包
        ds.send(dp);
        ds.close();

    }
}
