package com.example.javaproject3.week4.day3;

import java.io.IOException;

public class RightTrianglePrinter {

    private Printer printer;
    public RightTrianglePrinter(Printer printer) {
        this.printer = printer;
    }

    public String makeALine(int h, int i) {
        return String.format("%s\n", "*".repeat(i));
    }

    //파일에 출력하기

    public void printShape(int h) throws IOException {
        String[] lines = new String[h];
        for (int i = 0; i < h; i++) {
            lines[i] = makeALine(h, i + 1);
        }

        printer.print(lines);

    }


    public static void main(String[] args) throws IOException {
        RightTrianglePrinter triangle = new RightTrianglePrinter(new FilePrinter());
        triangle.printShape(7);
    }
}
