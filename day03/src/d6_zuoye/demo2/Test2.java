package d6_zuoye.demo2;

public class Test2 {
    public static void main(String[] args) {
        Student s1 = new Student("张三",23);
        Student s2 = new Student("张三",23);
        boolean b = s1.equals(s2);
        System.out.println(b);
        System.out.println(s1);
        System.out.println(s2.toString());
    }
}
