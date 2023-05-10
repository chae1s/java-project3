package com.example.javaproject3.week4.day3;

public abstract class ShapeDrawer2 {
    public abstract String makeALine(int height, int i);

    public void printShape(int height) {
        for (int i = 0; i < height; i++) {
            System.out.print(makeALine(height, i));
        }
    }
}
