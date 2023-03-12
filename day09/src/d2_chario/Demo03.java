package d2_chario;

import java.io.FileWriter;

//目标：掌握FileWriter将内存中数据以字符形式写到磁盘文件
public class Demo03 {
    public static void main(String[] args) throws Exception {
        /**
         * 作用：以内存为基准，把内存中的数据以字符的形式写出到磁盘文件中去的流

         * 构造器：
         *      FileWriter(File file)：创建字符输出流管道与源文件对象接通
         *      FileWriter(File file，boolean append)：创建字符输出流管道与源文件对象接通，可追加数据
         *      FileWriter(String filepath)：创建字符输出流管道与源文件路径接通
         *      FileWriter(String filepath，boolean append)：创建字符输出流管道与源文件路径接通，可追加数据

         * 写出数据的api：
         *      write(int c)：写一个字符
         *      write(char[] cbuf)：写入一个字符数组
         *      write(char[] cbuf, int off, int len)：写入字符数组的一部分
         *      write(String str)：写一个字符串
         *      write(String str, int off, int len)：写一个字符串的一部分
         *      write(int c)：写一个字符

         * 流关闭和刷新：
         *      flush()：刷新流，还可以继续写数据
         *      close()：关闭流，释放资源，但是在关闭之前会先刷新流。一旦关闭，就不能再写数据

         * 注意：写出字符串"\r\n"也可以换行
         */

        FileWriter fw = new FileWriter("day09\\a.txt");
        fw.write(97);
        fw.write("王二狗");
        fw.write('b');
        char[] chars = {'李','翠','花'};
        fw.write(chars);
        fw.close();
    }
}
