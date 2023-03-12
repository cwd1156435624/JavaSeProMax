package d4_transform;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

//目标：掌握InputStreamReader把原始的字节流按照指定编码转换成字符输入流
public class Demo02 {
    public static void main(String[] args) throws Exception {
        /**
         * InputStreamReader(InputStream is)：几乎不用
         *      可以把原始的字节流按照代码默认编码转换成字符输入流
         *
         * InputStreamReader(InputStream is ，String charset)：
         *      可以把原始的字节流按照指定编码转换成字符输入流，这样字符流中的字符就不乱码了(重点)
         *
         * 需求：使用字符输入转换流读取f-gbk.txt文件内容，使其读取内容不乱码
         */

        //utf-8
        FileInputStream fis = new FileInputStream("day09\\f-utf8.txt");
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);
        String line;
        while ((line = br.readLine()) != null){
            System.out.println(line);
        }
        br.close();

        //gbk
        FileInputStream fis2 = new FileInputStream("day09\\f-gbk.txt");
        InputStreamReader isr2 = new InputStreamReader(fis2,"GBK");
        BufferedReader br2 = new BufferedReader(isr2);
        String line2;
        while ((line2 = br2.readLine()) != null){
            System.out.println(line2);
        }
        br2.close();

    }
}
