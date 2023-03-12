package d2_map;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

/*
目标：演示Map集合的遍历方式三
        forEach(lambda表达式)
 */
public class Demo4 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("王二狗","傻逼");
        map.put("李翠花","小丑");
        map.put("吴刚","二比");
        map.put("刘瘤子","溜子");

        //标准
        map.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String s, String s2) {
                System.out.println(s + "..." + s2);
            }
        });

        //简化
        map.forEach(( s, s2) -> {
                System.out.println(s + "..." + s2);
        });
    }
}
