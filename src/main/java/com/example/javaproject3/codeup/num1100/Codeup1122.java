package com.example.javaproject3.codeup.num1100;

import java.util.Scanner;

public class Codeup1122 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int seconds = sc.nextInt();
        int minute = seconds / 60;
        seconds %= 60;

        System.out.printf("%d %d\n", minute, seconds);
    }
}
