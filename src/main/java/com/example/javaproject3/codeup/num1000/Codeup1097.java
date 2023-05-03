package com.example.javaproject3.codeup.num1000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Codeup1097 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] goBoard = new int[19][19];
        for (int i = 0; i < goBoard.length; i++) {
            String[] sArr = br.readLine().split(" ");
            for (int j = 0; j < goBoard[i].length; j++) {
                goBoard[i][j] = Integer.parseInt(sArr[j]);
            }
        }
        int num = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < num; i++) {
            String[] sArr = br.readLine().split(" ");
            int x = Integer.parseInt(sArr[0]);
            int y = Integer.parseInt(sArr[1]);
            for (int j = 0; j < goBoard[x - 1].length; j++) {
                goBoard[x - 1][j] = 1 - goBoard[x - 1][j];
            }
            for (int j = 0; j < goBoard.length; j++) {
                goBoard[j][y - 1] = 1 - goBoard[j][y - 1];
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
