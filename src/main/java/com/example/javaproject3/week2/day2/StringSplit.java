package com.example.javaproject3.week2.day2;

public class StringSplit {
    public static void main(String[] args) {
        String str = "10 3 19 28 7 488";
        String[] sttArr = str.split(" ");
        System.out.println(sttArr[0]);
        System.out.println(sttArr[1]);
        System.out.println(sttArr[2]);
        System.out.println(sttArr[3]);
        System.out.println(sttArr[4]);
        System.out.println(sttArr[5]);
    }
}
