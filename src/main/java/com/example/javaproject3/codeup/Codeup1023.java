package com.example.javaproject3.codeup;

import java.util.Scanner;

public class Codeup1023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split("[.]");
        System.out.printf("%d\n", Integer.parseInt(arr[0]));
        System.out.printf("%d\n", Integer.parseInt(arr[1]));
    }
}
