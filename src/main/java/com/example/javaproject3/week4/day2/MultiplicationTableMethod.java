package com.example.javaproject3.week4.day2;

public class MultiplicationTableMethod {
    public static void printMultiplicationTable(int ofN) {
        for (int i = 1; i <= 9; i++) {
            System.out.printf("%d * %d = %d\n", ofN, i, ofN * i);
        }
    }

    public static void main(String[] args) {
        for (int i = 2; i <= 4; i++) {
            printMultiplicationTable(i);
            System.out.println("--------------------------------");
        }
    }
}
