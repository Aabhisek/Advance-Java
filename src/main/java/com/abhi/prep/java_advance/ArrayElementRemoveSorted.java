package com.abhi.prep.java_advance;

import java.util.Arrays;

public class ArrayElementRemoveSorted {

    static int removeelement(int arr[], int n){

        int i=0;
        //find the element
        while(i<arr.length && arr[i]!=n){
            i++;
        }

        if(i==arr.length){
            return arr.length;
        }

        for(int j=i;i<arr.length-1;j++){
            arr[j]=arr[j+1];
        }

        return arr.length-1;
    }


    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6};
        int newlength=removeelement(arr,6);
        // print only valid elements
        System.out.println(Arrays.toString(Arrays.copyOf(arr, newlength)));
    }
}
