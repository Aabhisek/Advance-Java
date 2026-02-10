/*
Given an integer array nums sorted in non-decreasing order,
return an array of the squares of each number sorted in non-decreasing order.
 */

package com.abhi.prep.java_advance.twoPointer;

import java.util.Arrays;

public class SquareOfSortedArray {

    static int[] SOSA(int[] arr){

        int[] res=new int[arr.length];

        int i=0;
        int j=arr.length-1;
        int k=arr.length-1; //index of resultant array
        while(i<j) {
            int leftitemsquare = arr[i] * arr[i];
            int rightitemsquare = arr[j] * arr[j];

            if (leftitemsquare > rightitemsquare) {
                res[k] = leftitemsquare;
                i++;
            } else {
                res[k] = rightitemsquare;
                j--;
            }
            k--;
        }

        return res;
    }

    public static void main(String[] args) {
        int[] arr={-4,-1,0,3,10};
        System.out.println(Arrays.toString(SOSA(arr)));
    }

}
