package com.example.javaproject3.codeup.num1000;

import java.util.Scanner;

public class Codeup1098Method {
    private int[][] arr;
    private boolean printUserLineCheck = false;

    public Codeup1098Method(boolean printUserLineCheck) {
        this.printUserLineCheck = printUserLineCheck;
        this.arr = new int[5][5];
    }

    public Codeup1098Method(boolean printUserLineCheck,int rowCnt, int colCnt) {
        this.printUserLineCheck = printUserLineCheck;
        this.arr = new int[rowCnt][colCnt];
    }




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        Codeup1098Method codeup = new Codeup1098Method(true, row, col);
        Codeup1098Method codeup2 = new Codeup1098Method(false);
        int num = sc.nextInt();
        for (int i = 0; i < 3; i++) {
            int l = sc.nextInt();
            int d = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            codeup.setBeam(l, d, x, y);
        }

        codeup.printArr();

        codeup2.setBeam(2, 0, 1, 1);
        codeup2.setBeam(3, 1, 2, 3);
        codeup2.setBeam(4, 1, 2, 5);
        codeup2.printArr();

    }

    public void setBeam(int l, int d, int x, int y) {
        for (int i = 0; i < l; i++) {
            if (d == 0) {
                arr[x - 1][y + i - 1] = 1;
            } else {
                arr[x + i - 1][y - 1] = 1;
            }
        }
    }

    public void printArr() {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%d ", arr[i][j]);
            }
            System.out.println();
        }
        if(printUserLineCheck) {
            System.out.println("-----------------------------");
        }
    }
}
