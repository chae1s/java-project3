package com.example.javaproject3.codeup.num1000;

import java.io.*;

public class Codeup1084 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");

        int red = Integer.parseInt(arr[0]);
        int green = Integer.parseInt(arr[1]);
        int blue = Integer.parseInt(arr[2]);
        int count = 0;

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int r = 0; r < red; r++) {
            for (int g = 0; g < green; g++ ) {
                String line = "";
                for (int b = 0; b < blue; b++) {
                    line += r + " " + g + " " + b + "\n";
                    count++;
                }
                bw.write(line);
                bw.flush();
            }
        }
        System.out.println(count);
    }
}
