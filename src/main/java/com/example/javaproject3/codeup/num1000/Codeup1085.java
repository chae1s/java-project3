package com.example.javaproject3.codeup.num1000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Codeup1085 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");

        int hz = Integer.parseInt(arr[0]);
        int bit = Integer.parseInt(arr[1]);
        int channel = Integer.parseInt(arr[2]);
        int sec = Integer.parseInt(arr[3]);

        double mb = ((double)hz * bit * channel * sec) / 8 / 1024 / 1024;

        System.out.printf("%.1f MB\n", mb);
    }
}
