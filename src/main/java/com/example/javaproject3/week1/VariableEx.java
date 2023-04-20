package com.example.javaproject3.week1;

import com.example.javaproject3.PrintHello;

public class VariableEx {
    public static void main(String[] args) {
        int iVal;   // 변수 선언
        iVal = 0;   // 초기화
        PrintHello printHello;          //변수 선언
        printHello = new PrintHello();  // new를 이용해 인스턴스화 및 초기화

        System.out.println("iVal = " + iVal);
        printHello.print();

    }
}
