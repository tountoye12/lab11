package edu.miu.cs.cs489.Lab11.adsLab11;

import java.util.Arrays;

public class ArrayFlattener {
    public int[] flattenArray(int[][] inputArray) {
        if (inputArray == null) {
            return null;
        }
        return Arrays.stream(inputArray)
                .flatMapToInt(Arrays::stream)
                .toArray();
    }
}

