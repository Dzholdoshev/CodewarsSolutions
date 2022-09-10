package com.codewars.kyu8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;

public class GravityFlip {
    public static int[] flip(char dir, int[] arr) {


        if (dir == 'R') {
            return  Arrays.stream(arr)
                    .sorted()
                    .toArray();

        } else {
            return   Arrays.stream(arr)
                    .boxed()
                    .sorted(Comparator.reverseOrder())
                    .mapToInt(Integer::intValue)
                    .toArray();

// return Arrays.stream(arr).boxed()
//                 .sorted(dir=='L'? (a,b)->b-a : (a,b)->a-b)
//                 .mapToInt(Integer::intValue)
//                 .toArray();

        }
    }


    public static void main(String[] args) {

        int[] array = {1,4,5,3,5};

        System.out.println(Arrays.toString(   flip('L',array)));

    }
}