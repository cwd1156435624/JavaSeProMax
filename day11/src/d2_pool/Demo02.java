package d2_pool;

import java.util.concurrent.*;

//目标：掌握线程池处理Callable任务
public class Demo02 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ThreadPoolExecutor pool = new ThreadPoolExecutor(
                //核心线程数量
                3,
                //总线程数量
                5,
                //临时线程存货时间数
                10,
                //临时先名称存活时间单位
                TimeUnit.SECONDS,
                //阻塞队列，可以多少个线程排队
                new ArrayBlockingQueue<>(6),
                //创建线程的工厂
                Executors.defaultThreadFactory(),
                //拒绝策略，超出服务范围，怎么办
                new ThreadPoolExecutor.AbortPolicy());
        /**
         * Future<T> submit(Callable<T> task)：执行Callable任务，返回未来任务对象获取线程结果
         *
         * 需求：使用线程池执行12个任务，分别尝试不获取返回值和获取返回值看看
         */

        Future<Integer> f = pool.submit(new Callable<Integer>() {

            @Override
            public Integer call() throws Exception {
                int sum = 0;
                for (int i = 1; i <= 100; i++) {
                    sum += i;
                }
                return sum;
            }
        });
        int sum = f.get();
        System.out.println(sum);
    }
}