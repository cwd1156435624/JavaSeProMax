package d3_tcp.no6;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

//目标：掌握BS系统的模拟实现
public class BServerDemo06 {
    public static void main(String[] args) throws IOException {
        //1.创建服务端Socket对象，绑定的端口8080
        ServerSocket ss = new ServerSocket(8080);
        System.out.println("BS服务端开启...");
        while (true) {
            Socket socket = ss.accept();
            new ServerReceiveThread(socket).start();
        }
    }
}
