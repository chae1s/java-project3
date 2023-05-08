package com.example.javaproject3.codeup.num1200;

import java.util.Scanner;

public class Codeup1256 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            System.out.printf("%s", "*");
        }

        System.out.printf("%s\n", "*".repeat(num));
    }
}
