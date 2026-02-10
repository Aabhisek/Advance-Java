package com.abhi.prep.java_advance.PrifixSum;

import java.util.HashMap;
import java.util.Map;


public class LongesstSubarraySum {

    static int longestSubarray(int[] arr, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0, reslen=0;

        for(int i=0;i<arr.length;i++){
            sum+=arr[i];

            if(sum==k){
                reslen=i+1;
            } else if (map.containsKey(sum-k)) {
                reslen= Math.max(reslen,i-map.get(sum-k));
            } else if (!map.containsKey(sum)) {
                map.put(sum,i);

            }

        }
        return reslen;
    }

    public static void main(String[] args) {
        int[] arr = {10, 5, 2, 7, 1, -10};
        int k = 15;
        System.out.println(longestSubarray(arr, k));
    }
}
