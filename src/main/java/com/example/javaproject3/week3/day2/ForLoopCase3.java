package com.example.javaproject3.week3.day2;

public class ForLoopCase3 {
    public static void main(String[] args) {
        // i <= Math.sqrt(50) 대신 i * i <= 50 사용
        for (int i = 0; i * i <= 50 ; i++) {
            System.out.println(i);
        }
    }
}
