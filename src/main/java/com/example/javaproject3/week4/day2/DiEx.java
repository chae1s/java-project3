package com.example.javaproject3.week4.day2;

public class DiEx {
    private ShapeDrawer shapeDrawer;
    private ParallelogramShapeDrawer parallelogramShapeDrawer;

    public DiEx(ShapeDrawer shapeDrawer) {
        this.shapeDrawer = shapeDrawer;
    }

//    public DiEx(ParallelogramShapeDrawer parallelogramShapeDrawer) {
//        this.parallelogramShapeDrawer = parallelogramShapeDrawer;
//    }

    public void doSth() {
        shapeDrawer.printShape(5);
    }
}
