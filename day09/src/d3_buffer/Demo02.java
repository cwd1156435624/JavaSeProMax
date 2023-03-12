package d3_buffer;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

//目标：掌握字节缓冲输出流写出数据
public class Demo02 {
    public static void main(String[] args) throws Exception {
        /**
         * BufferedOutputStream(OutputStream os)：
         *      可以把低级的字节输出流包装成一个高级的缓冲字节输出流，从而提高写数据的性能
         *
         * 需求：使用字节缓冲输出流，将"please keep up your selection and do it"写出到文件 resource\\b.txt中
         */

        FileOutputStream fos = new FileOutputStream("day09\\b.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        String str = "please keep up your selection and do it";
        byte[] bytes = str.getBytes();
        bos.write(bytes);
        bos.close();
    }
}
