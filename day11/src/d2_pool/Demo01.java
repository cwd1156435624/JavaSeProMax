package d2_pool;

import java.util.concurrent.*;

//目标：掌握线程池的创建并且能执行Runnable任务
public class Demo01 {
    public static void main(String[] args) {
        /**
         * ThreadPoolExecutor构造器参数：
         *      核心线程数，
         *      最大线程数，
         *      临时线程最大存活时间，
         *      存货时间的单位，
         *      任务队列（等待的任务），
         *      创建线程的线程工厂（Executors.defaultThreadFactory()），
         *      拒绝策略（默认策略：new ThreadPoolExecutor.AbortPolicy()）
         *
         * ExecutorService的常用api：
         *      execute(Runnable command)：执行任务/命令，没有返回值，一般用来执行 Runnable 任务
         *      Future<T> submit(Callable<T> task)：执行任务，返回未来任务对象获取线程结果，一般拿来执行Callable任务
         *      shutdown()：等任务执行完毕后关闭线程池
         *      shutdownNow()：立刻关闭，停止正在执行的任务，并返回队列中未执行的任务
         *
         * 拒绝策略：
         *      ThreadPoolExecutor.AbortPolicy：丢弃任务并抛出RejectedExecutionException异常
         *      ThreadPoolExecutor.DiscardPolicy：丢弃任务，但是不抛出异常
         *      ThreadPoolExecutor.DiscardOldestPolicy：抛弃队列中等待最久的任务 然后把当前任务加入队列中
         *      ThreadPoolExecutor.CallerRunsPolicy：由主线程负责调用任务的run()方法从而绕过线程池直接执行
         */

        ThreadPoolExecutor pool = new ThreadPoolExecutor(
                4,
                6,
                3,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(5),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy()
        );

        for (int i = 1; i <= 11; i++) {
            int j = i;
            pool.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName() + "线程在执行" + j + "号任务");
                }
            });
        }

    }
}

