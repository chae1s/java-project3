package com.example.javaproject3.programmers;

import java.util.Arrays;

public class SecretMap {
    public static void main(String[] args) {
        int[] arr1 = {9, 20, 28, 18, 11};
        int[] arr2 = {30, 1, 21, 17, 28};
        String[] answer = solution(5, arr1, arr2);

        System.out.println(Arrays.toString(answer));

        int[] arr3 = {46, 33, 33 ,22, 31, 50};
        int[] arr4 = {27 ,56, 19, 14, 14, 10};
        String[] answer2 = solution(6, arr3, arr4);

        System.out.println(Arrays.toString(answer2));
    }

    public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for(int i=0;i<n;i++) {
            int num = arr1[i] | arr2[i];
            String format = "%0" + n + "d";

            String str = String.format(format, Long.parseLong(Integer.toBinaryString(num)))
                    .replace("1", "#")
                    .replace("0", " ");

            answer[i] = str;
        }
        return answer;
    }
}
