package com.example.javaproject3.week5.day3;

public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student();
        Student student2 = new Student("마루", 5);
        System.out.println(student2.name);
        student.study(5);
    }
}
