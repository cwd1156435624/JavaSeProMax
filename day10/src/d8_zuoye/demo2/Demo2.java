package d8_zuoye.demo2;
/*
- 请使用继承Thread类的方式定义一个线程类，在run()方法中循环打印1--1000所有的数字。
- 定义main()方法，启动这个线程，然后在主线程中, 循环打印1--1000所有的数字。
- 打印的时候要带有线程名字, 无需设置, 默认线程名即可
- 请观察控制台打印，打印的情况
 */
public class Demo2 {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();
        for (int i = 1; i <= 1000; i++) {
            System.out.println("main..."+i);
        }
    }
}
