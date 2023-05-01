package com.example.javaproject3.codeup;

import java.util.Scanner;

public class Codeup1076 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char cVal = sc.nextLine().charAt(0);
        for (int c = 'a'; c <= cVal; c++) {
            System.out.printf("%c\n", c);
        }
    }
}
