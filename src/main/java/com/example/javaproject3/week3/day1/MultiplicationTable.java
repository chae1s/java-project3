package com.example.javaproject3.week3.day1;

public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.println("-------- 2단 --------");
        for (int i = 1; i <= 9 ; i++) {
            System.out.printf("2 * %d = %d\n", i, i * 2);
        }
        System.out.println("-------- 3단 --------");
        for (int i = 1; i <= 9; i++) {
            System.out.printf("3 * %d = %d\n", i, i * 3);
        }
        System.out.println("-------- 4단 --------");
        for (int i = 1; i <= 9; i++) {
            System.out.printf("4 * %d = %d\n", i, i * 4);
        }

    }
}
