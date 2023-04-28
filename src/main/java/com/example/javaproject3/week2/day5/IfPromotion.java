package com.example.javaproject3.week2.day5;

import java.util.Scanner;

public class IfPromotion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int yearsOfExp = sc.nextInt();
        int numOfProject = sc.nextInt();

        if (yearsOfExp > 5 || numOfProject > 10) {
            System.out.println("팀장 승진 대상입니다.");
        } else {
            System.out.println("팀장 승진 대상이 아닙니다.");
        }
    }
}
