package d2_chario;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
    字符流文件复制
 */
public class Demo04 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("day09\\a.txt");
        FileWriter fw = new FileWriter("day09\\b.txt");

        int len;
        char[] chars = new char[1024];
        while ((len = fr.read(chars)) != -1) {
            fw.write(chars,0,len);
        }

        fr.close();
        fw.close();
    }
}
