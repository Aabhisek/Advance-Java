package com.abhi.prep.java_advance.twoPointer;

import java.util.Arrays;

public class SortColors {
    static int[] sortColors(int[] nums) {
        int c0=0;
        int c1=0;
        int c2=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                c0++;
            }
            else if(nums[i]==1){
                c1++;
            }
            else{

                c2++;
            }
        }
        int index = 0;

        while(c0 > 0){
            nums[index++] = 0;
            c0--;
        }

        while(c1 > 0){
            nums[index++] = 1;
            c1--;
        }

        while(c2 > 0){
            nums[index++] = 2;
            c2--;
        }
        return nums;
    }

    public static void main(String[] args) {
        int [] arr={2,0,2,1,1,0};
        System.out.println(Arrays.toString(sortColors(arr)));

        }
}
