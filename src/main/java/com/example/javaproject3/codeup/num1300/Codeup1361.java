package com.example.javaproject3.codeup.num1300;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Codeup1361 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < i ; j++) {
                bw.append(" ");
            }
            bw.append("**\n");
            bw.flush();
        }
        bw.close();
    }
}
