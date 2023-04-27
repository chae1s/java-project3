package com.example.javaproject3.week2.day4;

public class CheckPromotion {
    public static void main(String[] args) {
        int yearsOrExp = 8;
        int numOfProject = 2;

        boolean isPromotion = yearsOrExp > 5 || numOfProject > 10;

        System.out.printf("팀장 승진 어부 : %b\n", isPromotion);
    }
}
