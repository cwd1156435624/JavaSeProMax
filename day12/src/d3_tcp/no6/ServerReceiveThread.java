package d3_tcp.no6;

import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;

/**
 * HTTP响应数据的协议格式：就是给浏览器显示的网页信息
 * 协议版本 状态码 状态码描述
 * 头部字段名:值
 * ...
 * 头部字段名:值
 * <p>
 * 相应正文
 * <p>
 * 格式说明：
 *      协议版本：HTTP/1.1
 *      状态码：200 代表响应成功
 *      状态码描述：ok
 *      头部字段：Content-Type:text/html;charset=UTF-8
 *      响应正文：html网页代码
 */
public class ServerReceiveThread extends Thread {
    Socket socket;

    public ServerReceiveThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            //1.处理请求，往浏览器写回数据，利用Socket对象获得输出流写数据
            OutputStream os = socket.getOutputStream();
            PrintStream ps = new PrintStream(os);
            //2.开始往浏览器写回数据，但是注意：数据的格式是有要求，不是什么数据都能接收的
            ps.println("HTTP/1.1 200 ok");
            ps.println("Content-Type:text/html;charset=UTF-8");
            //3.一定要记得再多一个换行
            ps.println();
            //4.响应给浏览器的网页代码
            ps.println("<div style='color:green;font-size:100px'>150未来人人高薪就业，月薪过十万！</div>");
            ps.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
