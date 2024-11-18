package com.edu.chmnu.ki_123.c3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws MatrixColumnIllegalAccessException {
        double[][] matrix = {{2.4, 3.6, 5.8},
                {2.5, 4.6, 7.9},
                {3.5, 6.4, 7.4}};

        for(double[] array1 : matrix) {
            System.out.println(Arrays.toString(array1));
        }

        MatrixWrapper array = new MatrixWrapper(matrix);

        int index = 1;

        MinMax result = array.getByColumn(index);

        System.out.println("Max of matrix : " + result.max());
        System.out.println("Min of matrix : " + result.min());

    }
}
