package d6_zuoye;

import java.util.concurrent.*;

/*
- 使用ThreadPoolExecutor创建一个线程池，要求核心线程数3个，最大线程数6个，任务队列长度为10，临时线程存活时间为5秒；
- 要求给7个参数加上注释
- 在使用创建好的线程池，提交16个任务
- 每一个任务打印线程名称，和任务编号（参考老师写的代码）
 */
public class Demo1 {
    public static void main(String[] args) {
        ThreadPoolExecutor pool = new ThreadPoolExecutor(
                3,//核心线程数
                6,//最大线程数
                5,//临时线程存活时间
                TimeUnit.SECONDS,//秒
                new ArrayBlockingQueue<>(10),//任务队列长度
                Executors.defaultThreadFactory(),//线程工厂
                new ThreadPoolExecutor.AbortPolicy()//拒绝政策
        );

        for (int i = 1; i <= 16; i++) {
            int j = i;
            pool.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName() + "线程执行第" + j + "个任务");
                }
            });
        }
    }
}
