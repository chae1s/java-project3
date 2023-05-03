package com.example.javaproject3.codeup.num1000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Codeup1095 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        String[] sArr = br.readLine().split(" ");
        int min = Integer.parseInt(sArr[0]);

        for (int i = 0; i < sArr.length; i++) {
            int iVal = Integer.parseInt(sArr[i]);
            if (min > iVal) {
                min = iVal;
            }
        }

        System.out.println(min);
    }
}
