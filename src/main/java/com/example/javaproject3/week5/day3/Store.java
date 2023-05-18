package com.example.javaproject3.week5.day3;

public class Store {
    public static void main(String[] args) {
        // getter / setter 사용은 지양하는 게 좋다.
        // 특히 setter는 사용안하는 게 좋음

        // 다형성 ? 여러 가지 형태를 가질 수 있는 능력
        // 오버로딩은 하나의 객체에서 이름이 같은 메소드를 여러 개 정의하여 사용하는 것
        // 오버라이딩은 상속을 받은 하위 객체가 상위 객체의 메소드를 새롭게 정의하고 그대로 덮어쓰고 사용하는 것
        // 상속의 다형성 - 부모 타입 변수로 자식 타입 객체를 다루는 것이다.
        Buyer buyer = new Buyer();
        System.out.println(buyer.getMoney());

        TV tv = new TV(2000);
        Computer computer = new Computer(10000);
        // 업 캐스팅
        Product pTv = new TV(3000);
        Product pComputer = new Computer(4000);

        System.out.println(tv);
        System.out.println(computer);

        // 다운 캐스팅
//      ((TV) pTv).test();
        buyer.buy(pTv);
        buyer.buy(pComputer);

        //바이어가 구매하면 장바구니로 상품 목록이 생성이 되어야 한다.
        System.out.println(buyer.cartList);

    }
}
