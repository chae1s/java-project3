package com.example.javaproject3.week4.day4;

class UserTest {
    public static void main(String[] args) {
        User user1 = new User();
        user1.setName("춘식");
        user1.setAge(20);

        User user2 = new User();
        user2.setName("춘배");
        user2.setAge(37);

        System.out.printf("%s는 어른인지? %b\n", user1.getName(), user1.isAdult());
        System.out.printf("%s는 어른인지? %b\n", user2.getName(), user2.isAdult());

    }
}