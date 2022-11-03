package com.codewars.kyu8;

public class EvenOrOdd {
    public static void main(String[] args) {
        System.out.println(  even_or_odd(4));
    }


    public static String even_or_odd(int number) {
        //Place code here

        String result = "";
        if (number % 2 == 0) {
            result= "Even";
        } else {
            result= "Odd";
        }

        return result;
    }
}