package gmr.jhguimaraes.cormen.chapter02;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class InsertionSortTest {

    @Test
    void shouldSortArray(){
        int[] A = {5, 2, 4, 6, 1, 3};

        InsertionSort.sort(A);

        int[] esperado = {1, 2, 3, 4, 5, 6};
        assertArrayEquals(esperado, A);
    }
}
