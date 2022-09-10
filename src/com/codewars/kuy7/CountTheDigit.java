package com.codewars.kuy7;

import java.util.Arrays;
import java.util.function.IntUnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CountTheDigit {
    public static long nbDig(int n, int d) {
        // your code



        int[] arr=  IntStream.range(0,n+1)
                .map(a->a*a).toArray();

        System.out.println(Arrays.toString(arr));

     long res =    Arrays.stream(arr).mapToObj(p->(p+"")
                .split(""))
                .flatMap(p->Arrays.stream(p))
                .filter(s->s.equals((d+"")))
                .count();
        return res;


    }

    public static void main(String[] args) {
        System.out.println( nbDig(25,1)  );



    }
}
