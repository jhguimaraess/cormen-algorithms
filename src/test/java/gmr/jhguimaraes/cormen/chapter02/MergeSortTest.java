package gmr.jhguimaraes.cormen.chapter02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MergeSortTest {

    @Test
    void shouldSortArray(){
        int[] A = {5, 2, 4, 6, 1, 3};

        MergeSort.sort(A, 0, A.length - 1);

        int[] esperado = {1, 2, 3, 4, 5, 6};

        assertArrayEquals(esperado, A);
    }
}
