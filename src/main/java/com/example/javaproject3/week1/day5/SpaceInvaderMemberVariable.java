package com.example.javaproject3.week1.day5;

public class SpaceInvaderMemberVariable {
    int location;   //멤버변수
    public void moveLeft(){
        location = location - 1;
    }

    public void moveRight(){
        location = location + 1;
    }

    public static void main(String[] args) {
        SpaceInvaderMemberVariable spaceInvaderMemberVariable = new SpaceInvaderMemberVariable();
        spaceInvaderMemberVariable.moveLeft();
        spaceInvaderMemberVariable.moveRight();
        spaceInvaderMemberVariable.moveRight();
        spaceInvaderMemberVariable.moveRight();
        spaceInvaderMemberVariable.moveRight();

        System.out.printf("최종 위치: %d\n", spaceInvaderMemberVariable.location);

        spaceInvaderMemberVariable.moveLeft();
        System.out.printf("최종 위치: %d\n", spaceInvaderMemberVariable.location);

    }
}
