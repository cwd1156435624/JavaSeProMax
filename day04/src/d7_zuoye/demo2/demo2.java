package d7_zuoye.demo2;

import java.util.Arrays;
import java.util.Comparator;

/*
按照下面要求，使用Arrays的sort方法和Lamdba表达式完成自定义对象的排序

- 定义一个Student类，有姓名和年龄两个属性，并提供get和set以及toString方法
- 创建4个Student对象，并添加到数组中
- 使用Arrays的sort方法对学生对象按照年龄的升序排列，排列规则用Lamdba表达式来写。
- 遍历打印数组中的每一个学生对象的姓名和年龄
- 【注意：排序规则是两个对象的年龄相减，不是两个对象相减】
 */

public class demo2 {
    public static void main(String[] args) {
        //创建4个Student对象，并添加到数组中
        Student s1 = new Student("王二狗",18);
        Student s2 = new Student("李翠花",20);
        Student s3 = new Student("吴刚",30);
        Student s4 = new Student("刘流子",19);
        Student[] stu = {s1,s2,s3,s4};
        //使用Arrays的sort方法对学生对象按照年龄的升序排列，排列规则用Lamdba表达式来写。
        Arrays.sort(stu, ( o1,  o2) -> o1.getAge() - o2.getAge());
        //遍历打印数组中的每一个学生对象的姓名和年龄
        System.out.println(Arrays.toString(stu));
    }
}
