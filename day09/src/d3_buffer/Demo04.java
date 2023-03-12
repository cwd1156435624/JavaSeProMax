package d3_buffer;

import java.io.BufferedWriter;
import java.io.FileWriter;

//目标：掌握字符缓冲输出流写出数据
public class Demo04 {
    public static void main(String[] args) throws Exception {
        /**
         * 作用：提高字符输出流写取数据的性能，除此之外多了换行功能
         *      BufferedWriter(Writer w)：可以把低级的字符输出流包装成一个高级的缓冲字符输出流管道，从而提高字符输出流写数据的性能
         *
         * 新增功能：
         *      newLine()：换行操作
         *
         * 需求：使用字符缓冲输出流，写出一首李白的静夜思到文件d.txt中
         */

        FileWriter fw = new FileWriter("day09\\a.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("王二狗");
        bw.newLine();
        bw.write("李翠花");
        bw.close();
    }
}
