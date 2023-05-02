package com.example.javaproject3.codeup.num1000;

import java.util.Scanner;

public class Codeup1041 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        char cVal = word.charAt(0);

        System.out.println((char) (cVal + 1));
    }
}
