package d3_tcp.no3;

import java.net.ServerSocket;
import java.net.Socket;

//目标：掌握利用多线程优化tcp服务端的方式
public class ServerDemo03 {
    public static void main(String[] args) throws Exception {
        System.out.println("服务端启动了");
        ServerSocket server = new ServerSocket(18888);
        while (true) {
            //获取客户端的Socket连接
            Socket socket = server.accept();

            //接收到一个客户端之后，我们就为这个客户端开启一个线程
            MyRunnable mr = new MyRunnable(socket);
            new Thread(mr).start();
        }
    }
}


