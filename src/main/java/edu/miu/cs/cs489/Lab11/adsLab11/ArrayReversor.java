package edu.miu.cs.cs489.Lab11.adsLab11;

import java.util.Arrays;
import java.util.Collections;

public class ArrayReversor {
    private final IArrayFlattenerService iArrayFlattenerService;

    public ArrayReversor(IArrayFlattenerService iArrayFlattenerService) {
        this.iArrayFlattenerService = iArrayFlattenerService;
    }

    public Integer[] reverseArray(int[][] inputArray) {
        int[] flattenedArray = iArrayFlattenerService.flattenArray(inputArray);
        if (flattenedArray == null) {
            return null;
        }
        Integer[] boxedArray = Arrays.stream(flattenedArray).boxed().toArray(Integer[]::new);
        Collections.reverse(Arrays.asList(boxedArray));
        return boxedArray;
    }
}

