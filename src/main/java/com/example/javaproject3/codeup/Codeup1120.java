package com.example.javaproject3.codeup;

import java.util.Scanner;

public class Codeup1120 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iVal1 = sc.nextInt();
        int iVal2 = sc.nextInt();
        int iVal3 = sc.nextInt();

        System.out.printf("%.2f\n", (iVal1 + iVal2 + iVal3) / 3.0);
    }
}
