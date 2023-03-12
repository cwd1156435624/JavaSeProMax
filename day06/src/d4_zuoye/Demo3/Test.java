package d4_zuoye.Demo3;

import java.util.ArrayList;
import java.util.HashMap;

public class Test {
    public static void main(String[] args) {
        //1.创建一个ArrayList集合存储2个商品对象
        ArrayList<Product> list1 = new ArrayList<>();
        list1.add(new Product("鸡蛋",30,15));
        list1.add(new Product("鹅蛋",30,10));


        //2.创建另一个ArrayList集合存储3个商品对象
        ArrayList<Product> list2 = new ArrayList<>();
        list2.add(new Product("小汽车",20,1));
        list2.add(new Product("手机",5999,2));
        list2.add(new Product("挖掘机",100000,1));


        //3.创建一个HashMap集合，用于存储每一个订单对应的商品
        //键：订单号（字符串类型）
        //值：该订单的多个商品，List类型
        HashMap<String, ArrayList<Product>> map = new HashMap<>();
        map.put("000001",list1);
        map.put("000002",list2);

        //4.遍历Map集合，打印每一个订单号，和每一件商品对象的信息
        map.forEach((key, value) -> {
            System.out.println(key);
            value.forEach(product -> System.out.println("\t" + product));
        });
    }
}
