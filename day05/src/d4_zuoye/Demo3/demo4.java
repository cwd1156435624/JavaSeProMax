package d4_zuoye.Demo3;

import java.util.HashSet;

/*
需求:往HashSet集合中添加，上题中的5个电脑对象，要求品牌、价格、颜色相同，
    就认为是同一个对象，同一个对象指允许存在一个。
 */
public class demo4 {
    public static void main(String[] args) {
        HashSet<computer> set = new HashSet<>();
        set.add(new computer("华为",9888,"灰色"));
        set.add(new computer("华为",9888,"灰色"));
        set.add(new computer("小米",7888,"白色"));
        set.add(new computer("华硕",10999,"紫色"));
        set.add(new computer("苹果",8989,"绿色"));
        System.out.println(set);
    }
}
