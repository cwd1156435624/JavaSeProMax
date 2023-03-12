package d2_map;

import java.util.*;
import java.util.function.BiConsumer;

public class Test {
    public static void main(String[] args) {
        //把产生的景点用集合装起来
        List<String> list = new ArrayList<>();

        //循环80次
        for (int i = 0; i < 80; i++) {
            //从4个景点中任选一个
            String[] arr = {"A","B","C","D"};
            Random r = new Random();
            int index = r.nextInt(arr.length);
            list.add(arr[index]);
        }
        //统计集合中每一个元素出现了多少次
        //先创建一个Map集合，键用来统计景点，值用来统计次数
        Map<String,Integer> map = new HashMap<>();
        //遍历List集合，取出里面的元素
        for (String s : list) {
            //如果键值存在，那么就把值加一再存回去
            if (map.containsKey(s)){
                Integer value = map.get(s);
                map.put(s,value+1);
            }else {
                //如果不存在，那么值就等于1
                map.put(s,1);
            }
        }
        //遍历map集合，打印输出景点的选择次数
        map.forEach((s,integer) -> System.out.println("景点" + s + "被选择了" + integer + "次"));
    }
}
