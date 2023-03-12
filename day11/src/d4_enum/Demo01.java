package d4_enum;

//目标：掌握枚举类的定义
public class Demo01 {
    public static void main(String[] args) {
        /**
         * 格式：
         *      修饰符 enum 枚举类名{
         *          枚举类实例对象名;
         *      }
         *
         * 特征：
         *     枚举类内部第一行都用来罗列枚举对象的名称，多个之间用逗号隔开，最后用分号结束
         *     枚举类都是继承了枚举类型：java.lang.Enum
         *     枚举都是最终类，不可以被继承
         *     构造器都是私有的，枚举对外不能创建对象
         *     枚举类相当于是多例模式
         *
         * 需求：使用枚举类定义描述季节的类Season，并打印枚举的值
         */

        Season spring = Season.SPRING;
        System.out.println(spring);

        Season summer = Season.SUMMER;
        System.out.println(summer);

        Season autumn = Season.AUTUMN;
        System.out.println(autumn);

        Season winter = Season.WINTER;
        System.out.println(winter);

        System.out.println("-------------");
        Season[] values = Season.values();
        for (Season value : values) {
            System.out.println(value);
        }

        System.out.println("-------------");
        Season spring1 = Season.valueOf("SPRING");
        System.out.println(spring1);
    }
}

