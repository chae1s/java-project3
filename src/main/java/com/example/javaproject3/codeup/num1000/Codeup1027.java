package com.example.javaproject3.codeup.num1000;

import java.util.Scanner;

public class Codeup1027 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String date = sc.nextLine();
        sc.close();
        String[] dateArr = date.split("\\.");

        int year = Integer.parseInt(dateArr[0]);
        int month = Integer.parseInt(dateArr[1]);
        int day = Integer.parseInt(dateArr[2]);

        System.out.printf("%02d-%02d-%04d", day, month, year);
    }
}
