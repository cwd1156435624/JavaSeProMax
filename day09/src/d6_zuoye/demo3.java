package d6_zuoye;

import java.io.*;

public class demo3 {
    public static void main(String[] args) throws IOException {
        //现有一个文件，将其拷贝到另外一个文件夹下
        FileInputStream fis = new FileInputStream("day09\\a.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);
        FileOutputStream fos = new FileOutputStream("day08\\b.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        int len;
        while ((len = bis.read()) != -1){
            bos.write(len);
        }

        bis.close();
        bos.close();
    }
}
