package d1_extends.demo04;

//目标：了解继承关系中成员的访问特点
public class Demo {
    public static void main(String[] args) {
        /**
         * 需求：
         *      现有Zi类和Fu类，已经实现了继承关系
         *      在子类中的print方法中分别访问name、age和nationality属性
         *      创建子类对象，访问drive()方法
         */
        Zi z = new Zi();
        z.print();

        z.drive();
    }
}
