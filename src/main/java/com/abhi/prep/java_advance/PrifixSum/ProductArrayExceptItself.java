package com.abhi.prep.java_advance.PrifixSum;

public class ProductArrayExceptItself {

    static int[] productExceptSelf(int[] arr) {

        int n = arr.length;
        int[] res = new int[n];
        // first element as one to ignore it
        // then add the product of remaining elements
        res[0] = 1;
        for (int i = 1; i < n; i++) {
            res[i] = res[i - 1] * arr[i - 1];
        }

        int sufix = 1;
        for (int i = n - 1; i >= 0; i--) {
            res[i] = sufix * res[i];
            sufix *= arr[i];
        }

        return res;
    }

    public static void main(String[] args) {
        int[] arr = {10, 3, 5, 6, 2};
        int[] res = productExceptSelf(arr);
        System.out.print("Optimized Result: ");
        for (int val : res) {
            System.out.print(val + " ");
        }
    }
}