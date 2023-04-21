package com.example.javaproject3.week1.day5;

public class UserTest {
    public static void main(String[] args) {
        User cheese = new User();
        cheese.name = "cheese";
        cheese.phoneNumber = "010-1234-1234";
        cheese.age = 20;

        User choonsik = new User();
        choonsik.name = "choonsik";
        choonsik.phoneNumber = "010-1212-1212";
        choonsik.age = 10;

        System.out.printf("%s님은 성인입니까? : %s\n", cheese.name, cheese.isAdult());
        System.out.printf("%s님은 성인입니까? : %s\n", choonsik.name, choonsik.isAdult());

    }
}
