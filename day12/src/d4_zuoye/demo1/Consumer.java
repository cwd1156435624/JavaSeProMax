package d4_zuoye.demo1;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Consumer {
    public static void main(String[] args) throws Exception {
        System.out.println("消费者开始消费");

        ServerSocket server = new ServerSocket(18888);
        Socket socket = server.accept();
        InputStream is = socket.getInputStream();
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);

        String s;
        while ((s = br.readLine()) != null){
            System.out.println(s);
        }
        br.close();
        server.close();

    }
}
