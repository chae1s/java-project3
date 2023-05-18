package com.example.javaproject3.week5.day3;

public class TV extends Product {

    public TV(int price) {
        super(price);
    }

    @Override
    void print() {
        System.out.println("TV");
    }

    public void test() {
        System.out.println("TV 테스트");
    }
}
