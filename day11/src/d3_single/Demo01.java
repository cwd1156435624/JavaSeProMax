package d3_single;

import java.io.IOException;

//目标：了解饿汉单例设计模式的实现方式
public class Demo01 {
    public static void main(String[] args) throws IOException {
        /**
         * 饿汉单例设计模式的实现步骤
         *      1.将构造器私有
         *      2.定义一个本类类型的静态属性，并且new一个本类对象进行赋值
         *      3.定义一个getInstance()方法，返回上面创建的对象
         *
         * 需求：
         *      1.使用饿汉单例设计模式，设计一个任务管理器类TaskManager
         *      2.将TaskManager类从饿汉单例设计模式改成懒汉单例设计模式
         */
        for (int i = 0; i < 100; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    TaskManager ins = TaskManager.getInstance();
                    System.out.println(ins);
                }
            }).start();
        }

        /*Runtime rt = Runtime.getRuntime();
        rt.exec("md   D:\\test");*/
    }
}

