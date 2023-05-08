package com.example.javaproject3.codeup.num1300;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Codeup1355 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = sc.nextInt();
        for (int i = 0; i < num ; i++) {
            for (int j = 0; j < i; j++) {
                bw.append(" ");
            }
            for (int j = 0; j < num - i; j++) {
                bw.append("*");
            }
            bw.append("\n");
            bw.flush();
        }
        bw.close();
    }
}
