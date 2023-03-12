package d2_file;

import java.io.File;

/*
目标：递归搜索文件夹

需求：在指定目录下搜索指定包含指定名称的文件，比如在C:\\Program Files目录下搜索QQ.exe这个文件，然后直接输出。

 */
public class Demo6 {
    public static void main(String[] args) {
        File file = new File("D:\\");
        String name = "a.txt";
        searchFile(file,name);
    }

    public static void searchFile(File file,String name){
        File[] files = file.listFiles();
        if (files!=null){
            for (File file1 : files) {
                if (file1.isFile()){
                    //如果是一个文件，则判断是否是需要找的文件
                    if (file1.getName().contains(name)){
                        System.out.println(file1);
                    }
                }else {
                    //如果是文件夹，则继续查找文件
                    searchFile(file1,name);
                }
            }
        }
    }
}
