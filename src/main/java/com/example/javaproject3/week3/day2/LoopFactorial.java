package com.example.javaproject3.week3.day2;

public class LoopFactorial {
    public static void main(String[] args) {
        int n = 5;
        int answer = 1;
        for (int i = n; i > 0; i--) {
            answer *= i;
        }

        System.out.println("answer = " + answer);
    }
}
