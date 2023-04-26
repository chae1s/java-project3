package com.example.javaproject3.codeup;

import java.util.Scanner;

public class Codeup1046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.printf("%d\n", (long)a + b + c);
        System.out.printf("%.1f", ((double)a + b + c) / 3);
    }
}
