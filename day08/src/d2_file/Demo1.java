package d2_file;

import java.io.File;

/*
目标：File类的作用、构造器
 */
public class Demo1 {
    public static void main(String[] args) {
        File f1 = new File("D:\\OneDrive\\桌面\\a.txt");
        System.out.println(f1);
        File f2 = new File("D:\\OneDrive\\桌面","a.txt");
        System.out.println(f2);
        File parent = new File("D:\\OneDrive\\桌面");
        File f3 = new File(parent,"a.txt");
        System.out.println(f3);
        //相对路径
        File f4 = new File("day08\\a.txt");
        System.out.println(f4);
    }
}
