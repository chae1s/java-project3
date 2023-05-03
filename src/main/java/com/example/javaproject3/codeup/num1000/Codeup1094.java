package com.example.javaproject3.codeup.num1000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Codeup1094 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        String[] sArr = br.readLine().split(" ");
        int[] answer = new int[num];

        for (int i = 1; i <= sArr.length; i++) {
            answer[i - 1] = Integer.parseInt(sArr[sArr.length - i]);
        }

        for (int i = 0; i < answer.length; i++) {
            System.out.printf("%d ", answer[i]);
        }
    }
}
