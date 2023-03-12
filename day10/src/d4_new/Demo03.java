package d4_new;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

//目标：掌握线程的第三种创建方式-Callable、FutureTask接口实现
public class Demo03 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        /**
         * FutureTask的API：
         *      FutureTask<>(Callable call)：把Callable对象封装成FutureTask对象
         *      V get()：获取线程执行call方法返回的结果
         *
         * 优点：
         *      线程任务类只是实现接口，可以继续继承类和实现接口，扩展性强
         *      可以在线程执行完毕后去获取线程执行的结果
         *
         * 缺点：编码复杂一点
         */

        MyCallable mc = new MyCallable();
        FutureTask<Integer> ft = new FutureTask<>(mc);
        Thread t1 = new Thread(ft);
        t1.start();

        Integer integer = ft.get();
        System.out.println(integer);
    }
}
