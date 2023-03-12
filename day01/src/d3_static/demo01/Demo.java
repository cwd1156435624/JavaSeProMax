package d3_static.demo01;

//目标：掌握静态成员变量的使用
public class Demo {
    public static void main(String[] args) {
        /**
         * static关键字是静态的意思，可以修饰成员变量
         *      被static修饰的变量叫类变量（也叫静态成员变量、静态属性）
         *      没有被static修饰的变量叫实例变量（也叫实例成员变量，实例属性）
         *
         * 类变量特点：类变量被该类的所有对象共享，通过"类名.变量名"访问
         * 实例变量特点：实例变量属于对象，每个对象都有一份，相互独立互不干扰。通过"对象名.变量名"访问
         */
        Student.schoolName = "黑马程序员";
        System.out.println(Student.schoolName);

        Student s = new Student();
        s.name = "王二狗";
        System.out.println(s.name);
    }
}


