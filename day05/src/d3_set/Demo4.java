package d3_set;

import java.util.Comparator;
import java.util.TreeSet;

/*
目标：演示往TreeSet集合中添加Student对象，并按照两种方式对元素进行排序
    排序方式一：让元素类实现Comparable接口，实现compareTo方法

    排序方式二：在创建TreeSet集合时，传递一个比较器对象，比较器是Comparator接口的实现类对象

 */
public class Demo4 {
    public static void main(String[] args) {
        TreeSet<Integer> t1 = new TreeSet<>();
        t1.add(10);
        t1.add(40);
        t1.add(30);
        t1.add(20);
        System.out.println(t1);

        TreeSet<String> t2 = new TreeSet<>();
        t2.add("a");
        t2.add("d");
        t2.add("b");
        t2.add("c");
        t2.add("e");
        t2.add("y");
        System.out.println(t2);

        //方式一，Student类中重写compareTo方法
        TreeSet<Student> t3 = new TreeSet<>();
        t3.add(new Student("王二狗",18));
        t3.add(new Student("李翠花",20));
        t3.add(new Student("吴刚",20));
        t3.add(new Student("刘瘤子",16));
        System.out.println(t3);

        //方式二，使用比较器来比较
        //如果两种方式都存在，以比较器为准
        TreeSet<Student> t4 = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int num = o1.getAge() - o2.getAge();
                return num;
            }
        });
        t4.add(new Student("王二狗",18));
        t4.add(new Student("李翠花",20));
        t4.add(new Student("吴刚",20));
        t4.add(new Student("刘瘤子",16));
        System.out.println(t4);
    }
}
