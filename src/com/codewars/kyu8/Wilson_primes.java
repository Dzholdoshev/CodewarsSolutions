package com.codewars.kyu8;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class Wilson_primes {
    public static void main(String[] args) {

        System.out.println( am_i_wilson(452) );

    }

    public static boolean am_i_wilson(double n) {
        //your code here

//  ((P-1)! + 1) / (P * P)
/*
     int factorialN = IntStream.range  (1,(int) n)
              .reduce((a,b)->a*b)
              .getAsInt();
        System.out.println(factorialN);
       double prime = (factorialN+1)/(n*n);
        System.out.println(prime);
       if(prime%1!=0){return true;}else {return false;}

 */
        double fact = 1;
        for (double i = 2; i <= n-1; i++) {
            fact = fact * i;
        }
        System.out.println("fact = " + fact);
      double prime = (fact+1)/(n*n);
        System.out.println("prime = " + prime);
        if(prime%1==0) {return true;}else {return false;}

    }
}
