package com.edu.chmnu.ki_123.c3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertThrowsExactly;

class MatrixWrapperTest {

    @Test
    void shouldReturnMinMaxForSecondColumn() throws MatrixColumnIllegalAccessException {
        double matrix[][] = {{2.4, 4.5, 7.5},
                {2.5, 4.7, 6.8},
                {2.6, 6.7, 9.7}};

        int index = 1;

        MatrixWrapper array = new MatrixWrapper(matrix);

        MinMax result = array.getByColumn(index);

        assertEquals(4.5, result.min(), 1e-3);
        assertEquals(6.7, result.max(), 1e-3);
    }

    @Test
    void shouldReturnMinMaxForFirstColumn() throws MatrixColumnIllegalAccessException {
        double matrix[][] = {{2.5, 2.8, 6.7 },
                {3.6, 2.8, 7.8},
                {3.8, 4.7, 5.8}};

        int index = 0;

        MatrixWrapper array = new MatrixWrapper(matrix);

        MinMax result = array.getByColumn(index);


        array.getByColumn(index);

        assertEquals(2.5, result.min(), 1e-3);
        assertEquals(3.8, result.max(), 1e-3);
    }

    @Test
    void shouldNotReturnMinMaxForMatrix() throws MatrixColumnIllegalAccessException {
        double matrix[][] = {{2.7, 4.6, 5.8},
                {3.6, 4.6, 7.9},
                {3.8, 4.6, 8.7}};

        int index = 4;

        MatrixWrapper array = new MatrixWrapper(matrix);

        assertThrows(MatrixColumnIllegalAccessException.class, () -> {
            MinMax result = array.getByColumn(index);
        });
    }

}