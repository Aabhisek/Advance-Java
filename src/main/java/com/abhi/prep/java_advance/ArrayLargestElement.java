package com.abhi.prep.java_advance;

public class ArrayLargestElement {

    static int largestelement(int arr[]){
        //consider first element as the largest element
        int res=arr[0];

        //iterate the array
        for (int i=1;i<arr.length;i++){

            //check if any other element is greater, if found then replace the result
            if(arr[i]>res){
                res=arr[i];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int []arr={6,2,3,4,5,7  };
        System.out.println(largestelement(arr));
    }
}
