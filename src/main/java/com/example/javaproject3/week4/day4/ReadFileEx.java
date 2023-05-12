package com.example.javaproject3.week4.day4;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;

public class ReadFileEx {
    public List<String> getLines(String fileName) throws IOException {
        List<String> lines = new LinkedList<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(fileName), "EUC-KR"));
        String line;
        while ((line = br.readLine()) != null) {
            lines.add(line);
        }

        return lines;
    }

    /* 인코딩된 파일 사용해야 함 */
    public List<String> getLinesNewReader(String fileName) throws IOException {
        List<String> lines = new LinkedList<>();
        try(BufferedReader br = Files.newBufferedReader(
                Paths.get(fileName), StandardCharsets.UTF_8)){

            String line;
            while ((line = br.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return lines;
    }

    public static void main(String[] args) throws IOException {
        ReadFileEx readFile = new ReadFileEx();
        List<String> result = readFile.getLines("C:\\Users\\user\\Desktop\\project\\documents\\hospital.csv");
        for (int i = 0; i < 11; i++) {
            System.out.println(result.get(i));
        }
    }

}
