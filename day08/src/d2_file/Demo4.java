package d2_file;

import java.io.File;

/*
目标：File类遍历文件夹的方法、需要注意的事项
 */
public class Demo4 {
    public static void main(String[] args) {
        // 1、public File[] listFiles()
        File f1 = new File("D:\\idea\\IdeaSoftware\\JavaSeProMax\\day08");
        File[] files = f1.listFiles();
        for (File file : files) {
            System.out.println(file);
        }

        //如果文件为空，则返回一个长度为0的数组
        File f2 = new File("D:\\idea\\IdeaSoftware\\JavaSeProMax\\day08\\ithei");
        File[] files1 = f2.listFiles();
        System.out.println(files1.length);
    }
}
