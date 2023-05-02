package com.example.javaproject3.programmers;

import java.util.Arrays;

public class SpecialTwoDimArray {
    public static void main(String[] args) {
        int[][] answer = solution(1);
        for (int i = 0; i < 1; i++) {
            System.out.println(Arrays.toString(answer[i]));
        }
    }

    public static int[][] solution(int n) {
        int[][] answer = new int[n][n];
        for (int i = 0; i < n; i++) {
            answer[i][i] = 1;
        }

        return answer;
    }
}
