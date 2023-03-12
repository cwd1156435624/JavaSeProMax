package d4_new;

public class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            String name = getName();
            System.out.println(name+"正在下载..."+ i +"%");
        }
    }
}
