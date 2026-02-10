package com.abhi.prep.java_advance.twoPointer;

public class RemoveAllOccurences {

    static int removeoccurences(int[] arr, int ele){
        int count=0;
        int i=0;
        int j=arr.length-1;

        while(i<j){
            if(arr[i]!=ele){
                count++;
                i++;
            }
            if(arr[j]!=ele){
                count++;
                j--;
            }
            if(arr[i]==ele){
                i++;
            }
            else if(arr[j]==ele){j--;}

        }
        return count;

    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 3, 0, 2, 2, 4, 2};
        int ele = 2;
        System.out.println(removeoccurences(arr, ele));
    }
}
