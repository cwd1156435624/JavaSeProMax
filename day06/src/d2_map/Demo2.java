package d2_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
目标：演示Map集合的遍历方式一
    获取所有的键，再遍历所有的值
 */
public class Demo2 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("王二狗","傻逼");
        map.put("李翠花","小丑");
        map.put("吴刚","二比");
        map.put("刘瘤子","溜子");
        Set<String> keys = map.keySet();
        for (String key : keys) {
            String s = map.get(key);
            System.out.println(key+"..."+s);
        }
    }
}
