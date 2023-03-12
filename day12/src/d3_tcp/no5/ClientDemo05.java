package d3_tcp.no5;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

//目标：掌握利用tcp通信在客户端发送文件
public class ClientDemo05 {
    public static void main(String[] args) throws IOException {
        //让用户输入上传的文件路径
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您要上传的文件路径:");
        String path = sc.next();
        //读取图片中的数据，把数据发送给服务端
        Socket socket = new Socket("127.0.0.1",18888);
        OutputStream os = socket.getOutputStream();
        //读取上面指定路径的图片中的字节
        FileInputStream fis = new FileInputStream(path);
        //一边读一边写
        int len;
        byte[] bytes = new byte[1024];
        while ((len = fis.read(bytes)) != -1){
            os.write(bytes,0,len);
        }

        fis.close();
        //上传完数据后，要读取服务端回写的数据
        InputStream is = socket.getInputStream();
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();//
        System.out.println(s);

        br.close();
        os.close();
    }
}
