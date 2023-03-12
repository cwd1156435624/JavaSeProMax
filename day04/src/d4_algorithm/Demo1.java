package d4_algorithm;

import java.util.Arrays;

/*
目标：演示冒泡排序的算法
排序的规律：
    1.每一轮都是从0索引开始，把两个相邻的元素进行比较
    2.每一轮比较的次数，比上一轮少一次
    3.比较的轮数 = 长度-1
 */
public class Demo1 {
    public static void main(String[] args) {
        int[] arr = {5,3,1,4,2};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

