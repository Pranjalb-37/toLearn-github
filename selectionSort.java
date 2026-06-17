package Sorting;

import java.util.Arrays;

public class selectionSort {
    static void main(String[] args) {
        int[] arr = {23, 54, 657, 84, 1, 8, 8, 35, 2};

        for(int i = arr.length - 1; i > 0; i--){
            int max = maximum(arr, i);
            switchNums(arr, max, i);
        }
        System.out.println(Arrays.toString(arr));
    }
    static int maximum (int[] arr, int end){
        int max = 0;
        for(int i = 1; i <= end; i++){
            if(arr[max] < arr[i]) max = i;
        }
        return max;
    }
    static void switchNums(int[] arr, int maxIdx, int i ){
        int temp = arr[maxIdx];
        arr[maxIdx] = arr[i];
        arr[i] = temp;
    }
}
