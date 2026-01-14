package com.abhi.prep.java_advance.Matrix;

public class RotateAnticlock90 {
    static void rotate(int[][] matrix){
        int n=matrix.length;

        //transpose
        for(int i=0;i<n;i++){
            for (int j=i;j<n;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }

        //reverse top with bottom
        for(int j=0;j<n;j++){
            int top=0, bottom=n-1;
            while(top<=bottom){
                int temp=matrix[top][j];
                matrix[top][j]=matrix[bottom][j];
                matrix[bottom][j]=temp;
                top++;
                bottom--;
            }
        }

    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        rotate(matrix);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
