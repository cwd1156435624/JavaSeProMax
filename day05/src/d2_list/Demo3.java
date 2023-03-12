package d2_list;

import java.util.LinkedList;

/*
目标：ArrayList集合、LinkedList集合的底层原理（这里所说的原理，都是底层代码写好的，不需要我们自己写代码）
    1. ArrayList集合的底层原理：
        当创建一个ArrayList集合，并添加第一个元素时，底层会创建一个长度为10的数组
        往集合中添加元素时，实际上是往底层数组中添加元素
        当数组中的初始10个元素存满了，会创建一个新数组是原来数组的1.5倍，将原数组中的元素复制到新数组中去，并将新数组作为ArrayList的容器
        再添加元素时，就往新数组中添加，直到把数组存满，再重复前面的步骤对数组进行扩容

        特点：由于ArrayList集合是数组实现，每次添加、删除元素时会涉及到数组的扩容，和元素的复制增删速度相对较慢

    2.LinkedList集合的底层原理：
        LinkedList集合是双向链表结构实现的，每一个元素就是链表中的一个节点，
        每一个节点包含三个部分，元素值、上一个节点地址、下一个节点地址
        当往LinkedList集合中添加元素时，实际上是往链表的尾结点位置添加一个新节点

        特点：由于LinkedList底层是链表结构，每次查询元素时要么从头往尾查，要么从尾往头查，所以查询较慢；
            增、删元素时，只需要重新设定节点地址就行，所以相对较快
 */
public class Demo3 {
    public static void main(String[] args) {
        //需求1：使用LinkedList集合模拟队列结构进队列、出队列
        LinkedList<String> linkedList = new LinkedList<>();
        //进队列：往链表尾部添加元素
        linkedList.addLast("王二狗");
        linkedList.addLast("李翠花");
        linkedList.addLast("吴刚");
        linkedList.addLast("刘瘤子");

        //出队列：从链表头部删除元素
        linkedList.removeFirst();
        linkedList.removeFirst();
        System.out.println(linkedList);
        System.out.println("------------");


        //需求2：使用LinkedList集合模拟栈结构压栈、弹栈
        LinkedList<String> linkedList1 = new LinkedList<>();
        //压栈：往链表头部添加元素
        linkedList1.push("王二狗");
        linkedList1.push("李翠花");
        linkedList1.push("吴刚");
        linkedList1.push("刘瘤子");

        //弹栈：从链表的头部删除元素
        linkedList1.pop();
        linkedList1.pop();
        System.out.println(linkedList1);
    }
}
