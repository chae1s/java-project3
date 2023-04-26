package com.example.javaproject3.week2.day3;

import java.util.Arrays;

public class TwoDimArrFillColumn {
    public static void main(String[] args) {
        int[][] arr = new int[5][5];
        arr[2][0] = 1;
        arr[2][1] = 2;
        arr[2][2] = 3;
        arr[2][3] = 4;
        arr[2][4] = 5;

        System.out.println(Arrays.toString(arr[0]));
        System.out.println(Arrays.toString(arr[1]));
        System.out.println(Arrays.toString(arr[2]));
        System.out.println(Arrays.toString(arr[3]));
        System.out.println(Arrays.toString(arr[4]));
    }
}
