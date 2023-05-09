package com.example.javaproject3.week4.day2;

public class Pyramid2 {
    private String spaceChar = "0";

    public Pyramid2(String spaceChar) {
        this.spaceChar = spaceChar;
    }
    /*
        기능 분리
        - 1.print하는 기능 2. 1줄 만드는 기능 3.반복하는 기능
     */
    public String makeALine(int height, int i) {
        return String.format("%s%s", spaceChar.repeat(height - i - 1), "*".repeat(2 * i + 1));
    }

    public static void main(String[] args) {
        int height = 4;
        Pyramid2 pyramid2 = new Pyramid2("0");
        pyramid2.printPyramid(height);
        Pyramid2 pyramid = new Pyramid2(" ");
        pyramid.printPyramidWithSpaceChar(height);
    }

    public void printPyramidWithSpaceChar(int height) {
        for (int i = 0; i < height; i++) {
            System.out.println(makeALine(height, i));
        }
    }
    // 기능 3가지
    public void printPyramid(int height) {
        for (int i = 0; i < height; i++) {
            System.out.printf("%s%s\n", spaceChar.repeat(height - i - 1), "*".repeat(2 * i + 1));
        }
    }

}
