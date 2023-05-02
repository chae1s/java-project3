package com.example.javaproject3.week3.day2;

public class While687 {
    public static void main(String[] args) {
        int num = 687;
        int answer = 0;
        while (num > 0) {
            answer += num % 10;
            num /= 10;
        }

        System.out.println(answer);
    }
}
