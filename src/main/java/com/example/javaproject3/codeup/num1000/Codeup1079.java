package com.example.javaproject3.codeup.num1000;

import java.util.Scanner;

public class Codeup1079 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split(" ");
        for (int i = 0; i <= arr.length; i++) {
            System.out.printf("%s\n", arr[i]);
            if (arr[i].equals("q")) {
                break;
            }
        }
    }
}
