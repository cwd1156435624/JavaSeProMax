package d4_zuoye.zuoye3;

public class Demo {
    public static void main(String[] args) {
        Phone p = new Phone();
        p.setBrand("华为");
        p.setPrice(8999);
        System.out.print("品牌为"+p.getBrand()+"价格为"+p.getPrice()+"尺寸为"+p.size+"可以");
        p.call();
        p.sendMessage();
        p.playGame();
    }
}
