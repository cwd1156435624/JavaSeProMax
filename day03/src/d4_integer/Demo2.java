package d4_integer;

/*
目标：包装类的数据转换
 */
public class Demo2 {
    public static void main(String[] args) {
        //1.字符转换为其他的基本类型数据
        //需求1：把"12345"转换为12345
        int i1 = Integer.parseInt("12345");
        System.out.println(i1);

        //需求2：把"12.345"转换为12.345
        double d1 = Double.parseDouble("3.14159");
        System.out.println(d1);

        //需求3：把"true"转换为true
        boolean b1 = Boolean.parseBoolean("true");
        System.out.println(b1);
        System.out.println("----------------");


        //2.把基本数据类型转换为字符串
        //需求1：把12345转换为"12345"
        String s1 = String.valueOf(12345);
        System.out.println(s1);

        //需求2：把12.345转换为“12.345”
        String s2 = String.valueOf(3.14159);
        System.out.println(s2);

        //需求3：把true转换为“true"
        String s3 = String.valueOf(true);
        System.out.println(s3);


        System.out.println("=======================");
        int i = Integer.parseInt("12356");
        System.out.println(i);
        String s = String.valueOf(123456);
        System.out.println(s);

    }
}
