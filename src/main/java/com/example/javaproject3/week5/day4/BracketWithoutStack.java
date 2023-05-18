package com.example.javaproject3.week5.day4;

public class BracketWithoutStack {
    public static void main(String[] args) {
        String brakets = "((((())))";

        while (brakets.indexOf("()") != -1) {
            brakets = brakets.replace("()", "");
        }

        if (brakets.length() == 0) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
