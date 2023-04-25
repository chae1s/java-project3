package com.example.javaproject3.week2.day2;

import java.util.Arrays;

public class ReferenceTypeArray {
    public static void main(String[] args) {
        float[] fArr = new float[5];
        String[] sArr = new String[5];
        int hexadecimal = 0xAF;
        System.out.println(hexadecimal);

        System.out.println(Arrays.toString(fArr));
        System.out.println(Arrays.toString(sArr));
    }
}
