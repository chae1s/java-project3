package com.example.javaproject3.week4.day4;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadFileEx {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\Users\\user\\Desktop\\project\\documents\\hospital.csv"), "EUC-KR"));
        System.out.println(br.readLine());
    }

}
