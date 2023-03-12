package d4_transform;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

//目标：掌握OutputStreamWriter把字节输出流按照指定编码转换成字符输出流
public class Demo03 {
    public static void main(String[] args) throws Exception {
        /**
         * OutputStreamWriter(OutputStream os)：
         *      可以把原始的字节输出流按照代码默认编码转换成字符输出流。几乎不用
         *
         * OutputStreamWriter(OutputStream os，String charset)：
         *      可以把原始的字节输出流按照指定编码转换成字符输出流(重点)
         *
         * 需求：
         *      1.使用FileOutputStream将字符串"黑马程序员"分别写出到e.txt和f.txt中，其中e.txt是utf-8编码，f.txt是gbk编码
         *      2.使用OutputStreamWriter写出"中国"到g.txt中，使其不乱码
         */

        FileOutputStream fos = new FileOutputStream("day09\\f-gbk.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos,"GBK");
        BufferedWriter bw = new BufferedWriter(osw);
        bw.write("王二狗和李翠花");
        bw.close();
    }
}
