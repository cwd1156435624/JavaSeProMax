package d4_integer;

/*
包装类：把基本数据类型的数据用对象封装起来，每一个基本类型多有一个包装类与之对用
    基本类型        包装类
    byte           Byte
    short          Short
    int            Integer
    long           Long
    float          Float
    double         Double
    char           Character
    boolean        Boolean

创建包装类的对象两种方案：
    方案1：使用构造器创建对象，比如：Integer i1 = new Integer(10);
    方案2：使用静态方法valueOf(数据)，比如：Integer i2 = Integer.valueOf(10);
 */
public class Demo1 {
    public static void main(String[] args) {
        //这种写法过时了，不推荐。
        /*Integer i1 = new Integer(10);
        System.out.println(i1);*/

        Integer i2 = Integer.valueOf(10);
        System.out.println(i2);
    }
}
