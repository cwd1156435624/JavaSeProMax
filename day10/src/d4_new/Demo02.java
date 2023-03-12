package d4_new;

//目标：掌握第二种创建线程的方式-实现Runnable接口
public class Demo02 {
    public static void main(String[] args) {
        /**
         * Thread构造器：
         *      Thread(String name)：可以为当前线程指定名称
         *      Thread(Runnable target)：封装Runnable对象成为线程对象
         *      Thread(Runnable target,String name )：封装Runnable对象成为线程对象，并指定线程名称
         *
         * 优点：线程任务类只是实现接口，可以继续继承类和实现接口，扩展性强
         *
         * 缺点：编程多一层对象包装，如果线程有执行结果是不可以直接返回的
         *
         * 需求：定义一个线程任务类，去实现Runnable接口，重写run方法
         */

        MyRunnable mr1 = new MyRunnable();
        Thread t1 = new Thread(mr1);
        t1.start();

        MyRunnable2 mr2 = new MyRunnable2();
        Thread t2 = new Thread(mr2);
        t2.start();
    }
}
