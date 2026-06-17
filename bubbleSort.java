package Sorting;

import java.util.Arrays;

public class bubbleSort {
    static void main(String[] args) {
        int[] arr = {1, 23, 4, 6, 74, 835, 7, 7};

        for(int i = 0; i < arr.length; i++) {
            boolean switched = false;
            for(int j = 1; j < arr.length - i; j++){
                if(arr[j] < arr[j - 1]){
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                    switched = true;
                }
            }
            if(!switched){
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
