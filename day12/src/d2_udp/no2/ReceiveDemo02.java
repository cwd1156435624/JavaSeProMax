package d2_udp.no2;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

//目标：使用UDP通信实现多收消息
public class ReceiveDemo02 {
    public static void main(String[] args) throws Exception {
        //Socket通道
        DatagramSocket ds = new DatagramSocket(10024);
        while (true) {
            //数据包对象
            byte[] bytes = new byte[1024*64];
            DatagramPacket dp = new DatagramPacket(bytes, bytes.length);
            //接受数据包
            ds.receive(dp);
            //解码
            String str = new String(bytes,0, bytes.length);
            System.out.println(str);
        }

    }
}
