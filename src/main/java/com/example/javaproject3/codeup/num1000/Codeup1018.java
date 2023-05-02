package com.example.javaproject3.codeup.num1000;

import java.util.Scanner;

public class Codeup1018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String time = sc.nextLine();
        String[] timeArr = time.split(":");
        System.out.printf("%s:%s", timeArr[0], timeArr[1]);
    }
}
