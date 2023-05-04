package com.example.javaproject3.week3.day4;

public class TwoxTwoMaxValue {
    public static void main(String[] args) {
        int[][] arr = {{2, 9}, {3, 1}};
        int max = arr[0][0];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];
                }
            }
        }

        System.out.println(max);
    }
}
