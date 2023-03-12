package d1_tool;

/**
 * @author cwd
 * @version 1.0
 */
public class ArrayTool {
    /**
     * 获取元素的最大值
     * @param arr
     * @return
     */
    public static int getMax(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }

    /**
     * 获取数组的和
     * @param arr
     * @return
     */
    public static int getSum(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        return sum;
    }
}
