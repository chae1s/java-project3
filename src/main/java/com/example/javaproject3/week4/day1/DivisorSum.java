package com.example.javaproject3.week4.day1;

public class DivisorSum {
    public int sumOfFactors(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        return sum;
    }

    void printResult(int num) {
        System.out.printf("%d의 약수의 합은 %d 입니다.\n", num, sumOfFactors(num));
    }

    public static void main(String[] args) {
        DivisorSum divisorSum = new DivisorSum();
        divisorSum.printResult(12);
        divisorSum.printResult(36);
        divisorSum.printResult(48);
        divisorSum.printResult(29);
    }
}
