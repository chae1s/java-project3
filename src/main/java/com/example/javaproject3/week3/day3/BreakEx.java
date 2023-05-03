package com.example.javaproject3.week3.day3;

public class BreakEx {
    public static void main(String[] args) {
        for (int i = 0; i < 500; i++) {
            if (i * i > 50) {
                break;
            }
            System.out.println(i);
        }
    }
}
