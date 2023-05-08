package com.example.javaproject3.codeup.num1300;

import java.util.Scanner;

public class Codeup1354 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 0; i < num ; i++) {
            for (int j = 0; j < num - i; j++) {
                System.out.printf("%s", "*");
            }
            System.out.println();
        }
    }
}
