package d4_zuoye;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
需求 :  利用键盘录入，输入一个字符串,统计该字符串中各个字符的数量

- 如用户输入字符串:"helloworldjava",程序输出结果：
- h-1 e-1 l-3 o-2 w-1 r-1 d-1 j-1 a-2 v-1   （顺序不做要求）
 */
public class demo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串:");
        String s = sc.next();

        //定义一个map集合，键用来表示字母，值用来表示次数
        Map<Character,Integer> map = new HashMap<>();
        //遍历字符串
        for (int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            //判断是否包含键
            if (map.containsKey(ch)){
                Integer count = map.get(ch);
                map.put(ch,count+1);
            }else {
                map.put(ch,1);
            }
        }
        //遍历集合
        map.forEach((character, integer) -> System.out.println(character + "-" + integer));

    }
}
