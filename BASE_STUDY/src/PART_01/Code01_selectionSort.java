package PART_01;

import java.util.Arrays;
import java.util.Objects;

/**
 * @description 选择排序
 */
public class Code01_selectionSort {
    public static void selectionSort(int[] arr){
        if (Objects.isNull(arr) && arr.length < 2){
            return;
        }
        for (int i = 0; i < arr.length - 1; i++) {    // i ~ 的范围内
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {     //i 的值和  i+1 部分的对比，找出最小的小标与i交换
                minIndex = arr[j] < arr[minIndex] ? j : minIndex;
            }
            swap(arr,i,minIndex);
        }

    }

    private static void swap(int[] arr, int i, int minIndex) {
        int temp = arr[i];
        arr[i] = minIndex;
        minIndex = temp;
    }


    //测试
    public static void comparatot(int[] arr){
        Arrays.sort(arr);
    }
}
