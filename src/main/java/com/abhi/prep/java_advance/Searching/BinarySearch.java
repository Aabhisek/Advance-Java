package com.abhi.prep.java_advance.Searching;

public class BinarySearch {

    static int binarysearch(int arr[],int n){

        int start=0;
        int last= arr.length-1;

        while(start<=last){
            int mid=start+(last-start) / 2; //avoid overflow

            if(n==arr[mid]){
                return mid;
            } else if (n<arr[mid]) { //move left
                last=mid-1;
            }else{
                start=mid+1;  //move right
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={10,10};
        System.out.println(binarysearch(arr,10));
    }
}
