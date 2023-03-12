package d2_udp.no1;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

//目标：掌握udp接收数据
public class ReceiveDemo01 {
    public static void main(String[] args) throws Exception {
        /**
         * Socket通道：
         *      DatagramSocket(int port)：创建接收端的Socket对象并指定端口号
         *
         * 数据包对象：
         *      DatagramPacket(byte[] buf, int length)
         *
         * 常用方法：
         *      receive(DatagramPacket p)：接受数据包
         *
         * 数据包常用方法：
         *      getLength()：获得实际接收到的字节个数
         *      getData()：获取存放数据的字节数组
         */

        //Socket通道
        DatagramSocket ds = new DatagramSocket(10000);
        byte[] bytes = new byte[1024*64];
        //数据包对象
        DatagramPacket dp = new DatagramPacket(bytes, bytes.length);
        //接受数据包
        ds.receive(dp);
        //获取长度
        int length = dp.getLength();
        System.out.println(length);
        //解码
        String str = new String(bytes,0,length);
        System.out.println(str);
        ds.close();
    }
}
