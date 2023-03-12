package d3_tcp.no1;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

//目标：掌握tcp客户端发送数据
public class ClientDemo01 {
    public static void main(String[] args) throws Exception {
        /**
         * Socket(String host,int port)：创建发送端的Socket对象与服务端连接，参数为服务端程序的ip和端口
         * getOutputStream()：获得字节输出流对象
         * getInputStream()：获得字节输入流对象
         */


        Socket socket = new Socket("127.0.0.1",18888);
        //获取到字节输出流
        OutputStream os = socket.getOutputStream();
        //转换为字符流
        OutputStreamWriter osw = new OutputStreamWriter(os);
        //为了写一行，转换为缓冲流
        BufferedWriter bw = new BufferedWriter(osw);

        bw.write("八嘎雅鹿");
        bw.newLine();
        bw.flush();

        bw.write("书到用时方恨少");
        bw.newLine();
        bw.flush();

        socket.close();

    }
}
