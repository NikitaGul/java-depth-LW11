package com.edu.chmnu.ki_123.c3;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor

public class MatrixWrapper {

    private final double[][] matrix;

    private void checkIndexNumber(int index) throws MatrixColumnIllegalAccessException {
        if(index < 0 || index >= matrix[0].length){
            throw new MatrixColumnIllegalAccessException("Wrong column " + index);
        }
    }

    public MinMax getByColumn(int index) throws MatrixColumnIllegalAccessException {

        checkIndexNumber(index);

        double min = matrix[0][index];
        double max = min;

        for(int i = 0; i < matrix.length; ++i) {
                if (matrix[i][index] > max) {
                    max = matrix[i][index];
                }
                if (matrix[i][index] < min) {
                    min = matrix[i][index];
                }
        }

        return new MinMax(max, min);
    }
}
