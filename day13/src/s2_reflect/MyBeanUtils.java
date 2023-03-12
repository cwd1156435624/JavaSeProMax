package s2_reflect;

import java.lang.reflect.Field;
import java.util.Map;

public class MyBeanUtils {
    public static void populate(Object obj, Map<String,Object> map) throws IllegalAccessException {
        Class<?> clazz = obj.getClass();

        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            //需要给field成员变量赋值，但是这个值是存储在Map集合中，
            //那么我们从Map集合拿出来，再给field赋值即可
            Object value = map.get(field.getName());
            field.setAccessible(true);
            field.set(obj,value);
        }
    }
}
