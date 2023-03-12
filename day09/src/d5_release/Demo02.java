package d5_release;

import java.io.*;

//目标：掌握try-with-resource资源释放的使用
public class Demo02 {
    public static void main(String[] args) {
        /**
         * 基本做法：在finally代码块中执行所有资源释放操作
         * JDK7改进方案：在try后加上小括号，在其内定义流对象，即可自动释放
         * JDK9改进方案：在try之前定义流对象，然后放入try后的小括号中，使用分号隔开，也可自动释放
         *
         * 注意：
         *      JDK7 以及 JDK9的()中只能放置资源对象，否则报错
         *      资源都是实现了Closeable/AutoCloseable接口的类对象
         */

        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream("day09\\a.txt"));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("day09\\bb.txt"))
             ){

            int len;
            byte[] bytes = new byte[1024];
            while ((len = bis.read(bytes)) != -1){
                bos.write(bytes,0,len);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
