package d1_extends.demo01;

//目标：掌握继承关系的实现，提高代码复用性
public class Demo {
    public static void main(String[] args) {
        /**
         * 继承实现格式：
         *      public class 子类 extends 父类 {}
         *
         * 继承关系的好处：
         *      当子类继承父类后，就可以直接使用父类的非私有成员属性和方法，提高代码的复用性
         *
         * 需求：使用继承优化Student类和Teacher类，提高代码复用性
         */
        Student s = new Student();
        s.setName("王二狗");
        s.setAge(18);
        s.setSchool("传智播客");
        System.out.println(s.getName());
        System.out.println(s.getAge());
        System.out.println(s.getSchool());
        s.study();

        System.out.println("-------------");
        Teacher t = new Teacher();
        t.setName("李翠花");
        t.setAge(30);
        System.out.println(t.getName());
        System.out.println(t.getAge());
        t.teach();
    }
}