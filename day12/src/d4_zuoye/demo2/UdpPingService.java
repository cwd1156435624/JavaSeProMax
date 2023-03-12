package d4_zuoye.demo2;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UdpPingService {
    public static  void main(String[] args) throws Exception {

        // 创建UDP通讯的DatagramSocket对象，并且暴露端口为80
        DatagramSocket datagramSocket = new DatagramSocket(80);

        // 不断读取发送端所发送过来的数据
        while (true) {

            // 创建一个字节数组，用来存储读取到的数据
            byte[] data = new byte[1024];

            // 创建DatagramPacket对象，并且进行数据的读取操作
            DatagramPacket datagramPacket = new DatagramPacket( data , data.length);
            datagramSocket.receive(datagramPacket);

            // 从数据中获取读取到的数据，并将其转换成大写
            String str = new String(data,0 , datagramPacket.getLength(),"UTF-8").toUpperCase();

            // 把读取到的数据转换成字节数组
            byte[] data1 = str.getBytes("UTF-8");

            // 创建DatagramPacket对象封装给发送端要返回的数据
            DatagramPacket datagramPacket1 = new DatagramPacket( data1 , data1.length , datagramPacket.getAddress() , datagramPacket.getPort());

            // 发送数据到发送端
            datagramSocket.send(datagramPacket1);
        }
    }
}
