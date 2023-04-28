package com.example.javaproject3.programmers;

public class Collatz {
    public static void main(String[] args) {
        int answer = solution(626331);
        System.out.println(answer);
    }

    public static int solution(int num) {
        int answer = 0;
        long longNum = num;
        while (longNum != 1) {
            if (answer == 500) {
                return -1;
            }

            if (longNum % 2 == 0) {
                longNum /= 2;
            } else {
                longNum = (longNum * 3) + 1;
            }

            answer++;
        }
        return answer;
    }
}
