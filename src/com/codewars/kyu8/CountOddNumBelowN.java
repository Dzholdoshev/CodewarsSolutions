package com.codewars.kyu8;

import java.util.Arrays;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CountOddNumBelowN {
    public static void main(String[] args) {




        System.out.println(   oddCount(7));

    }

    public static int oddCount(int n) {

     return    (0+n)>>>1;
             //IntStream.range(0, n)
             //   .filter(i -> i % 2 != 0)
            // .toArray().length;

    }
}