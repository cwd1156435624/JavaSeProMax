package d1_extends.demo05;

//目标：了解方法重写的作用和要求
public class Demo {
    public static void main(String[] args) {
        /**
         * 方法重写：子类中有和父类一模一样的方法声明
         *
         * 作用：当父类的方法不能满足子类的要求时，子类就可以重写父类的方法
         *
         * 要求：
         *      重写方法的名称、形参列表必须和父类相同。
         *      私有方法不能被重写。
         *      子类重写父类方法时，访问权限必须大于或者等于父类（暂时了解 ：private < 缺省 < protected < public）
         *      在子类重写的方法上使用@Override注解，可以检测重写是否正确
         *
         * 需求：
         *      现有旧手机类Phone，有打电话和发短信的功能，但是只能语音通话和发送文字；
         *      新手机也需要有打电话和发短信功能，但是打电话功能除了语音通话之外还有视频通话的能力。
         *      新手机发短信功能除了可以发送文字，也可以发送图片。
         *      利用方法重写，完成新手机类NewPhone的设计，并且使用@Override检测
         */
        NewPhone p = new NewPhone();
        p.call();
        p.sendMsg();
        System.out.println("---------------");

        /*
        演示方法重写的应用场景：
        打印语句底层会自动生成Object的toString语句，返回的是对象的地址值
        如果不想打印地址值，可以在自己的类中重写toString方法，让它返回属性值.
         */
        //重写toString方法
        Student s = new Student("王二狗",18);
        System.out.println(s);
    }
}
