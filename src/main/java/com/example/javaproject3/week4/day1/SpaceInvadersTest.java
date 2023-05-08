package com.example.javaproject3.week4.day1;

public class SpaceInvadersTest {
    public static void main(String[] args) {
        SpaceInvaders si = new SpaceInvaders();
        si.moveLeft();
        System.out.println(si.location);
        si.moveLeft();
        System.out.println(si.location);
    }
}
