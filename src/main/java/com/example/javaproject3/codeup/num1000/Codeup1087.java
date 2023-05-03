package com.example.javaproject3.codeup.num1000;

import java.util.Scanner;

public class Codeup1087 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputNum = sc.nextInt();
        int answer = 0;
        for (int i = 1; i <= inputNum; i++) {
            answer += i;
            if (answer >= inputNum) {
                System.out.println(answer);
                break;
            }
        }
    }
}
