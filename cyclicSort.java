package Sorting;

import java.util.Arrays;

public class cyclicSort {
    static void main(String[] args) {

        int[] nums = {6, 5, 4, 3, 2, 1  };

        for(int i = 0; i < nums.length; i++){
            if(nums[i] != i + 1){
                swap(nums, i);
                i--;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
    static void swap(int[] nums, int i){
        int temp = nums[i];
        nums[i] = nums[nums[i] - 1];
        nums[temp - 1] = temp;
    }
}
