package com.example.javaproject3.week4.day3;

public class RightTriangleDraw{
    public static void main(String[] args) {
        int h = 5;
        RightTriangleDraw draw = new RightTriangleDraw();
        draw.printShape(h);
    }

    public String makeALine(int height, int i) {
        return String.format("%s\n", "*".repeat(i + 1));
    }
    public void printShape(int height) {
        for (int i = 0; i < height ; i++) {
            System.out.print(makeALine(height, i));
        }
    }

}
