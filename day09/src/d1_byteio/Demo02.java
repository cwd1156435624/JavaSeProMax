package d1_byteio;

import java.io.FileInputStream;

//目标：掌握使用文件字节输入流每次读取一个字节数组
public class Demo02 {
    public static void main(String[] args) throws Exception {
        /**
         * int read(byte[] buffer)：每次使用字节数组来读取数据，返回读取的字节个数，如果没有可读返回-1
         *
         * 需求：使用文件字节输入流一次读取一个字节数组，读取a.txt文件中的数据
         */

        FileInputStream fis = new FileInputStream("day09\\a.txt");

        byte[] bytes = new byte[1024];
        int len;
        while ((len = fis.read(bytes)) != -1){
            System.out.println("读取到的字节数"+len);
            String str = new String(bytes,0,len);
            System.out.println(str);
        }

        fis.close();
    }
}
