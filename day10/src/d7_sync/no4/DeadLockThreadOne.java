package d7_sync.no4;

public class DeadLockThreadOne extends Thread {
    Object lockA;
    Object lockB;

    public DeadLockThreadOne(Object lockA, Object lockB, String name) {
        this.lockA = lockA;
        this.lockB = lockB;
        this.setName(name);
    }

    @Override
    public void run() {
        synchronized (lockA) {
            System.out.println(this.getName() + "正在执行");
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (lockB) {

            }
        }
    }
}
