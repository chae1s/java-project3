package com.example.javaproject3.week1.day5;

public class PointTest {
    public static void main(String[] args) {
        Point point1 = new Point();
        point1.x = 10;
        point1.y = 20;

        System.out.printf("Point : (%d, %d)\n", point1.x, point1.y);
        System.out.printf("xy 같은가? %s\n", point1.isSameXy());

        Point point2 = new Point();
        point2.x = 1;
        point2.y = 1;

        System.out.printf("Point : (%d, %d)\n", point2.x, point2.y);
        System.out.printf("xy 같은가? %s\n", point2.isSameXy());

        Point point3 = new Point();
        point3.x = 3;
        point3.y = 2;
        System.out.printf("Point : (%d, %d)\n", point3.x, point3.y);
        System.out.printf("xy 같은가? %s\n", point3.isSameXy());
    }
}
