package com.example.javaproject3.programmers;

public class DiceGame {
    public static void main(String[] args) {
        System.out.println(solution(2, 6, 1));
    }

    public static int solution(int a, int b, int c) {
        int answer = 1;
        int index = 2;
        if (a != b && b != c && c != a) {
            index = 1;
        } else if (a == b && b == c) {
            index = 3;
        }

        for (int i = 1; i <= index ; i++) {
            answer *= Math.pow(a, i) + Math.pow(b, i) + Math.pow(c, i);
            System.out.println(Math.pow(a, i));
        }
        return answer;
    }
}
