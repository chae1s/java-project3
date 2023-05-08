package com.example.javaproject3.week4.day1;

import java.util.Random;
import java.util.Scanner;

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

    public int getRandRange(int from, int to) {
        Random ran = new Random();
        return from + ran.nextInt(to - from + 1);
    }

    public String getRockScissorPaper(int num) {
        return switch (num) {
            case 0 -> "바위";
            case 1 -> "가위";
            case 2 -> "보";
            default -> "ERROR";
        };
    }
    public int getRockScissorPaperNum(String str) {
        return switch (str) {
            case "바위" -> 0;
            case "가위" -> 1;
            case "보" -> 2;
            default -> 999;
        };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RockPaperScissors rps = new RockPaperScissors();
        int iRps;
        String playResult;
        System.out.println("이길때까지 하는 가위바위보 게임!");
        do {
            System.out.printf("가위 바위 보 중 하나를 내세요:");
            iRps = rps.getRockScissorPaperNum(sc.nextLine());
            playResult = rps.play(iRps, rps.getRandRange(0, 2));
            System.out.println(playResult);
        } while (!"win".equals(playResult));
    }
}
