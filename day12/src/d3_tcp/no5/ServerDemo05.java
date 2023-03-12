package d3_tcp.no5;


import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

//目标：掌握利用tcp通信在服务端接收文件
public class ServerDemo05 {
    public static void main(String[] args) throws Exception {
        ServerSocket server = new ServerSocket(18888);
        //获取客户端连接
        Socket socket = server.accept();
        //读取客户端发过来的数据，并且把读取到的数据保存到服务端的硬盘上
        InputStream is = socket.getInputStream();
        //创建一个文件，用来存储接收到的数据
        FileOutputStream fos = new FileOutputStream(new File("D:\\lo"));//
        byte[] bytes = new byte[1024];
        int len;
        while ((len = is.read(bytes)) != -1){
            fos.write(bytes,0,len);
        }

        fos.close();
        socket.shutdownInput();
        //给客户端反馈一个“上传成功”
        OutputStream os = socket.getOutputStream();
        OutputStreamWriter osw = new OutputStreamWriter(os);
        BufferedWriter bw = new BufferedWriter(osw);
        bw.write("上传成功6");
        bw.newLine();
        bw.flush();

        socket.close();
        server.close();
    }
}
