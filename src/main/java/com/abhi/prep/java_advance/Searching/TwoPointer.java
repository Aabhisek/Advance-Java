package com.abhi.prep.java_advance.Searching;

public class TwoPointer {
    static boolean findmaxelement(int[] arr, int x) {
        /*
        //naive approach
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==x){
                    return true;
                }
            }
        }
        return false;
         */

        //this works only for sorted array
        int i=0; int j=arr.length-1;
        while(i<j){
            if(arr[i]+arr[j]==x){
                return true;
            } else if (arr[i]+arr[j]<x) {
                i++;
            }
            else{
                j--;
            }

            }

            return false;
    }

    public static void main(String[] args) {
        int arr[]= {2,5,8,12,30};
        int x=17;
        System.out.println(findmaxelement(arr,x));

    }
}
