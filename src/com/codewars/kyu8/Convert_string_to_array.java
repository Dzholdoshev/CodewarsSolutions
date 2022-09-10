package com.codewars.kyu8;

import java.util.Arrays;

public class Convert_string_to_array {
    public static String[] stringToArray(String s) {
        //your code;
        return s.split(" ");


    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString( stringToArray("Robin Singh")));
    }
}
