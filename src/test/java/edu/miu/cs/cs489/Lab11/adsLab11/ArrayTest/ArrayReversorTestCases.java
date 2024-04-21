package edu.miu.cs.cs489.Lab11.adsLab11.ArrayTest;

import edu.miu.cs.cs489.Lab11.adsLab11.ArrayReversor;
import edu.miu.cs.cs489.Lab11.adsLab11.IArrayFlattenerService;
import org.junit.jupiter.api.Assertions;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import org.mockito.Mockito;

@SpringBootTest
public class ArrayReversorTestCases {
    private final IArrayFlattenerService iArrayFlattenerService = Mockito.mock(IArrayFlattenerService.class);
    private final ArrayReversor arrayReversor = new ArrayReversor(iArrayFlattenerService);

    @Test
    public void testReverseArray() {
        int[][] inputArray = {{1, 3}, {0}, {4, 5, 9}};
        Integer[] expectedOutput = {9, 5, 4, 0, 3, 1};
        Mockito.when(iArrayFlattenerService.flattenArray(inputArray)).thenReturn(new int[]{1, 3, 0, 4, 5, 9});
        Assertions.assertArrayEquals(expectedOutput, arrayReversor.reverseArray(inputArray));
        Mockito.verify(iArrayFlattenerService).flattenArray(inputArray);
    }

    @Test
    public void testReverseArrayWithNullInput() {
        int[][] inputArray = null;
        Integer[] expectedOutput = null;
        Mockito.when(iArrayFlattenerService.flattenArray(inputArray)).thenReturn(null);
        Assertions.assertArrayEquals(expectedOutput, arrayReversor.reverseArray(inputArray));
        Mockito.verify(iArrayFlattenerService).flattenArray(inputArray);
    }
}

