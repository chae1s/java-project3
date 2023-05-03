package com.example.javaproject3.week3.day3;

public class IsPrime {
    public static void main(String[] args) {
        int num = 7;
        int cnt = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                cnt++;
            }
        }

        if (cnt == 2) {
            System.out.printf("%d는 소수 입니다.\n", num);
        } else {
            System.out.printf("%d는 소수가 아닙니다.\n", num);
        }
    }
}
