package d2_chario;

import java.io.File;
import java.io.FileReader;

//目标：掌握使用FileReader一次读取一个字符数组
public class Demo02 {
    public static void main(String[] args) throws Exception {
        /**
         * int read(char[] buffer)：每次读取一个字符数组，返回读取的字符个数，如果字符已经没有可读的返回-1
         *
         * 需求：在当前模块下创建文件b.txt，文件中有内容《静夜思》，使用文件字符输入流一次读取一个字符数组读取文件内容
         */

        FileReader fr = new FileReader("day09\\b.txt");
        File file = new File("day09\\b.txt");
        int num = (int) file.length();
        char[] chars = new char[num];
        int len;
        while ((len = fr.read(chars)) != -1){
            String str = new String(chars,0,len);
            System.out.println(str);
        }
    }
}
