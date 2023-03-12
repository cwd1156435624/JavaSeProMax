package d4_zuoye.Demo2;

import java.util.ArrayList;
import java.util.Arrays;

/*
- 需求 : 自定义学生类:包含姓名,年龄,成绩属性.私有成员变量,生成无参,有参构造方法,生成get/set方法.
- 创建5个学生放到 ArrayList中。获取每个学生信息，统计总分，平均分，最高分，最低分并输出
 */
public class demo2 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("王二狗",18,88));
        list.add(new Student("李翠花",20,90));
        list.add(new Student("吴刚",22,75));
        list.add(new Student("刘瘤子",19,70));
        list.add(new Student("陈帅帅",19,100));

        //总分
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            sum += stu.getScore();
        }

        //最高分
        Student smax = list.get(0);
        int max = smax.getScore();
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            if (max < stu.getScore()){
                max = stu.getScore();
            }
        }

        //最低分
        Student smin = list.get(0);
        int min = smax.getScore();
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            if (min > stu.getScore()){
                min = stu.getScore();
            }
        }

        //平均分
        int avg = sum / list.size();
        System.out.println(list);
        System.out.println("最高分是:" + max);
        System.out.println("最低分是:" + min);
        System.out.println("总分是:" + sum);
        System.out.println("平均分是:" + avg);
    }
}
