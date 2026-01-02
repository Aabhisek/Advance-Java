package com.abhi.prep.java_advance.Searching;

public class InfiniteArraySearch {

    static int search(int[] arr, int target) {

        int start = 0;
        int end = 1;

        // expand range until target <= arr[end]
        while ( arr[end] < target) {
            int newStart = end + 1;
            end = end + (end - start + 1) * 2; // double the window size
            start = newStart;


            // keep end within array bounds for safety
            if (end >= arr.length) {
                end = arr.length - 1;
            }
        }

        // normal binary search between start and end
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1; // not found
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 7, 9, 12, 15, 20, 26, 30, 40};
        int target = 20;

        System.out.println(search(arr, target));  // prints index of 20
    }
}

