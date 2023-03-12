package d6_zuoye.demo2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Demo2 {
    public static void main(String[] args) throws IOException {
        /*
        - 读取”xxx.txt”文件，将每行数据封装为一个Student对象，并将Student对象存储到一个集合
        - 遍历并打印集合的所有Student信息
         */
        FileReader fr = new FileReader("day09\\stus.txt");
        BufferedReader br = new BufferedReader(fr);
        String line;
        ArrayList<Student> list = new ArrayList<>();
        while ((line = br.readLine()) != null){
            //切割字符串，得到name和age
            String[] strings = line.split(",");
            //给name和age赋值
            String name = strings[0];
            int age = Integer.parseInt(strings[1]);
            //把name和age添加到list集合中
            list.add(new Student(name,age));
        }
        System.out.println(list);
    }
}
