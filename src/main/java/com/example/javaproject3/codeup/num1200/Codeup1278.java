package com.example.javaproject3.codeup.num1200;

import java.util.Scanner;

public class Codeup1278 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iVal = sc.nextInt();

        int answer = (int)(Math.log10(iVal) + 1);
        System.out.println(answer);
    }
}
