package Sorting;

import java.util.ArrayList;
import java.util.List;

class Solution {
    static void main(String[] args) {
        // this is a leetcode problem
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(nums));
    }
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0; 
        while(i < nums.length){

            if(nums[i] != i + 1){
                swap(nums, i , nums[i] - 1);
            }
            else{
                i++;
            }
        }
        ArrayList<Integer> res = new ArrayList<>();
        for(int j = 0; j < nums.length; j++){
            if(nums[j] != j + 1)
                res.add(j + 1);
        }
        return res;
    }
    public static void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}