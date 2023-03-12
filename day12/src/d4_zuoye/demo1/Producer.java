package d4_zuoye.demo1;

import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class Producer {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("127.0.0.1",18888);
        OutputStream os = socket.getOutputStream();
        OutputStreamWriter osw = new OutputStreamWriter(os);
        BufferedWriter bw = new BufferedWriter(osw);

        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("请输入您要发送的数据:");
            String s = sc.next();
            bw.write(s);
            bw.newLine();
            bw.flush();
        }
    }
}
