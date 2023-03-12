package d8_zuoye.demo2;

public class MyThread extends Thread{
    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        for (int i = 1; i <= 1000; i++) {
            System.out.println(name + "..." + i);
        }
    }
}
