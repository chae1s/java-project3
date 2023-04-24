package com.example.javaproject3.week2.day1;

public class BooleanEx {
    public static void main(String[] args) {
        boolean flag1 = false;
        boolean flag2 = true;
        boolean isPaymentSuccess = true;
        boolean isBalanceSufficient = true;

        System.out.println("isPaymentSuccess = " + isPaymentSuccess);
        System.out.println("isBalanceSufficient = " + isBalanceSufficient);

        int age = 10;
        boolean isAdult = age >= 18;

        boolean isChild = age < 14;
        System.out.println("isAdult = " + isAdult);
        System.out.println("isChild = " + isChild);
    }
    
}
