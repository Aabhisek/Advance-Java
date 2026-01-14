package com.abhi.prep.java_advance.Matrix;

public class transposematrix {

    static void transpose(int matrix[][]){
        int n=matrix.length;
         int temp[][]=new int[n][n];
         for(int i=0;i<n;i++){
             for(int j=0;j<n;j++){
                 temp[i][j]=matrix[j][i];
             }
         }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=temp[i][j];
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        transpose(matrix);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
