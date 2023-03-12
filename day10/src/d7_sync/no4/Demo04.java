package d7_sync.no4;

//目标：了解死锁！
public class Demo04 {
    public static void main(String[] args) {
        Object lockA = new Object();
        Object lockB = new Object();
        DeadLockThreadOne t1 = new DeadLockThreadOne(lockA, lockB, "线程1");
        DeadLockThreadTwo t2 = new DeadLockThreadTwo(lockA, lockB, "线程2");
        t1.start();
        t2.start();
    }
}
