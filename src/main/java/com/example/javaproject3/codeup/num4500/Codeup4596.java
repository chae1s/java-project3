package com.example.javaproject3.codeup.num4500;

import java.util.Scanner;

public class Codeup4596 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maxValue = 0;
        int xIdx = 0;
        int yIdx = 0;

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                int inputValue = sc.nextInt();

                if (inputValue > maxValue) {
                    maxValue = inputValue;
                    xIdx = i;
                    yIdx = j;
                }

            }
        }

        System.out.println(maxValue);
        System.out.printf("%d %d", xIdx, yIdx);
    }
}
