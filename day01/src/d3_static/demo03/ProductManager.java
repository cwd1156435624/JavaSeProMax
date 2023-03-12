package d3_static.demo03;

public class ProductManager extends Employee{
    public ProductManager() {
    }

    public ProductManager(String name, int age, String dept) {
        super(name, age, dept);
    }

    @Override
    public void work() {
        System.out.println("产品经理的职责是设计产品原型");
    }
}
