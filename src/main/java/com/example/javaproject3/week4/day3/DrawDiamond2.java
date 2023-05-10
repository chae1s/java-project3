package com.example.javaproject3.week4.day3;

import java.io.IOException;

public class DrawDiamond2 {

    public static String getRepeatedSymbol(String symbol, int n) {
        return symbol.repeat(n);
    }

    public static String getRepeatedSymbolFor(String symbol, int n) {
        String result = "";
        for (int i = 0; i < n; i++) {
            result += symbol;
        }
        return result;
    }

    public static String makeALine(int h, int i) {
        int pivot = h / 2;
        if (i <= pivot) {
            return String.format("%s%s\n", getRepeatedSymbolFor("0", pivot - i), getRepeatedSymbolFor("*", 2 * i + 1));
        } else {
            return String.format("%s%s\n", getRepeatedSymbol("0", i - pivot), getRepeatedSymbol("*", 2 * (h - i) - 1));
        }

    }

    public static void main(String[] args) throws IOException {
        int h = 7;
        int pivot = h / 2;

        for (int i = 0; i < h; i++) {
            System.out.print(makeALine(h, i));
        }
    }
}
