package com.codewars.kyu8;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayPlusArray {
    public static int arrayPlusArray(int[] arr1, int[] arr2) {
        // arr1 + arr2 is not working...




        return  Arrays.stream(arr1).sum() + Arrays.stream(arr2).sum();
    }
}
