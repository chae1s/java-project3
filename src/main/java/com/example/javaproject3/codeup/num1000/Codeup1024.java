package com.example.javaproject3.codeup.num1000;

import java.util.Scanner;

public class Codeup1024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String formula = sc.next();
        int hIndex = formula.indexOf("H");

        int cWeight = Integer.parseInt(formula.substring(1, hIndex));
        int hWeight = Integer.parseInt(formula.substring(hIndex+1));
        System.out.printf("%d", (cWeight * 12) + (hWeight));
    }
}
