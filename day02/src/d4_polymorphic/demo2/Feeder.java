package d4_polymorphic.demo2;

public class Feeder {
    public static void feed(Animal a){
        a.eat();

        if (a instanceof Dog){
            //Dog dog = (dog) a;
            //dog.kanmeng();
            ((Dog) a).kanmeng();
        }
        if (a instanceof Cat){
            Cat cat = (Cat) a;
            cat.zhuals();
        }
    }
}
