package d3_tcp.no4;

import d3_tcp.no3.MyRunnable;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

//目标：掌握利用线程池优化tcp服务端的方式
public class ServerDemo04 {
    public static void main(String[] args) throws Exception {
        ThreadPoolExecutor tpe = new ThreadPoolExecutor(
                2,
                5,
                2,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(1),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy()
        );
        System.out.println("服务端启动了");
        ServerSocket server = new ServerSocket(18888);
        while (true) {
            //获取客户端的Socket连接
            Socket socket = server.accept();

            //接收到一个客户端之后，我们就为这个客户端开启一个线程
            d3_tcp.no3.MyRunnable mr = new MyRunnable(socket);
            new Thread(mr).start();
        }
    }
}
