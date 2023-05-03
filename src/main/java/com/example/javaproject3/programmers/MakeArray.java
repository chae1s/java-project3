package com.example.javaproject3.programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MakeArray {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(solution(10, 20)));
    }

    public static int[] solution(int l, int r) {
        List<Integer> list = new ArrayList<>();
        boolean flag = true;
        for (int i = l; i <= r; i++) {
            int num = i;
            while (num > 0) {
                int remainder = num % 10;

                if (remainder % 5 != 0) {
                    flag = false;
                    break;
                }
                num /= 10;
                flag = true;
            }
            if (flag) {
                list.add(i);
            }
        }
        int[] answer = new int[list.size()];
        if (list.isEmpty()) {
            answer = new int[]{-1};
            return answer;
        }
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}
