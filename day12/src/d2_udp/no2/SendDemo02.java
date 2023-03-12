package d2_udp.no2;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

//需求：使用UDP通信实现多发消息
public class SendDemo02 {
    public static void main(String[] args) throws Exception {
        DatagramSocket ds = new DatagramSocket();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入");
            String s = sc.next();
            byte[] bytes = s.getBytes();
            DatagramPacket dp = new DatagramPacket(bytes, bytes.length, InetAddress.getByName("192.168.90.52"),10010);
            ds.send(dp);
            if (s.equals("exit")){
                System.out.println("发送消息结束");
                break;
            }
        }

    }
}
