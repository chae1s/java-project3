package com.example.javaproject3.week3.day2;

public class WhileFactorial {
    public static void main(String[] args) {
        int n = 5;
        int answer = 1;
        while (n > 0) {
            answer *= n--;
        }

        System.out.println(answer);
    }
}
