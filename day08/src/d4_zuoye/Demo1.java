package d4_zuoye;

//假设在`C:\itheima\`目录下有若干个文件或者文件夹，请编写程序查找`C:\itheima`目录下的所以后缀为.txt的文件。

import java.io.File;

public class Demo1 {
    public static void main(String[] args) {
        File file = new File("C:\\itheima");
        String name = ".txt";
        searchFile(file,name);
    }

    public static void searchFile(File file,String name){
        File[] files = file.listFiles();
        if (files != null){
            for (File file1 : files) {
                if (file1.isFile()){
                    if (file1.getName().contains(name)){
                        System.out.println(file1);
                    }
                }else {
                    searchFile(file1,name);
                }
            }
        }
    }
}
