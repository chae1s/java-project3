package com.example.javaproject3.week3.day1;

public class MultiplicationTable2 {
    public static void main(String[] args) {
        for (int i = 2; i <= 4; i++) {
            print(i);
        }

        int[] dan = {2, 4, 8, 9};
        for (int i = 0; i < dan.length; i++) {
            print(dan[i]);
        }
    }

    public static void print(int dan) {
        System.out.println("-------------------------");
        for (int i = 1; i <= 9; i++) {
            System.out.printf("%d * %d = %d\n", dan, i, dan * i);
        }
    }

}
