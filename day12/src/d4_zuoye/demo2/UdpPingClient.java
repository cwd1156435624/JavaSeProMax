package d4_zuoye.demo2;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Date;

public class UdpPingClient {
    public static void main(String[] args) throws  Exception{

        // 创建DatagramSocket对象，并设置为接收到数据时的超时时间单位为秒
        DatagramSocket datagramSocket = new DatagramSocket();
        datagramSocket.setSoTimeout(1000);

        // 循环5次发送数据
        for(int i = 1 ; i <= 5 ; i++) {

            // 创建需要发送的数据将其封装到datagramPacket对象中，然后调用DatagramSocket对象的send方法发送数据
            String str = "Ping " + i + " " + new Date().toString();
            byte[] data = str.getBytes("UTF-8");
            DatagramPacket datagramPacket = new DatagramPacket(data,data.length, InetAddress.getByName("localhost"),80);
            System.out.print(str + "    ");
            long startTime = System.currentTimeMillis();        // 记录发送数据开始时间
            datagramSocket.send(datagramPacket);

            // 创建DatagramPacket对象来接收接收端返回的数据
            byte[] data1 = new byte[1024];
            DatagramPacket datagramPacket1 = new DatagramPacket(data1 , data1.length);
            try {

                // 接收数据
                datagramSocket.receive(datagramPacket1);

                // 解析数据并将其输出到控制台
                byte[] packet1Data = datagramPacket1.getData();
                long endTime = System.currentTimeMillis();
                String str1 = new String(packet1Data,0 , datagramPacket1.getLength(),"UTF-8");
                System.out.println(str1+"  "+(endTime - startTime) + "ms");

                // 线程休眠1s
                Thread.sleep(1000);

            } catch (IOException e) {

                // 输出超时时信息
                System.out.print("超时");
                long endTime = System.currentTimeMillis();
                System.out.println("  " + (endTime - startTime) + "ms");

            }

        }

    }
}
