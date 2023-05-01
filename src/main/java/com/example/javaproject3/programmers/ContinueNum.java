package com.example.javaproject3.programmers;

public class ContinueNum {
    public static void main(String[] args) {
        int[] num_list = {3, 4, 5, 2, 1};
        solution(num_list);
    }

    public static int solution(int[] num_list) {
        int answer = 0;
        int even = 0;
        int odd = 0;
        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] % 2 == 0) {
                even = even * 10 + num_list[i];
            } else {
                odd = odd * 10 + num_list[i];
            }
        }
        answer = even + odd;

        return answer;
    }
}
