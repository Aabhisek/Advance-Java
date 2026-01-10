package com.abhi.prep.java_advance.Searching;

public class repeatingelement {

    static int findrepatingelement(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return arr[i];
                }
            }
            }
        return -1;
        }
        public static void main (String[]args){
            int arr[] = {1, 1, 2, 3, 4, 1, 6, 8};
            int res=findrepatingelement(arr);
            System.out.println(res);

        }
    }
