package com.example.javaproject3.week1;

import com.example.javaproject3.PrintHello;

public class DefineAndInitialize {
    public static void main(String[] args) {
        int iVal = 1;
        PrintHello printHello = new PrintHello();

        System.out.println("iVal = " + iVal);
        printHello.print();
    }
}
