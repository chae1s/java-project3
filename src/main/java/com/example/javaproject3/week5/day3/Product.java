package com.example.javaproject3.week5.day3;

public abstract class Product {
    // 추상화 - 일반 클래스 vs 추상클래스
    // 추상 클래스 : 객체 생성 불가능, 자식클래스에게 추상 메소드 구현을 강제한다.
    // 추상 클래스는 is-a, 인터페이스는 has-a
    int price;
    boolean power;

    public Product(int price) {
        this.price = price;
    }

    public void power() {
        this.power = !power;
    }

    abstract void print();

    @Override
    public String toString() {
        return "Product{" +
                "price=" + price +
                ", power=" + power +
                '}';
    }
}
