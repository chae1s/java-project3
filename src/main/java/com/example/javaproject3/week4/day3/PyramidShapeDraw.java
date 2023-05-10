package com.example.javaproject3.week4.day3;

public class PyramidShapeDraw extends ShapeDrawer2{
    @Override
    public String makeALine(int height, int i) {
        return String.format("%s%s\n", " ".repeat(height - i - 1), "*".repeat(2 * i + 1));
    }

    public static void main(String[] args) {
        ShapeDrawer2 pyramid = new PyramidShapeDraw();
        pyramid.printShape(5);
    }
}
