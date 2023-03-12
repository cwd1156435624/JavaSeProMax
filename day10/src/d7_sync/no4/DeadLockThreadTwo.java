package d7_sync.no4;

public class DeadLockThreadTwo extends Thread {
    Object lockA;
    Object lockB;

    public DeadLockThreadTwo(Object lockA, Object lockB, String name) {
        this.lockA = lockA;
        this.lockB = lockB;
        this.setName(name);
    }

    @Override
    public void run() {
        synchronized (lockB) {
            System.out.println(this.getName() + "正在执行");
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (lockA) {

            }
        }
    }
}
