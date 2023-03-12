package d1_stream;

import java.util.*;
import java.util.stream.Stream;

/*
目标：Stream流的获取方法
 */
public class Demo2 {
    public static void main(String[] args) {
        // 1、如何获取List集合的Stream流？
        List<String> list = new ArrayList<>();
        Collections.addAll(list, "张三丰","张无忌","周芷若","赵敏","张强");
        list.stream().forEach(s -> System.out.println(s));


        System.out.println("--------------");
        // 2、如何获取Set集合的Stream流？
        Set<String> set = new HashSet<>();
        Collections.addAll(set, "刘德华","张曼玉","蜘蛛精","马德","德玛西亚");
        set.stream().forEach(s -> System.out.println(s));


        System.out.println("--------------");
        // 3、如何获取Map集合的Stream流？
        Map<String, Double> map = new HashMap<>();
        map.put("古力娜扎", 172.3);
        map.put("迪丽热巴", 168.3);
        map.put("马尔扎哈", 166.3);
        map.put("卡尔扎巴", 168.3);
        //先获取键的集合，再获取键的流
        map.keySet().stream().forEach(s -> System.out.println(s));
        System.out.println("--------------");

        //先获取值的集合，再获取值的流
        map.values().stream().forEach(s -> System.out.println(s));
        System.out.println("--------------");

        //先获取键的集合，再获取键的流
        map.entrySet().stream().forEach(entry -> System.out.println(entry.getKey() + "," +entry.getValue()));
        System.out.println("--------------");



        // 4、如何获取数组的Stream流？
        String[] arr = {"张翠山", "东方不败", "唐大山", "独孤求败"};
        //用Arrays提供的stream流
        Arrays.stream(arr).forEach(s -> System.out.println(s));
        System.out.println("--------------");
        //用of
        Stream.of(arr).forEach(s -> System.out.println(s));

    }
}
