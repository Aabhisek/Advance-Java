package com.abhi.prep.java_advance.Arrays;

import java.util.Arrays;

public class LeftRotateByOne {

    static int [] leftrotatebyone(int arr[]){
        int first=arr[0];

        for(int i=0;i<arr.length-1;i++){
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=first;

        return arr;
    }


    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(leftrotatebyone(arr)));

    }
}
