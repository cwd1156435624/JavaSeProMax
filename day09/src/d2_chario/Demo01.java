package d2_chario;

import java.io.FileReader;

//目标：掌握使用FileReader一次读取一个字符
public class Demo01 {
    public static void main(String[] args) throws Exception {
        /**
         * 构造器：
         *      FileReader(File file)：创建字符输入流管道与源文件对象接通
         *      FileReader(String pathname)：创建字符输入流管道与源文件路径接通
         *
         * 读取字符的方法：
         *      int read()：每次读取一个字符返回，如果字符已经没有可读的返回-1
         *
         * 需求：从a.txt文件中，使用文件字符输入流读取数据！一次读取一个字符
         */
        FileReader fr = new FileReader("day09\\a.txt");
        int read;
        while ((read = fr.read()) != -1){
            System.out.println((char) read);
        }

        fr.close();
        System.out.println("---------------");
        FileReader fr1 = new FileReader("day09\\a.txt");
        int read1;
        char[] chars = new char[1024];
        while ((read1 = fr1.read(chars)) != -1){
            System.out.println(new String(chars,0,read1));
        }
    }
}
