package com.example.javaproject3.codeup.num1200;

import java.util.Scanner;

public class Codeup1274 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int cnt = 0;
        String prime = "not prime";
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                cnt++;
            }
        }

        if (cnt == 0) {
            prime = "prime";
        }

        System.out.println(prime);
    }
}
