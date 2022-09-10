package com.codewars.kyu8;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SubtractTheSum {
    public static void main(String[] args) {


        System.out.println(subtractSum(102));

// 123-6=117
        //117-9
        //108-9
        //99
    }


    public static String subtractSum(int n) {
        //return fruit name like "apple"
        String list = "1-kiwi 2-pear 3-kiwi 4-banana 5-melon 6-banana 7-melon 8-pineapple 9-apple 10-pineapple 11-cucumber 12-pineapple 13-cucumber 14-orange 15-grape 16-orange 17-grape 18-apple 19-grape 20-cherry 21-pear 22-cherry 23-pear 24-kiwi 25-banana 26-kiwi 27-apple 28-melon 29-banana 30-melon 31-pineapple 32-melon 33-pineapple 34-cucumber 35-orange 36-apple 37-orange 38-grape 39-orange 40-grape 41-cherry 42-pear 43-cherry 44-pear 45-apple 46-pear 47-kiwi 48-banana 49-kiwi 50-banana 51-melon 52-pineapple 53-melon 54-apple 55-cucumber 56-pineapple 57-cucumber 58-orange 59-cucumber 60-orange 61-grape 62-cherry 63-apple 64-cherry 65-pear 66-cherry 67-pear 68-kiwi 69-pear 70-kiwi 71-banana 72-apple 73-banana 74-melon 75-pineapple 76-melon 77-pineapple 78-cucumber 79-pineapple 80-cucumber 81-apple 82-grape 83-orange 84-grape 85-cherry 86-grape 87-cherry 88-pear 89-cherry 90-apple 91-kiwi 92-banana 93-kiwi 94-banana 95-melon 96-banana 97-melon 98-pineapple 99-apple 100-pineapple";
        String[] arr = list.split(" ");
        if (n > 100) {
           int sum = 0;
            while (true) {
                sum = (n + "").chars().map(p -> p - '0').reduce(Integer::sum).getAsInt(); //1+1+9 =>11//1+0+8=>9
                sum = n - sum; //119-11=>108//108-9=>99
                if(sum>100){
                    n=sum;continue;
                } else {break;}
            }
            return arr[sum - 1].substring(arr[sum - 1].indexOf("-") + 1);
        } else {
            return arr[n - 1].substring(arr[n - 1].indexOf("-") + 1);
        }


    }
}
