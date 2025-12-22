package com.abhi.prep.java_advance.Arrays;

import java.util.Arrays;

public class FindLeaders {

    static int[] findleaders(int arr[]){

        int n=arr.length;
        int temp[]=new int[n]; //new array to store leaders
        int count=0; //counts the number of leader elements
        int maxfromright=arr[n-1]; //right most element is always a leader
        temp[count++]=maxfromright;

        for(int i=n-2;i>=0;i--){
            if(arr[i]>maxfromright){
                maxfromright=arr[i];
                temp[count++]=maxfromright;
            }
        }

        int res[]=new int[count];
        for(int i=0;i<count;i++){
            res[i]=temp[count-1-i];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {19,2,3,4,5};
        System.out.print(Arrays.toString(findleaders(arr)));

    }
}
