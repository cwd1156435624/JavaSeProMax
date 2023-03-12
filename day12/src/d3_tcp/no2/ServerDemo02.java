package d3_tcp.no2;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

//目标：掌握tcp服务端多收消息
public class ServerDemo02 {
    public static void main(String[] args) throws Exception {
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

        String line;
        while ((line = br.readLine()) != null){
            System.out.println(line);
        }

        server.close();
        socket.close();
    }
}
