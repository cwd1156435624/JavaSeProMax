package d4_polymorphic.demo1;

/*
目标：多态的表现形式
 */
public class Demo {
    public static void main(String[] args) {
        //可以用父类变量来接收子类对象
        Animal dog  = new Dog();
        dog.eat();

        //也可以用接口变量接收实现对象
        Animal cat = new Cat();
        cat.eat();
    }
}
