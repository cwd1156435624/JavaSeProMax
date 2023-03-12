package s4_zuoye.demo2;

import java.lang.reflect.Field;
import java.util.Map;

public class MyBeanUtils {
    public static void populate(Object obj, Map<String,Object> map) throws Exception {
        Class<?> clazz = obj.getClass();

        Field[] Dfields = clazz.getDeclaredFields();
        for (Field dfield : Dfields) {
            Object value = map.get(dfield.getName());
            dfield.setAccessible(true);
            dfield.set(obj,value);
        }
    }
}