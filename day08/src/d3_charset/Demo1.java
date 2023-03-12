package d3_charset;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/*
目标1：理解什么是字符集，以及常用字符集每一个字符占用的字节数

目标2：编码、解码含义、以及所用到的方法
 */
public class Demo1 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String str = "我是傻逼";
        //编码
        //默认编码（UTF-8）
        byte[] bytes = str.getBytes();
        System.out.println(Arrays.toString(bytes));
        //使用GBK编码
        byte[] gbks = str.getBytes("GBK");
        System.out.println(Arrays.toString(gbks));

        //解码
        //默认解码
        String s1 = new String(bytes);
        System.out.println(s1);
        //使用GBK解码
        String s2 = new String(gbks,"GBK");
        System.out.println(s2);

    }
}
