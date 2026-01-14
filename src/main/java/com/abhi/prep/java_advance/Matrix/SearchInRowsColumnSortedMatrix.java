package com.abhi.prep.java_advance.Matrix;

public class SearchInRowsColumnSortedMatrix {
    static boolean search(int matrix[][], int target){
        int m=matrix.length;
        int n=matrix[0].length;

        int i=0;
        int j=n-1;
        while(i<m && j>=0){
            if(matrix[i][j]==target){
                return true;
            } else if (matrix[i][j]>target) {
                j--;

            }else{
                i++;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println(search(matrix,45));

    }
}
