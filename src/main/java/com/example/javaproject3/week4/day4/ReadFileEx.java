package com.example.javaproject3.week4.day4;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
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

    public List<String> getLinesFileReader(String fileName) throws IOException {
        List<String> lines = new LinkedList<>();

        BufferedReader br = new BufferedReader(new FileReader(fileName, Charset.forName("EUC-KR")));
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

    public Hospital parse(String str) {
        String[] splitted = str.split(",");
        Address address = new Address(splitted[10], splitted[5], splitted[7]);
        Hospital hospital = new Hospital(splitted[1], splitted[11], address);
        return hospital;
    }

    public List<Hospital> getHospitals(List<String> lines) {
        List<Hospital> hospitals = new ArrayList<>();
        for (String line : lines) {
            hospitals.add(parse(line));
        }

        return hospitals;
    }

    public static void main(String[] args) throws IOException {
        ReadFileEx readFile = new ReadFileEx();
        List<String> strLines = readFile.getLinesFileReader("C:\\Users\\user\\Desktop\\project\\documents\\hospital_info_0920.csv");
        List<Hospital> hospitals = readFile.getHospitals(strLines);
        System.out.println(hospitals.get(0).getName());
    }

}
