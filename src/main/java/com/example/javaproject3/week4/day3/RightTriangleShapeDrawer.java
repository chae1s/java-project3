package com.example.javaproject3.week4.day3;

public class RightTriangleShapeDrawer extends ShapeDrawer2 {
    @Override
    public String makeALine(int height, int i) {
        return String.format("%s\n","*".repeat(i + 1));
    }


    public static void main(String[] args) {
        ShapeDrawer2 rightTriangle = new RightTriangleShapeDrawer();
        rightTriangle.printShape(5);
    }
}
