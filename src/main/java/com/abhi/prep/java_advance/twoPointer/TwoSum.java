

/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add
up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.

Example 1:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 */


package com.abhi.prep.java_advance.twoPointer;

import java.util.Arrays;

public class TwoSum {

    static int[] twosum(int [] nums,int target){
        int[] res=new int[2];
        for(int i=0;i<nums.length-1;i++){
            for(int j=1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    res[0]=i;
                    res[1]=j;
                }
            }
        }



        return res;
    }

    public static void main(String[] args) {
        int [] nums={3,3};
        int target=6;
        System.out.println(Arrays.toString(twosum(nums,target)));
    }

}
