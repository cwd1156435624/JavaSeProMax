package d2_udp.no4;

//目标：掌握udp组播接收消息
public class ReceiveDemo04 {
    public static void main(String[] args) throws Exception {
        /**
         * 接收端必须绑定该组播IP，端口还要注册发送端的目的端口，这样即可接收该组播消息
         * DatagramSocket的子类MulticastSocket可以在接收端绑定组播IP：
         *      joinGroup(InetAddress.getByName("ip地址"));
         */

    }
}
