package d5_zuoye.demo3;

public class Demo {
    public static void main(String[] args) {
        Animal a1 = new Dog();
        Feeder.eat(a1);

        Animal a2 = new Cat();
        Feeder.eat(a2);
    }
}
