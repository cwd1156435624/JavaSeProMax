package d2_udp.no3;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

//目标：掌握udp广播接收消息
public class ReceiveDemo03 {
    public static void main(String[] args) throws Exception {
        //1.创建接收数据的对象
        DatagramSocket socket = new DatagramSocket(10002);

        //2.创建一个数据包对象，用来装数据
        DatagramPacket dp = new DatagramPacket(new byte[1024], 1024);

        //3.开始收
        socket.receive(dp);

        //4.提取数据和长度
        byte[] bys = dp.getData();
        int length = dp.getLength();

        //5.解码数据
        String msg = new String(bys, 0, length);
        System.out.println("客户端消息：" + msg);
    }
}
