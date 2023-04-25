package com.example.javaproject3.codeup;

import java.util.Scanner;

public class Codeup1035 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hexadecimal = Integer.parseInt(sc.nextLine(), 16);
        System.out.printf("%o", hexadecimal);
    }
}
