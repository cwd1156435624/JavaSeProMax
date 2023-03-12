package d3_buffer;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

//目标：掌握字节缓冲输入流读取数据
public class Demo01 {
    public static void main(String[] args) throws Exception {
        /**
         * BufferedInputStream(InputStream is)：
         *      可以把低级的字节输入流包装成一个高级的缓冲字节输入流管道，从而提高字节输入流读数据的性能
         *
         * 需求：使用字节缓冲输入流将resource文件夹下的a.txt文件中内容读取到控制台打印
         */

        FileInputStream fis = new FileInputStream("day09\\a.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);

        byte[] bytes = new byte[1024];
        int len;
        while ((len = bis.read(bytes)) != -1){
            System.out.println(new String(bytes,0,len));
        }

        bis.close();
    }
}
