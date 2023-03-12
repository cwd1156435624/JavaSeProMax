package d4_polymorphic.demo2;

/*
目标：多态的好处和弊端
 */
public class Demo {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Feeder.feed(dog);

        Animal cat = new Cat();
        Feeder.feed(cat);
    }
}
