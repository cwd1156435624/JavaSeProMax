package s2_reflect;

//目标：掌握获取Class类对象的三种方式
/**
 * 需求：分别利用三种方式获取Student类的字节码对象
 * 获取Class类对象的三种方式：
 *      方式1：Class类静态方法forName(String className)
 *      方式2：类名.class
 *      方式3：对象.getClass()
 */
public class Demo01 {
    public static void main(String[] args) throws Exception {
        Class<?> clazz1 = Class.forName("s2_reflect.Student");
        System.out.println(clazz1);

        Class<?> clazz2 = Student.class;
        System.out.println(clazz2);

        Student stu = new Student();
        Class<?> clazz3 = stu.getClass();
        System.out.println(clazz3);

        System.out.println(clazz1==clazz2);
        System.out.println(clazz2==clazz3);
    }
}
