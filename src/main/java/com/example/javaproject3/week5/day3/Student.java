package com.example.javaproject3.week5.day3;

public class Student {
    String name;
    int age;
    //클래스를 정의할 때 생성자를 생략하면 컴파일러가 자동으로 기본생성자를 생성해준다.
    //생성자 오버로딩 가능
    //오버로딩 : 같은 이름의 메소드 타입, 갯수를 다르게 만드는 것

    public Student() {

    }
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }


    private boolean 쇼츠() {
        return true;
    }
    private boolean 게임() {
        return true;
    }
    public void study(int i) {
        if (쇼츠() && 게임()) {
            System.out.println(i + "시간 공부함!");
        }
    }
}
