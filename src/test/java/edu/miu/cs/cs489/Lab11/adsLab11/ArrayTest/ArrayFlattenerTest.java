package edu.miu.cs.cs489.Lab11.adsLab11.ArrayTest;

import edu.miu.cs.cs489.Lab11.adsLab11.ArrayFlattener;
import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.Test;

public class ArrayFlattenerTest {
    private ArrayFlattener arrayFlattener;

    @Before
    public void setUp() throws Exception {
        this.arrayFlattener = new ArrayFlattener();
    }
    @Test
    public void testFlattenArray() {
        int[][] inputArray = {{1, 3}, {0}, {4, 5, 9}};
        int[] expectedOutput = {1, 3, 0, 4, 5, 9};
        Assertions.assertArrayEquals(expectedOutput, arrayFlattener.flattenArray(inputArray));
    }

    @Test
    public void testFlattenArrayWithNullInput() {
        int[][] inputArray = null;
        int[] expectedOutput = null;
        Assertions.assertArrayEquals(expectedOutput, arrayFlattener.flattenArray(inputArray));
    }
}