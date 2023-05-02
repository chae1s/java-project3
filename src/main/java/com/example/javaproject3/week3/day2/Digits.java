package com.example.javaproject3.week3.day2;

public class Digits {
    public static void main(String[] args) {
        int num = 68137;
        int digit = 0;
        while (num > 0) {
            num /= 10;
            digit++;
        }
        System.out.println(digit);

        int num2 = 68137;
        int digit2 = (int)(Math.log10(num2) + 1);
        System.out.println(digit2);
    }
}
