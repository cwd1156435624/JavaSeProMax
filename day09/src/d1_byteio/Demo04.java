package d1_byteio;

import java.io.FileOutputStream;

//目标：掌握使用FileOutputStream写字节数据到文件
public class Demo04 {
    public static void main(String[] args) throws Exception {
        /**
         * 构造器：
         *      FileOutputStream(File file)：创建字节输出流管道与源文件对象接通
         *      FileOutputStream(File file，boolean append)：创建字节输出流管道与源文件对象接通，可追加数据
         *      FileOutputStream(String filepath)：创建字节输出流管道与源文件路径接通
         *      FileOutputStream(String filepath，boolean append)：创建字节输出流管道与源文件路径接通，可追加数据
         *
         * 写数据的api：
         *      write(int a)：写一个字节出去
         *      write(byte[] buffer)：写一个字节数组出去
         *      write(byte[] buffer , int pos , int len)：写一个字节数组的一部分出去
         *
         * 流的关闭和刷新：
         *      flush()：刷新流，还可以继续写数据
         *      close()：关闭流，释放资源，但是在关闭之前会先刷新流。一旦关闭，就不能再写数据
         */

        FileOutputStream fos = new FileOutputStream("day09\\a.txt");
        //单个字符
        fos.write(97);
        fos.write(98);
        fos.write(99);

        //字符数组
        byte[] bytes = {97,98,99};
        fos.write(bytes);

        //字符串
        fos.write("王二狗".getBytes());

        fos.close();
    }
}
