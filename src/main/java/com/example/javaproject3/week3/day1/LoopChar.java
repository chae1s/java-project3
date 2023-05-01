package com.example.javaproject3.week3.day1;

public class LoopChar {
    public static void main(String[] args) {
        for (int c = 'a'; c <= 'z'; c++) {
            System.out.printf("%c ", c);
        }
        System.out.println("---------------------");
        for (int c = 'a'; c <= 'z'; c++) {
            System.out.printf("%d ", c);
        }
    }
}
