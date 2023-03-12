package d1_extends.Demo08;

public class Demo {
    public static void main(String[] args) {
        Student s1 = new Student("王二狗","黑马程序员");
        System.out.println(s1.getName());
        System.out.println(s1.getSchool());
        System.out.println("---------------------");
        Student s2 = new Student("李翠花");
        System.out.println(s2.getName());
        System.out.println(s2.getSchool());
    }
}
