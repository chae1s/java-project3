package com.example.javaproject3.likelion.generic;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        int firstItem = getFirstItem(intList);

        System.out.println(firstItem);
    }

    public static <T> T getFirstItem(List<T> list) {
        if (list.isEmpty()) {
            return null;
        }

        return list.get(0);
    }
}
