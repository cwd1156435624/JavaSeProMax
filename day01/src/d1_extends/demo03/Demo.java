package d1_extends.demo03;

//目标：了解实现继承关系时的注意事项
public class Demo {
    public static void main(String[] args) {
        /**
         * 注意事项：
         *      Java只能单继承，不能多继承，但可以多层继承
         *      Java中任何一个类都直接或者间接的继承自Object类
         *
         * 需求：使用多层继承，让Son类既能继承Father的drink()功能，也能继承GrandFather的smoke()功能
         */
        Son s = new Son();
        s.Study();
        s.drink();
        s.smoke();
    }
}
