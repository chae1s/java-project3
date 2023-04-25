package com.example.javaproject3.week2.day2;

public class StringConcat {
    public static void main(String[] args) {
        String name = "춘식";
        int balance = 100000;
        String message = String.format("%s님의 통장 잔고는 %d원입니다.", name, balance);

        System.out.println(message);
    }
}
