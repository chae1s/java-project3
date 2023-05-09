package com.example.javaproject3.week4.day2;

public class PyramidShapeDrawerTest {
    public static void main(String[] args) {
        ShapeDrawer shapeDrawer = new PyramidShapeDrawer();
        shapeDrawer.printShape(4);

        ShapeDrawer shapeDrawer1 = new ParallelogramShapeDrawer();
        shapeDrawer1.printShape(6);
    }

}