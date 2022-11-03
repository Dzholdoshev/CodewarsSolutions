package com.codewars.kuy7;

public class Test {
    public static void main(String[] args) {

  int result=rowSumOddNumbers(5);
        System.out.println(result);


    }

    public static int rowSumOddNumbers(int n) {


        int counter = -1;
        int total = 0;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                counter = counter + 2;
                if (i == n) {
                    total = total + counter;
                }
            }
        }
       return total;
    }
}


