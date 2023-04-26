package com.example.javaproject3.week2.day3;

import java.util.Arrays;

public class TenxTen {
    public static void main(String[] args) {
        int[][] arr = new int[10][10];
        System.out.println(Arrays.toString(arr[0]));
        System.out.println(Arrays.toString(arr[1]));
        System.out.println(Arrays.toString(arr[2]));
        System.out.println(Arrays.toString(arr[3]));
        System.out.println(Arrays.toString(arr[4]));
        System.out.println(Arrays.toString(arr[5]));
        System.out.println(Arrays.toString(arr[6]));
        System.out.println(Arrays.toString(arr[7]));
        System.out.println(Arrays.toString(arr[8]));
        System.out.println(Arrays.toString(arr[9]));

        System.out.println("-------------------------------------");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}
