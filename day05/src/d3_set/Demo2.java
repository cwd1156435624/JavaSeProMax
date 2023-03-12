package d3_set;

/*
目标：演示hashCode()方法的作用
 */
public class Demo2 {
    public static void main(String[] args) {
        //需求：创建2个Student对象，并获取这两个Student对象的哈希值，观察哈希值是否相同
        Student stu1 = new Student("王二狗",18);
        Student stu2 = new Student("王二狗",18);

        System.out.println(stu1.hashCode());
        System.out.println(stu2.hashCode());
    }
}
