package d2_map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
目标：演示Map集合的常用方法
 */
public class Demo1 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        //public V put(K key, V value) 添加
        map.put("王二狗","傻逼");
        map.put("李翠花","小丑");
        map.put("吴刚","二比");
        map.put("刘瘤子","溜子");

        //public int size() 获取长度
        int size = map.size();
        System.out.println(size);

        //public void clear() 清空
        /*map.clear();
        System.out.println(map);*/

        //public boolean isEmpty() 判断是否为空
        boolean b = map.isEmpty();
        System.out.println(b);

        //public V get(Object obj) 获取值
        String s = map.get("刘瘤子");
        System.out.println(s);

        //public V remove(Object key) 删除
        String s1 = map.remove("吴刚");
        System.out.println(s1);

        //public boolean containsKey(Object key) 判断是否包含键
        boolean b1 = map.containsKey("王二狗");
        System.out.println(b1);

        //public Set<K> keySet() 获取键集合
        Set<String> strings = map.keySet();
        System.out.println(strings);

        //public Collection<V> values() 获取值集合
        Collection<String> values = map.values();
        System.out.println(values);
    }
}
