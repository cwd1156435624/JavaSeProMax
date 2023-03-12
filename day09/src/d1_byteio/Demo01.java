package d1_byteio;

import java.io.FileInputStream;

//目标：掌握使用文件字节输入流每次读取一个字节
public class Demo01 {
    public static void main(String[] args) throws Exception {
        /**
         *  构造器：
         *          FileInputStream(File file)：创建字节输入流管道与源文件对象接通
         *          FileInputStream(String pathname)：创建字节输入流管道与源文件路径接通
         *
         *  读取文件字节数据的方法：
         *          int read()：每次读取一个字节返回，如果字节已经没有可读的返回-1、
         *          int read(byte[] buffer)：每次读取一个字节数组返回，如果字节已经没有可读的返回-1
         *
         *  需求：在当前模块下，创建一个a.txt文件，文件中有内容：java学科真牛批
         *  请使用文件字节输入流读取文件数据，打印到控制台
         */

        FileInputStream fis = new FileInputStream("day09\\a.txt");
        int read;
        while ((read=fis.read())!=-1) {
            System.out.println((char) read);
        }
        fis.close();
    }
}
