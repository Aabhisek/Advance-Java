package com.abhi.prep.java_advance.Arrays;

public class MaxConsicutiveElements {
    static int maxconsicutive(int arr[]){
        int currentcount=1;
        int maxcount=1;

        for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[i-1]){
                currentcount++;
            }else{
                currentcount=1;
            }
            maxcount=Math.max(maxcount,currentcount);
        }

        return maxcount;
    }

    public static void main(String[] args) {
        int arr[]={0,1,1,0,1,0};
        System.out.println(maxconsicutive(arr));
    }
}
