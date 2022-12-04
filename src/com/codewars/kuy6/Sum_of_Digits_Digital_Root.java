package com.codewars.kuy6;

public class Sum_of_Digits_Digital_Root {

    public static int digital_root(int num) {

        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num = num / 10;
        }
        if (sum < 10) {
            return sum;
        }
        return digital_root(sum);
    }

}
