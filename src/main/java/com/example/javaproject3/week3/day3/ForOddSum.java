package com.example.javaproject3.week3.day3;

public class ForOddSum {
    public static void main(String[] args) {
        int num = 10;
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
