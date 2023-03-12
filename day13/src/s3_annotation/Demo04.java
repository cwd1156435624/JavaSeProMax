package s3_annotation;

//目标：了解注解解析

import java.lang.annotation.Annotation;

/**
 * 解析注解的方法：
 *      Annotation[] getDeclaredAnnotations()：
 *              获得当前对象上使用的所有注解，返回注解数组
 *      T getDeclaredAnnotation(Class<T> annotationClass)：
 *              根据注解类型获得对应注解对象
 *      boolean isAnnotationPresent(Class<Annotation> annotationClass)：
 *              判断当前对象是否使用了指定的注解，如果使用了则返回true，否则false
 */
@Anno(name = "李翠花",age = 19, value = 163)
public class Demo04 {
    private String name;
    public void show(){}
    public static void main(String[] args) throws Exception {
        Class<?> clazz = Class.forName("s3_annotation.Demo04");

        //获取字节码上所有的注解
        Annotation[] arr = clazz.getDeclaredAnnotations();
        for (Annotation annotation : arr) {
            System.out.println(annotation);
        }

        //获取字节码上的Anno注解
        Anno anno = clazz.getAnnotation(Anno.class);
        System.out.println(anno);
        System.out.println("获取类上注解的属性值：");
        System.out.println("name属性值：" + anno.name());
        System.out.println("age属性值：" + anno.age());
        System.out.println("value属性值：" + anno.value());
    }
}