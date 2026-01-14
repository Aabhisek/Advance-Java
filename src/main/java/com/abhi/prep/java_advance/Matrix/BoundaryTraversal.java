package com.abhi.prep.java_advance.Matrix;

import java.util.ArrayList;
import java.util.List;

public class BoundaryTraversal {
    static List<Integer> traverse(int matrix[][]){
        List<Integer> result= new ArrayList<>();

        int m=matrix.length;
        int n=matrix[0].length;



        // top row printing
            for(int j=0; j<=n-1;j++){
                result.add(matrix[0][j]);
            }
            //printing right column
            for(int i=1;i<=m-1;i++){
                result.add(matrix[i][n-1]);
            }
            //printing bottom row
            for(int j=n-2;j>=0;j--){
                result.add(matrix[m-1][j]);
            }
            //printing left column
            for(int i=m-2;i>0;i--){
            result.add(matrix[i][0]);
        }

        return result;
    }
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(traverse(matrix));
    }
}
