package com.example.javaproject3.codeup;

import java.util.Scanner;

public class Codeup1078 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iVal = sc.nextInt();
        int answer = 0;
        for (int i = 0; i <= iVal ; i++) {
            if (i % 2 == 0) {
                answer += i;
            }
        }
        System.out.println(answer);
    }
}
