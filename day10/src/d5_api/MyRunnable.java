package d5_api;

public class MyRunnable implements Runnable {

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(name + "打了"+ i +"次冲");
        }
    }
}
