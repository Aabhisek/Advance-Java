package com.abhi.prep.java_advance;

public class ArraySortedCheck {

    static boolean check4sortedarray(int arr[]){
        for(int i=0;i<arr.length;i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int []arr={6,8,9,4,5,7};
        System.out.println(check4sortedarray(arr));
    }
}
