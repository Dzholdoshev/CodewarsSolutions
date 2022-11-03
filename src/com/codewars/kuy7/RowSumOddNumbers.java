package com.codewars.kuy7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class RowSumOddNumbers {
  //  public static int rowSumOddNumbers(int n) {
        //TODO


   // }

    public static void main(String[] args) {

        List<Integer> oddNums = new ArrayList<>();

        int counter = 0;
        int counter2= 0;
        for (int i = 0; i < 101; i++) {
            if(i%2!=0){oddNums.add(i);
                System.out.print(i);
              counter2  = counter++;
              // if(counter2)

            }
        }

        System.out.println(oddNums);
    }
}