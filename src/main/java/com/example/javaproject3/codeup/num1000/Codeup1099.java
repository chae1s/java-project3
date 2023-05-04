package com.example.javaproject3.codeup.num1000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Codeup1099 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] antHouse = new int[10][10];
        for (int i = 0; i < 10; i++) {
            String[] sArr = br.readLine().split(" ");
            for (int j = 0; j < 10; j++) {
                antHouse[i][j] = Integer.parseInt(sArr[j]);
            }
        }

        boolean ate = false;
        int i = 1;
        int j = 1;
        while (i < 10) {
            while(j < 10) {
                if(antHouse[i][j] == 0) {
                    antHouse[i][j] = 9;
                    j++;
                } else if (antHouse[i][j] == 1) {
                    j--;
                    i++;
                    break;
                } else if(antHouse[i][j] == 2) {
                    antHouse[i][j] = 9;
                    ate = true;
                    break;
                }
            }

            if (ate) {
                break;
            }
        }

        print(antHouse);
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
