package com.abhi.prep.java_advance.Sorting;

public class selectionsort {

    static void selectionsort(int arr[]){
        for(int i=0;i<arr.length-1;i++){

            int minindex=i;

            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[minindex]){
                    minindex=j;
                }
            }

            int temp=arr[minindex];
            arr[minindex]=arr[i];
            arr[i]=temp;

        }
    }
    public static void main(String[] args) {

        int arr[]={5,1,4,2,8};
        selectionsort(arr);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }

    }
}
