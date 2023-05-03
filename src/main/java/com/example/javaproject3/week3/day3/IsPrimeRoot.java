package com.example.javaproject3.week3.day3;

public class IsPrimeRoot {
    public static void main(String[] args) {
        int num = 79;
        String prime = "소수 아님";
        int cnt = 0;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                cnt++;
            }
        }

        if (cnt == 0) prime = "소수";

        System.out.println(prime);
    }
}
