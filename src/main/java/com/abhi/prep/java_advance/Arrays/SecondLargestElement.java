package com.abhi.prep.java_advance.Arrays;

public class SecondLargestElement {

    static int secondlargestelement(int arr[]){
        //consider first element as the largest element

        int largest,secondlarget;

        if(arr[0]>arr[1]) {
             largest = arr[0];
             secondlarget = arr[1];
        }
        else {
            largest=arr[1];
            secondlarget=arr[0];
        }

        //iterate the array
        for (int i=2;i<arr.length;i++){

            //check if any other element is greater, if found then replace the result
            if(arr[i]>largest){
                secondlarget=largest;
                largest=arr[i];
            }
            else if (arr[i]>secondlarget && arr[i]!=largest) {
                secondlarget=arr[i];

            }
        }
        return secondlarget;
    }

    public static void main(String[] args) {
        int []arr={6,2,3,4,5,7};
        System.out.println(secondlargestelement(arr));
    }
}
