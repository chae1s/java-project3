package com.example.javaproject3.codeup.num1000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Codeup1096 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] goBoard = new int[19][19];
        int num = Integer.parseInt(br.readLine());
        for (int i = 0; i < num; i++) {
            String[] sArr = br.readLine().split(" ");
            int x = Integer.parseInt(sArr[0]);
            int y = Integer.parseInt(sArr[1]);

            goBoard[x-1][y-1] = 1;
        }

        for (int i = 0; i < goBoard.length; i++) {
            for (int j = 0; j < goBoard[i].length; j++) {
                System.out.printf("%d ", goBoard[i][j]);
            }
            System.out.println();
        }
    }
}
