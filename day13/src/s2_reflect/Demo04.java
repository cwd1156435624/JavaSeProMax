package s2_reflect;

//目标：掌握利用反射获取方法Method对象

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * 需求：获取Student类中的各个方法Method对象，并且调用方法
 * 获取成员方法的api：
 *      Method[] getMethods()：返回所有成员方法对象的数组（只能拿public的）
 *      Method[] getDeclaredMethods()：返回所有成员方法对象的数组，存在就能拿到
 *      Method getMethod(String name, Class<?>... parameterTypes)：返回单个成员方法对象（只能拿public的）
 *      Method getDeclaredMethod(String name, Class<?>... parameterTypes)：返回单个成员方法对象，存在就能拿到
 *
 * 触发执行的方法：
 *      Object invoke(Object obj, Object... args)
 *              运行方法
 *              参数一：用obj对象调用该方法
 *              参数二：调用方法的传递的参数（如果没有就不写）
 *              返回值：方法的返回值（如果没有就不写）
 */
public class Demo04 {
    public static void main(String[] args) throws Exception {
        //先获取class对象
        Class<?> clazz = Class.forName("s2_reflect.Student");
        //Method[] getMethods()：返回所有成员方法对象的数组（只能拿public的）
        Method[] methods = clazz.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }

        System.out.println("-----------------");
        //Method[] getDeclaredMethods()：返回所有成员方法对象的数组，存在就能拿到
        Method[] DMethods = clazz.getDeclaredMethods();
        for (Method dMethod : DMethods) {
            System.out.println(dMethod);
        }

        System.out.println("-----------------");
        //Method getMethod(String name, Class<?>... parameterTypes)：返回单个成员方法对象（只能拿public的）
        Method m1 = clazz.getMethod("setName", String.class);
        System.out.println(m1);
        Method m2 = clazz.getMethod("getName");
        System.out.println(m2);

        System.out.println("-----------------");
        //Method getDeclaredMethod(String name, Class<?>... parameterTypes)：返回单个成员方法对象，存在就能拿到
        Method show = clazz.getDeclaredMethod("show");
        System.out.println(show);

        System.out.println("-----------------");
        //运行之前要先创建对象
        Student stu = (Student) clazz.getConstructor().newInstance();
        //Object invoke(Object obj, Object... args)
        //运行方法
        //参数一：用obj对象调用该方法
        //参数二：调用方法的传递的参数（如果没有就不写）
        //返回值：方法的返回值（如果没有就不写）
        m1.invoke(stu,"王二狗");
        String name = (String) m2.invoke(stu);
        System.out.println(name);
        System.out.println(stu);

        System.out.println("-----------------");
        //私有方法使用前需要开启权限
        show.setAccessible(true);
        show.invoke(stu);
    }
}
