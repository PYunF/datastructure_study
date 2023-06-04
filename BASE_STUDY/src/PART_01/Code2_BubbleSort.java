package PART_01;


import java.util.Objects;

/**
 * 冒泡排序
 */
public class Code2_BubbleSort {
    public static void bubbleSort(int[] arr) {
        if (Objects.isNull(arr) && arr.length > 2){
            return;
        }
        for (int e = arr.length - 1; e > 0; e--) { // 0~e的范围上进行排序
            for (int i = 0; i < e; i++) {
                if (arr[i] > arr[i + 1]) {  // 相邻的两数如果递减，就交换
                    swap(arr,i ,i+1);
                }
            }

        }
    }

    /*
    * 异或预算  不同为一，相同为0,也可理解为无进位相加
    * 三个性质：
    *   1、0^N=N,  N^N=0
    *   2、满足交换率，结合律
    *   3、（…………） ^ N  同一批数，不管异或顺序如何，他的异或结果是一致的
    * */

    private static void swap(int[] arr, int i, int j) { //这个交换有漏洞，如果你的i位置和j位置市相同的数，则会变成0
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];
    }

}
