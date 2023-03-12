package d3_tcp.no2;

import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

//目标：掌握tcp客户端多发消息
public class ClientDemo02 {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("127.0.0.1",18888);
        //获取到字节输出流
        OutputStream os = socket.getOutputStream();
        //转换为字符流
        OutputStreamWriter osw = new OutputStreamWriter(os);
        //为了写一行，转换为缓冲流
        BufferedWriter bw = new BufferedWriter(osw);

        Scanner sc = new Scanner(System.in);
        while (true) {
            String s = sc.next();
            bw.write(s);
            bw.newLine();
            bw.flush();
            if (s.equals("exit")){
                break;
            }
        }
        socket.close();
    }
}
