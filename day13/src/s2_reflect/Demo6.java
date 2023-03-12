package s2_reflect;

import java.io.FileReader;
import java.lang.reflect.Method;
import java.util.Properties;

public class Demo6 {
    public static void main(String[] args) throws Exception {
        Properties pro = new Properties();
        pro.load(new FileReader("day13\\config.properties"));

        String classname = pro.getProperty("classname");
        String methodName = pro.getProperty("methodName");

        Class<?> clazz = Class.forName(classname);

        Method method = clazz.getMethod(methodName);

        Object obj = clazz.getConstructor().newInstance();
        method.invoke(obj);
    }
}
