package com.example.javaproject3.week1.day5;

public class SpaceInvader {
    private void moveLeft(){
        int location = 0;
        location = location - 1;
        System.out.printf("move left: %d\n", location);
    }

    private void moveRight(){
        int location = 0;
        location = location + 1;
        System.out.printf("move right: %d\n", location);
    }

    public static void main(String[] args) {
        SpaceInvader spaceInvader = new SpaceInvader();
        spaceInvader.moveLeft();
        spaceInvader.moveRight();
        spaceInvader.moveRight();
        spaceInvader.moveRight();
        spaceInvader.moveRight();
    }
}
