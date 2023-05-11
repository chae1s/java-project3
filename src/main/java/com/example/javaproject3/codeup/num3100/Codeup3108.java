package com.example.javaproject3.codeup.num3100;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Student implements Comparable<Student> {
    private String code;
    private int testId;
    private String name;

    public Student(String code, int testId, String name) {
        this.code = code;
        this.testId = testId;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public int getTestId() {
        return testId;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Student student) {
        if (student.getTestId() < testId) {
            return 1;
        } else if (student.getTestId() > testId) {
            return -1;
        }
        return 0;
    }
}

public class Codeup3108 {
    private List<Student> students = new ArrayList<>();

    public Student makeAStudent(String code, int testId, String name) {
        return new Student(code, testId, name);
    }

    public void codeCheck(String code, int testId, String name) {
        Student student = new Student(code, testId, name);
        switch (student.getCode()) {
            case "I":
                addAStudent(student);
                break;
            case "D":
                deleteAStudent(student);

                break;
        }
    }

    private boolean isExist(Student pStudent) {
        for (Student student : students) {
            if (pStudent.getTestId() == student.getTestId()) {
                return true;
            }
        }

        return false;
    }

    private void addAStudent(Student student) {
        System.out.println("추가");
        if (!isExist(student)) {
            students.add(student);
        }
        printStudent();
    }

    private void deleteAStudent(Student pStudent) {
        int index = -1;
        System.out.println("삭제");
        for (Student student : students) {
            if (pStudent.getTestId() == student.getTestId()) {
                System.out.println("일치");
                System.out.println(student.getName());
                index = students.indexOf(student);
            }
        }
        if (index >= 0) students.remove(index);
        printStudent();
    }

    public void printStudent() {
        for (Student student : students) {
            System.out.printf("%d %s\n", student.getTestId(), student.getName());
        }
        System.out.println("-------------------------");
    }
    public void printStudent(int i) {
        System.out.printf("%d %s\n", students.get(i).getTestId(), students.get(i).getName());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Codeup3108 codeup = new Codeup3108();
        for (int i = 0; i < num; i++) {
            codeup.codeCheck(sc.next(), sc.nextInt(), sc.next());
        }
        Collections.sort(codeup.students);

        for (int i = 0; i < 5; i++) {
            codeup.printStudent(sc.nextInt() - 1);
        }
    }
}
