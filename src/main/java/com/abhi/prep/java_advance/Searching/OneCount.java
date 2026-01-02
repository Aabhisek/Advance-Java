package com.abhi.prep.java_advance.Searching;

public class OneCount {

    static int findonecount(int arr[]){

        int start=0;
        int n=arr.length;
        int end=n-1;
        int firstindexof1=-1;

        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==1){
                firstindexof1=mid;
                end=mid-1; //once we get the 1's first index, we close the loop.
            }
            else if(arr[mid]<1){
                start=mid+1;

            }
        }


        return n-firstindexof1;
    }
    public static void main(String[] args) {
        System.out.println(findonecount(new int[]{0,0,0,1,1}));
    }
}
