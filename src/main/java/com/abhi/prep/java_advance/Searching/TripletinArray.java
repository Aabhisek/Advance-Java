package com.abhi.prep.java_advance.Searching;

public class TripletinArray {

    static boolean findtriplet(int arr[],int x){


        //naive approach
        for(int i=0;i<arr.length-2;i++){
            for(int j=i+1;j<arr.length-1;j++){
                for(int k=j+1;k<arr.length;k++){
                    if(arr[i]+arr[j]+arr[k]==x){
                        return true;
                    }
                }
            }
        }
        return false;







    }

    public static void main(String[] args) {
        int arr[]={1,2,5,6};
        int x=14;
        System.out.println(findtriplet(arr,x));
    }
}
