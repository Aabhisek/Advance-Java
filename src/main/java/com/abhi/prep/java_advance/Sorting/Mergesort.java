package com.abhi.prep.java_advance.Sorting;

import ch.qos.logback.core.net.SyslogOutputStream;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Mergesort {

    static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {                   // 1️⃣
            int mid = (left + right) / 2;     // 2️⃣

            mergeSort(arr, left, mid);        // 3️⃣
            mergeSort(arr, mid + 1, right);   // 4️⃣

            merge(arr, left, mid, right);     // 5️⃣
        }
    }
    static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;              // 6️⃣
        int n2 = right - mid;                 // 7️⃣

        int[] L = new int[n1];                // 8️⃣
        int[] R = new int[n2];                // 9️⃣

        for (int i = 0; i < n1; i++)          // 🔟
            L[i] = arr[left + i];

        for (int j = 0; j < n2; j++)          // 1️⃣1️⃣
            R[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = left;           // 1️⃣2️⃣

        while (i < n1 && j < n2) {             // 1️⃣3️⃣
            if (L[i] <= R[j]) {                // 1️⃣4️⃣
                arr[k++] = L[i++];             // 1️⃣5️⃣
            } else {
                arr[k++] = R[j++];             // 1️⃣6️⃣
            }
        }

        while (i < n1)                         // 1️⃣7️⃣
            arr[k++] = L[i++];

        while (j < n2)                         // 1️⃣8️⃣
            arr[k++] = R[j++];
    }

    public static void main(String[] args) {
        int arr[] = {4, 3, 2, 1};
        int left = 0;
        int right = 3;
        mergeSort(arr,left,right);
        System.out.println(Arrays.toString(arr));
    ;


    }


}
