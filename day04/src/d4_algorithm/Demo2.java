package d4_algorithm;

import java.util.Arrays;

/*
目标：演示折半查找（要求：数组是有顺序的，否则是不能做折半查找的）
二分查找的思路：
    1.确定开始索引和结束索引
        int start = 0;
        int end = arr.length-1;
    2.计算start和end中间索引的位置
        int mid = (start+end) / 2;
    3.每次拿到mid位置的元素和目标元素进行比较
        如果中间的元素比目标元素大：
            end = mid - 1;
        如果中间的元素比目标元素小：
            satrt = mid + 1;
        如果中间的元素和目标元素相等
            那就找打到了，mid就要找的索引
     把2.3步重复执行，可以使用while循环
 */
public class Demo2 {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70,80,90,100};
        int index = binarySearch(arr,40);
        System.out.println(index);

        //调用方法
        int i = Arrays.binarySearch(arr, 50);
        System.out.println(i);

    }

    public static int binarySearch(int[] arr,int key){
        //1.确定开始索引和结束索引
        int start = 0;
        int end = arr.length-1;
        while (start<=end) {
            // 2.计算start和end中间索引的位置
            int mid = (start + end) / 2;
            //3.每次拿到mid位置的元素和目标元素进行比较
            if (arr[mid] > key){
                end = mid - 1;
            } else if (arr[mid] < key) {
                start = mid + 1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}
