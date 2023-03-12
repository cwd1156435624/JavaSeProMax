package d2_map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/*
目标：集合嵌套案例
需求：在程序中记住如下省份和其对应的城市信息，记录成功后，要求可以查询出湖北省的城市信息。
    江苏省 = 南京市，扬州市，苏州市，无锡市，常州市
    湖北省 = 武汉市，孝感市，十堰市，宜昌市，鄂州市
    河北省 = 石家庄市，唐山市，邢台市，保定市，张家口市
 */
public class Demo8 {
    public static void main(String[] args) {
        //键是省份，值是集合，用来表示城市
        Map<String, ArrayList<String>> map = new HashMap<>();
        //江苏省
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("南京市");
        list1.add("扬州市");
        list1.add("苏州市");
        list1.add("无锡市");
        list1.add("常州市");
        map.put("江苏省",list1);

        //湖北省
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("武汉市");
        list2.add("孝感市");
        list2.add("十堰市");
        list2.add("宜昌市");
        list2.add("鄂州市");
        map.put("湖北省",list2);

        //河北省
        ArrayList<String> list3 = new ArrayList<>();
        list3.add("石家庄市");
        list3.add("唐山市");
        list3.add("邢台市");
        list3.add("保定市");
        list3.add("张家口市");
        map.put("河北省",list3);

        map.forEach((key, value) -> {
            if (key.equals("湖北省")) {
                System.out.println(key);
                value.forEach(s -> System.out.println("\t"+s));
            }
        });

    }
}
