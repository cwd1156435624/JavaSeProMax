package d3_buffer;

import java.io.BufferedReader;
import java.io.FileReader;

//目标：掌握字符缓冲输入流读取数据
public class Demo03 {
    public static void main(String[] args) throws Exception {
        /**
         * 作用：提高字符输入流读取数据的性能，除此之外多了按照行读取数据的功能
         *      BufferedReader(Reader r)：可以把低级的字符输入流包装成一个高级的缓冲字符输入流管道，从而提高字符输入流读数据的性能
         *
         * 新增功能：
         *      String readLine()：读取一行数据返回，如果读取没有完毕，无行可读返回null
         *
         * 需求：
         *      使用字符缓冲输入流一次读取一个字符数组，读取c.txt文件中的内容
         *      使用字符缓冲输入流一次读取一行，读取c.txt文件中的内容
         */

        FileReader fr = new FileReader("day09\\a.txt");
        BufferedReader br = new BufferedReader(fr);
        //读取多个字节
        /*char[] chars =new char[5];
        int len;
        while ((len = br.read(chars)) != -1){
            String str = new String(chars,0,len);
            System.out.println(str);
        }*/
        //读取一行
        System.out.println("-------------");
        String s;
        while ((s = br.readLine()) != null){
            System.out.println(s);
        }

        br.close();
    }
}
