package com.example.javaproject3.codeup.num1000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Codeup1086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");

        int width = Integer.parseInt(arr[0]);
        int height = Integer.parseInt(arr[1]);
        int bit = Integer.parseInt(arr[2]);

        float mb = (width * height * bit) / 8.0f / 1024 / 1024;
        System.out.printf("%.2f MB\n", mb);
    }
}
