package d3_tcp.no4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class MyRunnable implements Runnable{
    private Socket socket;

    public MyRunnable(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
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

            socket.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
