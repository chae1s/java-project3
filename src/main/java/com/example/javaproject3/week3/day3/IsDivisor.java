package com.example.javaproject3.week3.day3;

public class IsDivisor {
    public static void main(String[] args) {
        int num = 12;
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.printf("%d의 약수: %d\n", num, i);
                count++;
            }
        }

        System.out.printf("%d의 약수의 개수 : %d\n", num, count);
    }
}
