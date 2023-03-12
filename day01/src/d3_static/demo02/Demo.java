package d3_static.demo02;
//目标：掌握静态成员方法的使用
public class Demo {
    public static void main(String[] args) {
        /**
         * 使用方式：
         *      被static修饰的方法叫静态方法（也叫静态成员方法、类方法）
         *      静态方法推荐使用"类名.方法名(参数)"访问
         *
         * 静态方法的访问特点：
         *      静态方法可以直接访问静态成员（方法和变量）
         *      静态方法不可以直接访问实例成员（方法和变量）
         *      实例方法既可以直接访问静态成员，也可以直接访问实例成员
         */
        int[] arrayA = {11,22,33,44,55,66};
        ArrayUtil.print(arrayA);

        ArrayUtil au = new ArrayUtil();
        int[] arrayB = {10,20,30,40,50,60};
        au.print(arrayB);

        System.out.println(staticFiled);
        staticMethod();
    }
    public void sss(){
        System.out.println(noStaticField);
        noStaticMethod();
    }

    String noStaticField = "实例成员变量";

    static String staticFiled = "静态成员变量";

    public void noStaticMethod() {
        System.out.println("实例成员方法");
    }

    public static void staticMethod() {
        System.out.println("静态成员方法");
    }
}
