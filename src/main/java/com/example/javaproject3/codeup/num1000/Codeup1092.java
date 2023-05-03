package com.example.javaproject3.codeup.num1000;

import java.util.Scanner;

public class Codeup1092 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int aDay = sc.nextInt();
        int bDay = sc.nextInt();
        int cDay = sc.nextInt();

        int day = 1;
        while(true) {
            if (day % aDay == 0 && day % bDay == 0 && day % cDay == 0) {
                break;
            }
            day++;
        }

        System.out.println(day);
    }
}
