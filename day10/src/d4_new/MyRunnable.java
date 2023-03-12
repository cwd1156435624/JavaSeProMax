package d4_new;

public class MyRunnable implements Runnable{

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        for (int i = 0; i <= 100; i++) {
            System.out.println(name + "...正在下载..." + i + "%");
        }
    }
}
