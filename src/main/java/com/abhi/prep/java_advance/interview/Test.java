package com.abhi.prep.java_advance.interview;


import java.util.*;

public class Test {
    static int maxSubarraySum(int[] arr, int k) {
        // Code here
        int sum=0;
        int maxsum=0;
        for(int j=0;j<k;j++) {
                sum+=arr[j];
            }
            maxsum=sum;
        for(int i=k;i<arr.length;i++){
            sum+=arr[i]-arr[i-k];
             maxsum=Math.max(maxsum,sum);`
        }


        return maxsum;

    }


    public static void main(String[] args) {
        //String s="success";
        //String t="silent";
        int[] arr={100 ,200, 300, 400};
        System.out.println(maxSubarraySum(arr,2));

    }
}
