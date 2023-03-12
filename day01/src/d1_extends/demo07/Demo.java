package d1_extends.demo07;

//目标：了解使用this和super访问构造的方式
public class Demo {
    public static void main(String[] args) {
        /**
         * super(参数)：访问父类构造
         * this(参数)：访问本类构造
         *
         * 注意：super()和this()都只能放在构造方法的第一句，所以二者不能共存
         *
         * 需求：
         *      Student类继承了Person类，父类Person中有属性：name、age。子类有属性：school。
         *      给Student增加一个构造方法，使其能在创建Student时，同时给name、age和school三个属性赋值
         */
        Student s = new Student("王二狗",18,"黑马程序员");
        System.out.println(s.getName());
        System.out.println(s.getAge());
        System.out.println(s.getSchool());
    }
}
