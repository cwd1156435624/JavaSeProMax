package d3_tcp.no1;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

//目标：掌握tcp服务端代码接收数据
public class ServerDemo01 {
    public static void main(String[] args) throws Exception {
        /**
         * ServerSocket(int port)：注册服务端端口
         * Socket accept()：等待接收客户端的Socket通信连接，连接成功返回Socket对象与客户端建立端到端通信
         */

        System.out.println("服务端启动了");
        ServerSocket server = new ServerSocket(18888);
        //建立连接
        Socket socket = server.accept();
        //获取输入流
        InputStream is = socket.getInputStream();
        //转换为字符流
        InputStreamReader isr = new InputStreamReader(is);
        //转换为缓冲流
        BufferedReader br = new BufferedReader(isr);

        String s1 = br.readLine();
        System.out.println(s1);

        String s2 = br.readLine();
        System.out.println(s2);

        server.close();
        socket.close();

    }
}
