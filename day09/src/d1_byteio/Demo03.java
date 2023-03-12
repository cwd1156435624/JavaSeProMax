package d1_byteio;

import java.io.FileInputStream;

//目标：掌握使用文件字节输入流一次读完全部字节
public class Demo03 {
    public static void main(String[] args) throws Exception {
        /**
         * 方式1：自己定义一个字节数组与文件的大小一样大，然后使用读取字节数组的方法，一次性读取完成
         * 方式2：官方为字节输入流InputStream提供了如下API可以直接把文件的全部数据读取到一个字节数组中
         *      byte[] readAllBytes()：直接将当前字节输入流对应的文件对象的字节数据装到一个字节数组返回
         *
         * 需求：使用一次读取所有字节的方式，读取a.txt文件中的内容
         */

        FileInputStream fis = new FileInputStream("day09\\a.txt");
        byte[] bytes = fis.readAllBytes();
        //解码
        System.out.println(new String(bytes));
        fis.close();
    }
}
