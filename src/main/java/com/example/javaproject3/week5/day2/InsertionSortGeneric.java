package com.example.javaproject3.week5.day2;

import java.util.Arrays;

public class InsertionSortGeneric<T extends Comparable<T>> {
    public T[] sort(T[] arr, boolean isAscending) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                System.out.printf("i: %d, j: %d, j-1 : %d\n", i, j, j - 1);
                if ((isAscending ? arr[j].compareTo(arr[j - 1]) : arr[j - 1].compareTo(arr[j])) > 0) {
                    T temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                } else {
                    break;
                }
            }
        }
        return arr;
    }
    public T[] sort(T[] arr) {

        return sort(arr, true);
    }
    public static void main(String[] args) {
        int[] arr = {7, 2, 3, 9, 28, 11};
        Character[] cArr = {'f', 'e', 'g', 'a', 'c'};
        InsertionSortGeneric<Character> sort02 = new InsertionSortGeneric<>();
        System.out.println(Arrays.toString(sort02.sort(cArr, false)));
    }
}
