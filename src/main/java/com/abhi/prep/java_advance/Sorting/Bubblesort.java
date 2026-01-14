package com.abhi.prep.java_advance.Sorting;

public class Bubblesort {

    static void bubblesort(int arr[]){
        boolean swapped;
        for(int i=0;i<arr.length-1;i++){
            swapped=false;
            for(int j=0;j<arr.length-1-i;j++){

                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped=true;
                }
                }
            if(swapped==false) break;

        }
    }

    public static void main(String[] args) {
        int arr[]={5,1,4,2,8};
        bubblesort(arr);
        for(int i=0;i<arr.length;i++) {
            System.out.println(arr[i]);

        }
    }
}
