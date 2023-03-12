package d3_set;

import java.util.HashSet;

/*
目标：演示往HashSet集合中添加Student对象，如果两个对象的姓名和年龄一样，就认为是同一个对象，只允许存储一个
 */
public class Demo3 {
    public static void main(String[] args) {
        Student s1 = new Student("王二狗",18);
        Student s2 = new Student("王二狗",18);
        Student s3 = new Student("李翠花",20);
        HashSet<Student> hs = new HashSet<>();
        hs.add(s1);
        hs.add(s2);
        hs.add(s3);
        System.out.println(hs);
    }
}
