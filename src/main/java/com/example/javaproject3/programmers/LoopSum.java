package com.example.javaproject3.programmers;

public class LoopSum {
    public static void main(String[] args) {
        System.out.println(solution(687));
    }

    public static int solution(int n) {
        int answer = 0;
        while (n > 0) {
            answer += n % 10;
            n /= 10;
        }

        return  answer;
    }
}
