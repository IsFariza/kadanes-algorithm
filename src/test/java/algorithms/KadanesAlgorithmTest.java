package algorithms;

import org.example.algorithms.KadanesAlgorithm;
import org.example.algorithms.KadanesAlgorithmOutput;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class KadanesAlgorithmTest {


    @Test
    void testPositiveNumbers(){
        int[] arr={1, 2, 3, 4};
        KadanesAlgorithmOutput result = KadanesAlgorithm.maxSubarraySum(arr);
        assertEquals(10, result.getMaxSum());
        assertEquals(0, result.getStartIndex());
        assertEquals(3, result.getEndIndex());
    }
    @Test
    void testNegativeNumbers(){
        int[] arr = {-8, -3, -6, -2, -5, -4};
        KadanesAlgorithmOutput result = KadanesAlgorithm.maxSubarraySum(arr);
        assertEquals(-2, result.getMaxSum());
        assertEquals(3, result.getStartIndex());
        assertEquals(3, result.getEndIndex());
    }

    @Test
    void testMixedNumbers(){
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        KadanesAlgorithmOutput result = KadanesAlgorithm.maxSubarraySum(arr);
        assertEquals(6, result.getMaxSum());
        assertEquals(3, result.getStartIndex());
        assertEquals(6, result.getEndIndex());
    }

    @Test
    void testSingleNumber(){
        int[] arr = {5};
        KadanesAlgorithmOutput result = KadanesAlgorithm.maxSubarraySum(arr);
        assertEquals(5, result.getMaxSum());
        assertEquals(0, result.getStartIndex());
        assertEquals(0, result.getEndIndex());
    }

    @Test
    void testEmptyArray(){
        int[] arr={};
        Exception ex = assertThrows(IllegalArgumentException.class,
                () -> KadanesAlgorithm.maxSubarraySum(arr));
        assertEquals("Array cannot be empty", ex.getMessage());
    }
}
