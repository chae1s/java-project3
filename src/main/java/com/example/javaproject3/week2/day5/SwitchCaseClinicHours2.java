package com.example.javaproject3.week2.day5;

public class SwitchCaseClinicHours2 {
    public static void main(String[] args) {
        String day = "월";
        String time = "휴진";
        switch (day) {
            case "월", "화", "수", "금": time = "09:30-18:30"; break;
            case "목", "토": time = "09:30-13:00"; break;
            case "일": time = "휴진"; break;
        }

        System.out.printf("%s요일은 %s 입니다.", day, time);
    }
}
