package com.example.javaproject3.week5.day3;

import java.util.ArrayList;
import java.util.List;

public class Buyer {
    // 캡슐화?
    // 객체의 내부 구조 및 데이터를 캡슐처럼 감싸 외부에서 직접 볼 수 없게 은닉 & 보호
    // 은닉하고 보호하는 방법 ? 클래스 내부에 변수, 메소드 만들고 접근 제어자를 지정하면 된다.
    private int money = 10000;
    private Product[] cart = new Product[20];
    List<Product> cartList = new ArrayList<>();
    private int cartIdx = 0;

    public int getMoney() {
        return money;
    }

    // 검증 가능
    public void setMoney(int money) {
        if (money > 0) {
            this.money = money;
        }
    }

    public void buy() {

    }

    public void buy(Product product) {
        if (money >= product.price) {
            this.money -= product.price;
            cartInsert(product);
        }

        System.out.println(money);
    }

    private void cartInsert(Product product) {
    //    this.cart[cartIdx++] = product;
        cartList.add(product);
    }


}
