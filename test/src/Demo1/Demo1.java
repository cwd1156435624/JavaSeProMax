package Demo1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Demo1 {
    public static void main(String[] args) throws Exception {
        //创建FileReader用来读取文件中的数据
        FileReader fr = new FileReader("test\\user.txt");
        //使用缓冲流来读取一行数据
        BufferedReader br = new BufferedReader(fr);
        //定义一个ArrayList集合用来存放User对象
        ArrayList<User> list = new ArrayList<>();
        //读取user.txt文件中的数据
        String str;
        while ((str = br.readLine()) != null){
            //将s切割，得到字符串数组
            String[] strings = str.split(",");
            //给User对象赋值
            String name = strings[0];
            String gender = strings[1];
            int age = Integer.parseInt(strings[2]);
            String city = strings[3];
            //将得到的数据存入到List集合中
            User user = new User(name,gender,age,city);
            list.add(user);
        }
        //遍历list集合，打印User对象的数据
        for (User user : list) {
            System.out.println(user);
        }
    }
}
