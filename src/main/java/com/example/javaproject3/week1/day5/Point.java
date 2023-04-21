package com.example.javaproject3.week1.day5;

public class Point {
    int x;
    int y;

    boolean isSameXy() {
        return x == y;
    }

    double getDistance(Point point2) {
        int xLength = point2.x - this.x;
        int yLength = point2.y - this.y;

        double sumOfPpw = Math.pow(xLength, 2) + Math.pow(yLength, 2);
        double result = Math.sqrt(sumOfPpw);

        return result;
    }
}
