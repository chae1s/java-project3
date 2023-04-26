package com.example.javaproject3.week2.day3;

public class ClassInSchoolTest {
    public static void main(String[] args) {
        ClassInSchool classInSchool = new ClassInSchool();
        classInSchool.no = 1;
        classInSchool.teacher = new Teacher();
        classInSchool.teacher.id = 1L;
        classInSchool.teacher.name = "김춘식";
        classInSchool.teacher.age = 30;
        classInSchool.teacher.address = "서울 종로구";
        classInSchool.students = new Student[30];

        System.out.printf("%d반 담임 선생님 성함은 %s입니다.\n", classInSchool.no, classInSchool.teacher.name);

    }
}
