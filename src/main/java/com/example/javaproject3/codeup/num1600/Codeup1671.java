package com.example.javaproject3.codeup.num1600;

import java.util.Scanner;

public class Codeup1671 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // (※ 바위=0, 가위=1, 보=2를 말한다.)
        Codeup1671 codeup1671 = new Codeup1671();
        int me = sc.nextInt();
        int computer = sc.nextInt();

        String result = codeup1671.game(me, computer);

        System.out.println(result);
    }

    public String game(int me, int computer) {
        //바위 = 0, 가위 = 1, 보 = 2
        int check = me - computer;
        switch (check) {
            case 0: return "tie";
            case -1, 2: return "win";
            default: return "lose";
        }
    }
}
