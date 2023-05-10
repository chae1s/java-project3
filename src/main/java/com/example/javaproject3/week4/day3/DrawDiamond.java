package com.example.javaproject3.week4.day3;

public class DrawDiamond {

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
    public static void main(String[] args) {
        int h = 7;
        int pivot = h / 2;
        for (int i = 0; i < h; i++) {
            if (i <= pivot) {
                System.out.printf("%s%s\n", getRepeatedSymbolFor("0", pivot - i), getRepeatedSymbolFor("*", 2 * i + 1));
            } else {
                System.out.printf("%s%s\n", getRepeatedSymbol("0", i - pivot), getRepeatedSymbol("*", 2 * (h - i) - 1));
            }
        }
    }
}
