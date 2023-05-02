package com.example.javaproject3.programmers;

import java.util.Arrays;

public class SequenceQuery4 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 4, 3};
        int[][] queries = {{0, 4, 1},{0, 3, 2},{0, 3, 3}};

        System.out.println(Arrays.toString(solution(arr, queries)));
    }

    public static int[] solution(int[] arr, int[][] queries) {

        for (int i = 0; i < queries.length; i++) {
            for (int j = queries[i][0]; j <= queries[i][1]; j++) {
                if (j % queries[i][2] == 0) {
                    arr[j]++;
                }
            }
        }
        return arr;
    }
}
