package d1_ip;

import java.net.InetAddress;

//目标：掌握InetAddress类的使用
public class Demo01 {
    public static void main(String[] args) throws Exception {
        /**
         * 表示ip地址
         * 常用api：
         *      static InetAddress getLocalHost()：返回本主机的地址对象
         *      static InetAddress getByName(String host)：得到指定主机的IP地址对象，参数是域名或者IP地址
         *      String getHostName()：获取此IP地址的主机名
         *      String getHostAddress()：返回IP地址字符串
         *      boolean isReachable(int timeout)：在指定毫秒内连通该IP地址对应的主机，连通返回true
         */

        //返回本主机的地址对象
        InetAddress inetAddress = InetAddress.getLocalHost();
        System.out.println(inetAddress);

        //得到指定主机的IP地址对象
        InetAddress byName = InetAddress.getByName("192.168.90.44");
        System.out.println(byName);

        //获取此IP地址的主机名
        String hostName = byName.getHostName();
        System.out.println(hostName);

        //返回IP地址字符串
        String hostAddress = byName.getHostAddress();
        System.out.println(hostAddress);

        //在指定毫秒内连通该IP地址对应的主机
        boolean reachable = byName.isReachable(5000);
        System.out.println(reachable);
    }
}
