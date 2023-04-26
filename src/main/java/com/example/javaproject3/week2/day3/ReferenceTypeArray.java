package com.example.javaproject3.week2.day3;

public class ReferenceTypeArray {
    public static void main(String[] args) {
        Student[] students = new Student[2];

        students[0] = new Student();
        students[0].name = "Choonsik";
        students[0].phoneNumber = "010-1234-5678";
        students[0].age = 21;
        students[1] = new Student();
        students[1].name = "Maru";
        students[1].phoneNumber = "010-4567-8912";
        students[1].age = 5;



    }
}
