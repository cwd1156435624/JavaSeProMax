package d2_file;

import java.io.File;
import java.io.IOException;

/*
目标：File类创建、删除方法
 */
public class Demo3 {
    public static void main(String[] args) throws IOException {
        // 1、public boolean createNewFile()：创建一个新文件（文件内容为空），创建成功返回true,反之。
        File f1 = new File("day08\\a.txt");
        boolean b1 = f1.createNewFile();
        System.out.println(b1);

        // 2、public boolean mkdir()：用于创建文件夹，注意：只能创建一级文件夹
        File f2 = new File("day08\\itheima");
        boolean b2 = f2.mkdir();
        System.out.println(b2);

        // 3、public boolean mkdirs()：用于创建文件夹，注意：可以创建多级文件夹
        File f3 = new File("day08\\itheima\\aaa\\bbb\\ccc");
        boolean b3 = f3.mkdirs();
        System.out.println(b3);

        // 3、public boolean delete()：删除文件，或者空文件，注意：不能删除非空文件夹。
        File f4 = new File("day08\\a.txt");
        boolean b4 = f4.delete();
        System.out.println(b4);
    }
}
