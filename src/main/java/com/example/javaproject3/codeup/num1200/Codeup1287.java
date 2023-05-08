package com.example.javaproject3.codeup.num1200;

import java.util.Scanner;

public class Codeup1287 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 1; i <= 9 ; i++) {
            for (int j = 1; j <= i * num ; j++) {
                System.out.printf("%s", "*");
            }
            System.out.println();
        }
    }
}
