package com.abhi.prep.java_advance.Searching;

public class PeakElements {

    static int findPeakElement(int[] arr) {

        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < arr[mid + 1]) {
                start=mid+1;
            }
            else{
                end=mid;

            }
        }
        return arr[start];
    }

        /*
        //if single element in array
        if (arr.length==1) return arr[0];

        //check if the first element is bigger than second
        if(arr[0]>=arr[1]) return arr[0];


        //middle element checks
        for(int i = 1; i < arr.length - 1; i++){
            if(arr[i]>= arr[i-1] && arr[i] >= arr[i+1]){
                return arr[i];
            }
        }
        //last element check
        return arr[arr.length-1];

         */



    public static void main(String[] args) {

        System.out.println(findPeakElement(new int[]{5,10,4,15,7}));
    }
}
