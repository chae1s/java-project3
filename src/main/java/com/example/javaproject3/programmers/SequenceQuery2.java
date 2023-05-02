package com.example.javaproject3.programmers;

import java.util.Arrays;

public class SequenceQuery2 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 4, 3};
        int[][] queries = {{0, 4, 2},{0, 3, 2},{0, 2, 2}};

        System.out.println(Arrays.toString(solution(arr, queries)));
    }

    public static int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int num = -1;
            for (int j = queries[i][0]; j <= queries[i][1] ; j++) {

                if (arr[j] > queries[i][2]) {
                    num = num != -1 ? Math.min(num, arr[j]) : arr[j];
                }
            }

            answer[i] = num;
        }

        return answer;
    }
}
