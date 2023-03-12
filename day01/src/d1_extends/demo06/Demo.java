package d1_extends.demo06;

//目标：了解继承关系中构造器的访问特点
public class Demo {
    public static void main(String[] args) {
        /**
         * 特点：
         *      调用子类的构造器，默认都会先访问父类的空参构造器
         *
         * 原理：
         *      子类构造器的第一行语句默认都是：super()，不写也存在
         *
         * 需求：
         *      1.现有Zi类继承了Fu类，分别调用子类空参构造和有参构造，观察子父类中构造的执行特点
         *      2.如果尝试删除Fu类空参构造，如何让代码不报错？
         */
        Zi z = new Zi();

        Zi z2 = new Zi("张三");
        System.out.println(z2.getName());
    }
}
