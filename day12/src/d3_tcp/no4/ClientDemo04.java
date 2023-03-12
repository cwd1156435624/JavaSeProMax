package d3_tcp.no4;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

//客户端多发消息
public class ClientDemo04 {
    public static void main(String[] args) throws IOException {
        //1.创建Socket对象，提供服务端的IP地址和端口号，尝试和服务端建立连接
        Socket socket = new Socket("localhost", 10006);
        //如果上面代码不报错，说明连接建立！
        System.out.println("已经建立连接，准备发送数据...");

        //2.开始把数据往外发，需要输出流
        OutputStream os = socket.getOutputStream();

        //3.把普通的字节输出流包装成打印流
        PrintWriter pw = new PrintWriter(os);
        //创建Scanner
        Scanner sc = new Scanner(System.in);

        //4.开始循环发送数据
        while (true) {
            System.out.println("请输入：");
            String msg = sc.next();
            //5.判断输入的消息是否是exit
            if ("exit".equals(msg)) {
                //如果成立，说明客户端要退出！
                System.out.println("客户端退出！");
                //资源释放
                socket.close();
                //结束循环
                break;
            }

            //6.如果能够执行到这，说明要发出去
            pw.println(msg);
            pw.flush();
        }
    }
}
