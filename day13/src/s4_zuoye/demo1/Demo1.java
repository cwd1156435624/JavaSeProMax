package s4_zuoye.demo1;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/*
- 定义多个javabean类
  - Person类，方法eat
  - Dog类，方法lookHome
  - Cat类，方法catchMouse
- 利用反射技术实现，只修改配置文件，就可以运行不同类中的不同方法
 */
public class Demo1 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Properties pro = new Properties();
        pro.load(new FileReader("day13\\data.properties"));
        String property1 = pro.getProperty("className");
        String property2 = pro.getProperty("methodName");

        Class<?> clazz = Class.forName(property1);

        Method method = clazz.getMethod(property2);

        Object obj = clazz.getConstructor().newInstance();
        method.invoke(obj);
    }
}
