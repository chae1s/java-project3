package com.example.javaproject3.codeup.num1600;

import java.util.Scanner;

public class Codeup1620 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iVal = sc.nextInt();
        int sum = 0;
        while (iVal > 0) {
            sum += iVal % 10;
            iVal = iVal / 10;
            if (sum / 10 != 0 && iVal == 0) {
                iVal = sum;
                sum = 0;
            }
        }

        System.out.println(sum);
    }
}
