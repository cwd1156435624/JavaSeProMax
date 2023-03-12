package d1_byteio;

import java.io.FileInputStream;
import java.io.FileOutputStream;

//需求：把某个视频复制到其他目录下的“b.avi”
public class Demo05 {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("day09\\a.txt");
        FileOutputStream fos = new FileOutputStream("day09\\b.txt");

        //从fis中读进来，从fos中写出去
        int len;
        byte[] bytes = new byte[1024];
        while ((len = fis.read(bytes)) != -1){
            fos.write(bytes,0,len);
        }

        fis.close();
        fos.close();
    }
}
