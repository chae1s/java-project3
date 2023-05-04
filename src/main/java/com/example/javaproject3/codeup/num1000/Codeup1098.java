package com.example.javaproject3.codeup.num1000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Codeup1098 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arrSize = br.readLine().split(" ");
        int height = Integer.parseInt(arrSize[0]);
        int width = Integer.parseInt(arrSize[1]);

        int[][] goBoard = new int[height][width];

        int num = Integer.parseInt(br.readLine());
        for (int i = 0; i < num; i++) {
            String[] sArr = br.readLine().split(" ");
            int space = Integer.parseInt(sArr[0]);
            int direction = Integer.parseInt(sArr[1]);
            int x = Integer.parseInt(sArr[2]);
            int y = Integer.parseInt(sArr[3]);

            if (direction == 0) {
                for (int j = 0; j < space; j++) {
                    goBoard[x - 1][y + j - 1]++;
                }
            } else {
                for (int j = 0; j < space ; j++) {
                    goBoard[x + j - 1][y - 1]++;
                }
            }
        }

        print(goBoard);
    }

    public static void print(int[][] goBoard) {
        for (int i = 0; i < goBoard.length; i++) {
            for (int j = 0; j < goBoard[i].length; j++) {
                System.out.printf("%d ", goBoard[i][j]);
            }
            System.out.println();
        }
    }
}
