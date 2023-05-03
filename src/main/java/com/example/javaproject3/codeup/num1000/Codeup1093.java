package com.example.javaproject3.codeup.num1000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Codeup1093 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        String[] sArr = br.readLine().split(" ");
        int[] answer = new int[23];

        for (int i = 0; i < sArr.length; i++) {
            answer[Integer.parseInt(sArr[i]) - 1]++;
        }

        for (int i = 0; i < answer.length; i++) {
            System.out.printf("%d ", answer[i]);
        }
    }
}
