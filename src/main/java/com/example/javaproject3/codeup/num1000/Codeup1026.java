package com.example.javaproject3.codeup.num1000;

import java.util.Scanner;

public class Codeup1026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String time = sc.nextLine();
        String[] timeArr = time.split(":");

        int minute = Integer.parseInt(timeArr[1]);
        System.out.printf("%d", minute);
    }
}
