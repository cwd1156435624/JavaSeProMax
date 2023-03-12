package d4_zuoye.Demo3;

import java.util.TreeSet;

/*
- 需求 :  创建一个电脑类，有品牌、价格、颜色三个属性
- 创建5个电脑对象，往TreeSet集合中添加，并按照价格从高到低进行排序
 */
public class demo3 {
    public static void main(String[] args) {
        TreeSet<computer> set = new TreeSet<>();
        set.add(new computer("华为",9888,"灰色"));
        set.add(new computer("联想",8888,"黑色"));
        set.add(new computer("小米",7888,"白色色"));
        set.add(new computer("华硕",10999,"紫色"));
        set.add(new computer("苹果",8989,"绿色"));
        System.out.println(set);


    }
}
