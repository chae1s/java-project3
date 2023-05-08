package com.example.javaproject3.week4.day1;

public class RockPaperScissors {
    public String play(int user, int computer) {
        if (user == 0 && computer == 1) {
            return "win";
        } else if (user == 1 && computer == 2) {
            return "win";
        } else if (user == 2 && computer == 0) {
            return "win";
        } else if (user == computer) {
            return "tie";
        } else {
            return "lose";
        }
    }

    public String play2(int user, int computer) {
        //바위 = 0, 가위 = 1, 보 = 2
        int flag = user - computer;
        switch (flag) {
            case 0: return "tie";
            case -1: return "win";
            case 1, -2: return "lose";
            default: return "Error";
        }
    }

    public static void main(String[] args) {
        RockPaperScissors rockPaperScissors = new RockPaperScissors();
        System.out.println(rockPaperScissors.play(0, 2));
    }
}
