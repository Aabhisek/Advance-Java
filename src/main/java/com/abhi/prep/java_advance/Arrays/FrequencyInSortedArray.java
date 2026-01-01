package com.abhi.prep.java_advance.Arrays;

import java.awt.desktop.SystemEventListener;

public class FrequencyInSortedArray {

    static void frequency(int arr[]){
        int n=arr.length;
        int freq=1;
        for(int i=1;i<n;i++){
            if(arr[i]==arr[i-1]){
                freq++;
            }
            else{
                System.out.println(arr[i-1]+"->"+freq);
                freq=1;

            }
        }
        System.out.println(arr[n - 1] +"->"+ freq);
    }

    public static void main(String[] args) {
        int arr[]={1,1,3,5,6,7,7,};
        frequency(arr);
    }
}
