package com.abhi.prep.java_advance.Searching;

public class OccurenceCounts {

    static int occurencecounts(int arr[], int n){

        int start=0;
        int end= arr.length-1;
        int count = 0;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(n<arr[mid]){ //move left
                end=mid-1;
            } else if (n>arr[mid]) { // move right
                start=mid+1;
            }
            else{
                if(mid==0 || arr[mid-1] !=arr[mid]){
                    return mid-1;
                }
                else {
                    return mid;
                }
            }
        }

        return 1;
    }

    public static void main(String[] args) {
        int arr[]={5,10,10,20,20};
        System.out.println(occurencecounts(arr,10));
    }
}
