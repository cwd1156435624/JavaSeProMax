package d7_sync.no1;


//目标：掌握同步代码块给线程代码加锁
public class Demo01 {
    public static void main(String[] args) {
        /**
         * 作用：把出现线程安全问题的核心代码给上锁
         *
         * 格式：
         *      synchronized(同步锁对象){
         *          操作共享资源的代码
         *      }
         *
         * 锁对象要求：锁对象只要对于当前同时执行的线程来说是同一个对象即可
         *
         * 原理：每次只能一个线程进入，执行完毕后自动解锁，其他线程才可以进来执行
         *
         * 需求：使用同步代码块改进账户取钱案例
         */
        Account account = new Account(100000);


        DirThread t1 = new DirThread(account);
        t1.setName("小明");
        DirThread t2 = new DirThread(account);
        t2.setName("小红");

        t1.start();
        t2.start();
    }
}
