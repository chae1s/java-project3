package com.example.javaproject3.week4.day2;

public class Pyramid2 {
    private String spaceChar = "0";

    public Pyramid2(String spaceChar) {
        this.spaceChar = spaceChar;
    }
    public static void main(String[] args) {
        int height = 4;
        Pyramid2 pyramid2 = new Pyramid2("0");
        pyramid2.printPyramid(height);
        Pyramid2 pyramid = new Pyramid2(" ");
        pyramid.printPyramid(height);
    }

    public void printPyramid(int height) {
        for (int i = 0; i < height; i++) {
            System.out.printf("%s%s\n", spaceChar.repeat(height - i - 1), "*".repeat(2 * i + 1));
        }
    }

}
