package d4_new;

//目标：掌握第一种线程创建的方式-继承Thread
public class Demo01 {
    public static void main(String[] args) {
        /**
         * Java通过java.lang.Thread类来代表线程的
         *
         * 优点：编码简单
         *
         * 缺点：线程类已经继承Thread，无法继承其他类，不利于扩展
         *
         * 需求：自定义一个线程类MyThread，重写run方法。开启线程使用
         */
        MyThread t1 = new MyThread();
        t1.start();
        MyThread t2 = new MyThread();
        t2.start();
        MyThread t3 = new MyThread();
        t3.start();
    }
}
