package com.example.javaproject3.codeup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Codeup1073 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");

        for (int i = 0; i < arr.length; i++) {
            if (Integer.parseInt(arr[i]) == 0){
                break;
            }
            System.out.println(Integer.parseInt(arr[i]));
        }
    }
}
