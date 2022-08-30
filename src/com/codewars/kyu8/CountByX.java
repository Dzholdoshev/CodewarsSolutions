package com.codewars.kyu8;

import java.util.Arrays;

public class CountByX {

    public static void main(String[] args) {


        System.out.println(Arrays.toString(countBy(2,5))); //2 4 6 8 10
    }
    public static int[] countBy(int x, int n) {
        // Your code here

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {

arr[i] = (i+1)*x;
        }

        return arr;
    }
}

