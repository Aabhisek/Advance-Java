package com.abhi.prep.java_advance;

public class ArrayDeleteElement {
    static int[] deletebyvalue(int arr[], int n){

        int index=-1; //means not present

        //find the index where the value is present
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]==n){
                index=i;
                break;
            }
        }
        if(index==-1){
            return arr;
        }

        int res[]=new int[arr.length-1];
        for(int i=0, j=0;i<arr.length;i++){

            //here we are checking and if we will find the index then we will skip it
            if(i==index){
                continue;
            }
            res[j++]=arr[i];
        }

        return res;
    }


    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6};

        arr=deletebyvalue(arr,4); //recursion call to the function

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
