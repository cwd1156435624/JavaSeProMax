package s2_reflect;

//目标：掌握利用反射获取成员变量Field对象

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/**
 * 需求：获取Student类中的各个属性Field对象，并给属性赋值、获取属性的值
 * 获取成员变量的方法：
 *      Field[] getFields()：返回所有成员变量对象的数组（只能拿public的）
 *      Field[] getDeclaredFields()：返回所有成员变量对象的数组，存在就能拿到
 *      Field getField(String name)：返回单个成员变量对象（只能拿public的）
 *      Field getDeclaredField(String name)：返回单个成员变量对象，存在就能拿到
 *
 * Field类中用于取值、赋值的方法：
 *      void set(Object obj, Object value)：赋值
 *      Object get(Object obj)：获取值
 */
public class Demo03 {
    public static void main(String[] args) throws Exception {
        //获取class对象
        Class<?> clazz = Class.forName("s2_reflect.Student");
        //Field[] getFields()：返回所有成员变量对象的数组（只能拿public的）
        Field[] fields1 = clazz.getFields();
        for (Field field : fields1) {
            System.out.println(field);
        }

        System.out.println("-----------------");
        //Field[] getDeclaredFields()：返回所有成员变量对象的数组，存在就能拿到
        Field[] fiekds2 = clazz.getDeclaredFields();
        for (Field field : fiekds2) {
            System.out.println(field);
        }

        System.out.println("-----------------");
        //Field getField(String name)：返回单个成员变量对象（只能拿public的）
        Field fgender = clazz.getField("gender");
        System.out.println(fgender);

        System.out.println("-----------------");
        //Field getDeclaredField(String name)：返回单个成员变量对象，存在就能拿到
        Field fname = clazz.getDeclaredField("name");
        System.out.println(fname);

        System.out.println("-----------------");
        //创建student对象
        Constructor<?> con = clazz.getDeclaredConstructor();
        Student stu = (Student) con.newInstance();
        //void set(Object obj, Object value)：赋值
        fgender.set(stu,"男");
        //私有变量需要暴力反射才能赋值
        fname.setAccessible(true);
        fname.set(stu,"王二狗");
        System.out.println(stu);

        System.out.println("-----------------");
        //Object get(Object obj)：获取值
        String gender = (String) fgender.get(stu);
        System.out.println(gender);
        String name = (String) fname.get(stu);
        System.out.println(name);

    }
}
