package com.example.javaproject3.week2.day2;

public class StringEquals {
    public static void main(String[] args) {
        String str1 = "GOLD";
        String str2 = "G";

        System.out.println("GOLD ---> " + str1.hashCode());
        System.out.println("G ---> " + str2.hashCode());

        boolean isSame = str1.substring(0, 1) == str2;
        isSame = str1.substring(0, 1).equals(str2);
        System.out.println(isSame);

    }
}
