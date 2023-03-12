package d6_zuoye;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Demo1 {
    //键盘录入一句话，然后写入指定的文件中
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入：");
        String s = sc.next();
        FileWriter fw = new FileWriter("day09\\a.txt");
        fw.write(s);
        fw.close();
    }
}
