package com.abhi.prep.java_advance.twoPointer;

import java.util.Arrays;

public class SortColors {
    static int[] sortColors(int[] nums) {
        int i=0,j=0,k= nums.length-1;

        while (j<=k){
            if(nums[j]==2){
                int temp=nums[k];
                nums[k]=nums[j];
                nums[j]=temp;
                k--;
            }
            else if(nums[j]==1){
                j++;
            }
            else{
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
                j++;
            }
        }

        return nums;
    }

    public static void main(String[] args) {
        int [] arr={2,0,2,1,1,0};
        System.out.println(Arrays.toString(sortColors(arr)));

        }
}
