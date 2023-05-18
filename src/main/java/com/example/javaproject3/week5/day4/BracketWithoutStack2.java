package com.example.javaproject3.week5.day4;

import java.util.Arrays;

public class BracketWithoutStack2 {
    public static void main(String[] args) {
        String brakets = "((((())))";

        while (brakets.indexOf("()") != -1) {
            String[] arr = brakets.split("\\(\\)");
            System.out.println(Arrays.toString(arr));
            brakets = String.join("", arr);

            System.out.println(brakets);
        }
    }
}
