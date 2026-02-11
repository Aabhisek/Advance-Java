package com.abhi.prep.java_advance.twoPointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CountPairs {

    static int countPairs(List<Integer> nums, int target) {
        int count=0;
        Collections.sort(nums);
        int i=0;
        int j=nums.size()-1;

        while(i<j){

            if(nums.get(i)+nums.get(j)<target){
                count=count+(j-i);
                i++;
            }
            else{
                j--;
            }

        }

        /*for(int i=0;i<nums.size();i++){
            for(int j=1;j<nums.size();j++){
                if(nums.get(i)+nums.get(j)<target){
                    count++;
                }
            }
        }

         */
        return count;
    }

    public static void main(String[] args) {
        List<Integer> nums=new ArrayList<>();
        nums.add(-1);
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(1);
        System.out.println(countPairs(nums,2));
    }
}
