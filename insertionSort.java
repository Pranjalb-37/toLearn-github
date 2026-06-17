package Sorting;

import java.util.Arrays;

public class insertionSort {
    static void main(String[] args) {
        int[] nums = {3, 65, -4, 73, 32, -1, 0};

        for(int i = 0; i < nums.length - 1; i++){
            for(int j = i + 1; j > 0; j--){
                if(nums[j] < nums[j - 1]) {
                    swap(nums, j , j - 1);
                }
                else
                    break;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
    static void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
