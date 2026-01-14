package com.abhi.prep.java_advance.Matrix;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    static List<Integer> SpiralMatrixresult(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;

        while (top <= bottom && left <= right) {

            //for top
            for (int j = left; j <= right; j++) {
                result.add(matrix[top][j]);
            }
            top++;
            // 2. Right column
            for (int i = top; i <= bottom; i++) {
                result.add(matrix[i][right]);
            }
            right--;

            // 3. Bottom row
            if (top <= bottom) {
                for (int j = right; j >= left; j--) {
                    result.add(matrix[bottom][j]);
                }
                bottom--;
            }

            // 4. Left column
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
                left++;
            }
        }

        return result;

    }



    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println(SpiralMatrixresult(matrix));

    }
}
