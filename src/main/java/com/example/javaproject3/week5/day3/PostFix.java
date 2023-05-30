package com.example.javaproject3.week5.day3;

import java.util.Stack;

public class PostFix {
    private Stack<String> stack = new Stack<>();
    private StringBuilder expression = new StringBuilder();

    public String stackInput(String[] arr) {
        for (String str : arr) {
            switch (str) {
                case "(" -> stack.push(str);
                case "+", "-", "*", "/" -> stack.push(str);
                case ")" -> expression.append(stack.pop());
                default -> expression.append(str);
            }
        }

        return expression.toString();
    }

    public void priorityCheck(String str) {
        if (stack.isEmpty()) stack.push(str);


    }
    public static void main(String[] args) {
        String str = "A + B * (C - D) / E";
        String[] arr = str.replaceAll(" " ,"").split("");
        PostFix postFix = new PostFix();
        postFix.stackInput(arr);
        for (String temp : postFix.stack) {
            System.out.println(temp);
        }
        System.out.println(postFix.expression);

    }


}
