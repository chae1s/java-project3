package com.example.javaproject3.codeup;

import java.util.Scanner;

public class Codeup1045 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.printf("%d\n", (long)a + b);
        System.out.printf("%d\n", a - b);
        System.out.printf("%d\n", (long)a * b);
        System.out.printf("%d\n", a / b);
        System.out.printf("%d\n", a % b);
        System.out.printf("%.2f", (double) a / b);
    }
}
