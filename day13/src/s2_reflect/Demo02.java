package s2_reflect;

//目标：掌握利用反射获取构造器Constructor对象

import java.lang.reflect.Constructor;

/**
 * 需求：利用反射获取Student类的构造器对象，并利用构造器对象创建Student对象
 * 获取构造器的方法：
 *      Constructor<?>[] getConstructors()：返回所有构造器对象的数组（只能拿public的）
 *      Constructor<?>[] getDeclaredConstructors()：返回所有构造器对象的数组，存在就能拿到
 *      Constructor<T> getConstructor(Class<?>... parameterTypes)：返回单个构造器对象（只能拿public的）
 *      Constructor<T> getDeclaredConstructor(Class<?>... parameterTypes)：返回单个构造器对象，存在就能拿到
 *
 * 创建对象的方法：
 *     // T newInstance(Object... initargs)：根据指定的构造器创建对象
 *      void setAccessible(boolean flag)：设置为true,表示取消访问检查，进行暴力反射
 */
public class Demo02 {
    public static void main(String[] args) throws Exception {
        //获取class对象
        Class<?> clazz = Class.forName("s2_reflect.Student");

        //Constructor<?>[] getConstructors()：返回所有构造器对象的数组（只能拿public的）
        Constructor<?>[] cons = clazz.getConstructors();
        for (Constructor<?> con : cons) {
            System.out.println(con);
        }

        System.out.println("------------------");
        //Constructor<?>[] getDeclaredConstructors()：返回所有构造器对象的数组，存在就能拿到
        Constructor<?>[] conds = clazz.getDeclaredConstructors();
        for (Constructor<?> cond : conds) {
            System.out.println(cond);
        }

        System.out.println("------------------");
        //Constructor<T> getConstructor(Class<?>... parameterTypes)：返回单个构造器对象（只能拿public的）
        Constructor<?> con = clazz.getConstructor(String.class);
        System.out.println(con);

        System.out.println("------------------");
        //Constructor<T> getDeclaredConstructor(Class<?>... parameterTypes)：返回单个构造器对象，存在就能拿到
        Constructor<?> con2 = clazz.getDeclaredConstructor(String.class, int.class ,String.class);
        System.out.println(con2);

        System.out.println("------------------");
        //T newInstance(Object... initargs)：根据指定的构造器创建对象
        Student stu1 = (Student) con.newInstance("王二狗");
        System.out.println(stu1);

        Student stu2 = (Student) con2.newInstance("李翠花", 20,"女");
        System.out.println(stu2);

        System.out.println("------------------");
        //void setAccessible(boolean flag)：设置为true,表示取消访问检查，进行暴力反射
        con2.setAccessible(true);
        Student stu3 = (Student) con2.newInstance("吴刚",25,"男");
        System.out.println(stu3);

    }
}
