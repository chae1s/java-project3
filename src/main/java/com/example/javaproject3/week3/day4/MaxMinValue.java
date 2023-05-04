package com.example.javaproject3.week3.day4;

public class MaxMinValue {
    public static void main(String[] args) {
        int[] arr = {3, 7, 1, 21, 9};

        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        System.out.println(max);

        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }

        System.out.println(min);
    }
}
