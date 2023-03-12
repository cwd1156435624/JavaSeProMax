package d1_stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

/*
目标：Stream流的中间方法。掌握中间方法的特点
 */
public class Demo3 {
    public static void main(String[] args) {
        List<Double> scores = new ArrayList<>();
        Collections.addAll(scores, 88.5, 100.0, 60.0, 99.0, 9.5, 99.6, 25.0);
        // 需求1：找出成绩大于等于60分的数据，并升序后，再输出。
        scores.stream().filter(s -> s >=60).forEach(s -> System.out.println(s));
        System.out.println("----------------");
        List<Student> students = new ArrayList<>();
        Student s1 = new Student("蜘蛛精", 26, 172.5);
        Student s2 = new Student("蜘蛛精", 26, 172.5);
        Student s3 = new Student("紫霞", 23, 167.6);
        Student s4 = new Student("白晶晶", 25, 169.0);
        Student s5 = new Student("牛魔王", 35, 183.3);
        Student s6 = new Student("牛夫人", 34, 168.5);
        Collections.addAll(students, s1, s2, s3, s4, s5, s6);

        // 需求2：找出年龄大于等于23,且年龄小于等于30岁的学生，并按照年龄降序输出.
        students.stream()
                .filter(s -> s.getAge()>=23)
                .filter(s -> s.getAge()<=30)
                .sorted((o1, o2) -> o2.getAge() - o1.getAge())
                .forEach(s -> System.out.println(s));
        System.out.println("----------------");

        // 需求3：取出身高最高的前3名学生，并输出。
        students.stream()
                .sorted((o1, o2) -> Double.compare(o2.getHeight(),o1.getHeight()))
                .limit(3)//截取前几位元素
                .forEach(s -> System.out.println(s));
        System.out.println("----------------");

        // 需求4：取出身高倒数的2名学生，并输出
        students.stream()
                .sorted((o1, o2) -> Double.compare(o2.getHeight(), o1.getHeight()))
                .skip(students.size()-2)//跳过元素
                .forEach(s -> System.out.println(s));
        System.out.println("----------------");

        // 需求5：找出身高超过168的学生、去除重复的学生（属性值相同，则认为元素重复）、获取所有学生的姓名、并输出
        //方法一
        students.stream()
                .filter(s -> s.getHeight()>=168)
                .distinct()//去重，需要重写equals和hashCode
                .forEach(s-> System.out.println(s.getName()));
        System.out.println("----------------");

        //方法二
        students.stream()
                .filter(s -> s.getHeight()>=168)
                .distinct()
                .map(s -> s.getName())//决定打印输出的值
                .forEach(s -> System.out.println(s));
        //需求6：把两个流合并为一个流
        Stream<Integer> stream1 = Stream.of(1, 2, 3, 4, 5);
        Stream<Integer> stream2 = Stream.of(6, 7, 8, 9, 10);
        //合并
        Stream<Integer> stream3 = Stream.concat(stream1, stream2);
        stream3.forEach(s -> System.out.println(s));
    }
}
