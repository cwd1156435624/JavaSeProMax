package d2_object;

/*
Object类概述：
    是所有类的父类，任何一个类的对象(包括数组)，都可以调用Object类的方法
Object类的常用方法
    public boolean equals(Object obj)
            判断当前对象是否与参数对象“相等”
 */
public class Demo {
    public static void main(String[] args) {
        Student s1 = new Student("张三",18);
        Student s2 = new Student("张三",18);
        System.out.println(s1 == s2);

        System.out.println("--------------");
        //重写equals方法
        boolean b = s1.equals(s2);
        System.out.println(b);

        System.out.println("---------------");
        System.out.println(s1.toString());
        System.out.println(s2);
    }
}
