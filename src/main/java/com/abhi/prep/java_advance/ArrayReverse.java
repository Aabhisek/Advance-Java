package com.abhi.prep.java_advance;

import java.util.Arrays;

public class ArrayReverse {
    static int[] reversearray(int arr[]){
        int first=0;
        int last=arr.length-1;

        while(first<last){
            int temp=arr[first];
            arr[first]=arr[last];
            arr[last]=temp;
            first++;
            last--;
        }
        return arr;
    }

    public static void main(String[] args) {
        int []arr={6,8,9,4,5,7};
        System.out.println(Arrays.toString(reversearray(arr)));
    }
}
