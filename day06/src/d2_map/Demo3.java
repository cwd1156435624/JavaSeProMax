package d2_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
目标：演示Map集合的遍历方式二
        用Entry方法,将键和值一起打印:Set<Map.Entry<K, V>> entrySet()
 */
public class Demo3 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("王二狗","傻逼");
        map.put("李翠花","小丑");
        map.put("吴刚","二比");
        map.put("刘瘤子","溜子");
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "..." + value);
        }
    }
}
