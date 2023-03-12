package d4_zuoye.zuoye1;

public class Demo {
    public static void main(String[] args) {
        Programmer pr = new Programmer("王二狗","itheima001",10000);
        System.out.println("名字是：" + pr.getName());
        System.out.println("工号是：" + pr.getNum());
        System.out.println("工资是：" + pr.getSalary());
        pr.work();
        System.out.println("--------------");
        ProductManager pm = new ProductManager("李翠花","itheima002",12000,3000);
        System.out.println("名字是：" + pm.getName());
        System.out.println("工号是：" + pm.getNum());
        System.out.println("工资是：" + pm.getSalary());
        System.out.println("奖金是：" + pm.getBonus());
        pm.work();
    }
}
