package com.example.javaproject3.codeup.num1000;

import java.util.Scanner;

public class Codeup1083 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 정수 0 ~ 9까지
        int iVal = sc.nextInt();
        for (int i = 1; i <= iVal ; i++) {
            if (i % 3 == 0) {
                System.out.printf("%s ", "X");
                continue;
            }
            System.out.printf("%d ", i);
        }
    }
}
