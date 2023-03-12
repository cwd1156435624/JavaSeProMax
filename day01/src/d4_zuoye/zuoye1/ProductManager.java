package d4_zuoye.zuoye1;

public class ProductManager extends Employee{
    private int bonus;

    public ProductManager() {
    }

    public ProductManager(int bonus) {
        this.bonus = bonus;
    }

    public ProductManager(String name, String num, int salary, int bonus) {
        super(name, num, salary);
        this.bonus = bonus;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    @Override
    public void work() {
        System.out.println("管理");
    }
}
