package com.example.javaproject3.week2.day1;

public class StringParseInt {
    public static void main(String[] args) {
        String str = "1";
        int num = Integer.parseInt(str);
        System.out.println("num = " + num);

        String str2 = "123ab";
        int num2 = Integer.parseInt(str2);

        System.out.println("num2 = " + num2);
    }
}
