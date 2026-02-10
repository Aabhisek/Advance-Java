package com.abhi.prep.java_advance.slidingWindow;

public class SumOfMaxMin {

    static int SumOfKsubArray(int[] arr, int k) {
    int min=arr[0];
    int max=arr[0];
    int subarraysum=0;
    for(int i=1;i<k;i++){
        min=Math.min(min,arr[i]);
        max=Math.max(max,arr[i]);
        subarraysum+=arr[i];
    }

    int sum=min+max;

    for(int i=k;i<arr.length;i++){
        min=arr[i];
        max=arr[i];
        subarraysum=subarraysum+arr[i]-arr[i-k];
         max=Math.max(max,arr[i]);
         min=Math.min(min,arr[i]);
    }

    return 1;//maxsum+minsum;
    }
        public static void main(String[] args) {
        int[] arr = {2, 5, -1, 7, -3, -1, -2};
        int k=4;
            System.out.println(SumOfKsubArray(arr,k));
    }
}
