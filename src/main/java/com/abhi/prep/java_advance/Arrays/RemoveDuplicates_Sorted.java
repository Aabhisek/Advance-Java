package com.abhi.prep.java_advance.Arrays;

import java.util.Arrays;

public class RemoveDuplicates_Sorted {

    static int removeduplicates(int[] arr){

        if(arr.length==0) return 0;

        int j = 1; // index for next unique element

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                arr[j++] = arr[i];
            }
        }

        return j;
    }

    public static void main(String[] args) {
        int arr[]={1,2,2,5,6,7,8,8,9};
        int newlength=removeduplicates(arr);
        System.out.println(Arrays.toString(Arrays.copyOf(arr,newlength)));

    }
}
