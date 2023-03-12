package d2_final.demo01;

//目标：掌握final关键字的特点
public class Demo {
    public static void main(String[] args) {
        /**
         * 修饰类：表明该类是最终类，不能被继承
         * 修饰方法：表明该方法是最终方法，不能被重写
         * 修饰变量：也叫常量。变量存储的值不能被修改
         */
        Zi z = new Zi();
        /*final*/ int a = 10;
    }
}
