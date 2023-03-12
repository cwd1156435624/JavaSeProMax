package zuoye;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Demo2 {
    public static void main(String[] args) {
        ArrayList<Product> list1 = new ArrayList<>();
        list1.add(new Product("飞机",99999,2));
        list1.add(new Product("坦克",99998,3));
        ArrayList<Product> list2 = new ArrayList<>();
        list2.add(new Product("袜子",20,2));
        list2.add(new Product("鞋子",499,1));
        list2.add(new Product("裤子",99,3));
        Map<String,ArrayList<Product>> map = new HashMap<>();
        map.put("001",list1);
        map.put("002",list2);
        map.forEach((key, value) -> {
            System.out.println(key);
            value.forEach(values -> System.out.println("\t"+values));
        });
    }
}
