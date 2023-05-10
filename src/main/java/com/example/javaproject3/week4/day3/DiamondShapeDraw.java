package com.example.javaproject3.week4.day3;

public class DiamondShapeDraw extends ShapeDrawer2{

    @Override
    public String makeALine(int height, int i) {
        int pivot = height / 2;
        if (i <= pivot) {
            return String.format("%s%s\n", getRepeatedSymbol(" ", pivot - i), getRepeatedSymbol("*", 2 * i + 1));
        } else {
            return String.format("%s%s\n", getRepeatedSymbol(" ", i - pivot), getRepeatedSymbol("*", 2 * (height - i) - 1));
        }
    }

    public static String getRepeatedSymbol(String symbol, int n) {
        return symbol.repeat(n);
    }

    public static void main(String[] args) {
        ShapeDrawer2 diamond = new DiamondShapeDraw();
        diamond.printShape(5);
    }
}
