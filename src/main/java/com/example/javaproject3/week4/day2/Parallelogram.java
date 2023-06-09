package com.example.javaproject3.week4.day2;

public class Parallelogram {
    private String spaceChar = " ";
    public Parallelogram(String spaceChar) {
        this.spaceChar = spaceChar;
    }

    public String makeParallelogramALine(int height, int i) {
        return String.format("%s%s", spaceChar.repeat(height - i), "*".repeat(height));
    }

    public void printPyramid(int height) {
        for (int i = height; i > 0; i--) {
            System.out.println(makeParallelogramALine(height, i));
        }
    }
    /*
        반복 로직 + 핵심 로직 + 출력 로직 -> Coupling
        결합이 되어 있다 -> 강결합
        느슨한 결합(Loosely Coupling)으로 만들어 주는 것이 리팩토링
     */
    public static void main(String[] args) {
        int height = 5;
        Parallelogram reversePyramid = new Parallelogram(" ");
        reversePyramid.printPyramid(height);
    }
}
