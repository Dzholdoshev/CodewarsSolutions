package com.codewars.kyu8;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Reversed_Words {
    public static void main(String[] args) {
        String s = "The greatest victory is that which requires no battle";
        System.out.println(reverseWords(s));
    }

    public static String reverseWords(String str) {
        //write your code here...
        String[] arr = str.split(" ");
        String result = "";
        for (int i = arr.length-1; i >= 0; i--) {
            result += arr[i]+" ";}
        return result;
//_______________________________________________________________________________
  /*
   List<String> list =  Arrays.asList(str.split(" "));
        Collections.reverse(list);
        String result = "";
        for (String each:list) {
            result+=each+" ";
        };
        return result;
           */
        //____________________________________________________________________________
        // Collections.reverse(Arrays.asList(str))
          /*
           Stream.of(str.split(" "))
           .reduce((a,b)->b+" "+a)
           .get();
*/








    }
}
