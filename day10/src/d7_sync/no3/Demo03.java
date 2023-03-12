package d7_sync.no3;

import java.util.concurrent.locks.ReentrantLock;

//目标：掌握Lock锁给线程代码上锁
public class Demo03 {
    public static void main(String[] args) {
        /**
         * Lock是接口不能直接实例化，这里采用它的实现类ReentrantLock来构建Lock锁对象
         *      lock()：获得锁
         *      unlock()：释放锁
         * 注意：锁对象要唯一
         */
        Account account = new Account();
        account.setBalance(100000);
        ReentrantLock rl = new ReentrantLock();

        MyRunnable mr = new MyRunnable(account,100000);

        Thread t1 = new Thread(mr,"小明");
        Thread t2 = new Thread(mr,"小红");

        t1.start();
        t2.start();
    }
}
