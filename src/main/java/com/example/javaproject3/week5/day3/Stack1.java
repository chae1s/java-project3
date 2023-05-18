package com.example.javaproject3.week5.day3;

import java.util.Arrays;

public class Stack1 {
    private int[] arr = new int[10000];
    private int pointer = 0;

    public void push(int value) {
        this.arr[pointer++] = value;
        System.out.println(Arrays.toString(arr));
    }

    public int pop() {
        if(isEmpty()) throw new RuntimeException("스택이 비었습니다.");

        return this.arr[--pointer];
    }

    public boolean isEmpty() {
        return this.pointer == 0;
    }

    public int peek() {

        return this.arr[pointer - 1];
    }

    public static void main(String[] args) {
        Stack1 stack1 = new Stack1();
        stack1.push(10);
        stack1.push(20);
        System.out.println(stack1.peek());
        System.out.println(stack1.peek());
        System.out.println(stack1.pop());
        System.out.println(stack1.peek());
    }
}
