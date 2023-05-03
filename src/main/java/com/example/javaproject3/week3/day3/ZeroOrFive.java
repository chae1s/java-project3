package com.example.javaproject3.week3.day3;

public class ZeroOrFive {
    public static void main(String[] args) {
        int n = 555;

        isZeroOrFive(n);
    }

    public static void isZeroOrFive(int n) {

        String flagTest = "0 또는 5로 이루어진 숫자";
        while (n > 0) {
            int remainder = n % 10;
            if (remainder % 5 != 0) {
                flagTest = "0 또는 5로 이루어진 숫자 아님";
                break;
            }
            n /= 10;

        }

        System.out.printf("%s\n", flagTest);
    }
}
