package com.example.javaproject3.programmers;

import java.util.Arrays;

public class Factorization {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(16)));
    }

    public static int[] solution(int n) {
        int[] factor = new int[n];
        int divisor = 2;
        while (n != 0 && divisor <= n) {
            if (n % divisor == 0) {
                factor[divisor] = divisor;
                n /= divisor;
            } else {
                divisor++;
            }
        }
        int size = 0;
        for (int i = 0; i < factor.length; i++) {
            if (factor[i] != 0) {
                size++;
            }
        }
        int[] answer = new int[size];
        int idx = 0;
        for (int i = 0; i < size; i++) {
            if (factor[idx] != 0) {
                answer[i] = factor[idx++];
            } else {
                idx++;
                i--;
            }
        }

        return answer;
    }
}
