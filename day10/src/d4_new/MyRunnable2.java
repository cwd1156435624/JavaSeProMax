package d4_new;

public class MyRunnable2 implements Runnable{

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        for (int i = 0; i <= 100; i++) {
            System.out.println(name + "...正在上传..." + i + "%");
        }
    }
}
