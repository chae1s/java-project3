package com.example.javaproject3.week3.day1;

public class NewSwitchCaseHospitalTime {
    public static void main(String[] args) {
        String day = "월";
        String time = switch (day) {
            case "월", "화", "수", "금" -> "09:30-18:30";
            case "목", "토" -> "09:30-13:00";
            case "일" -> "휴진";
            default -> throw new IllegalArgumentException("잘못된 요일 : " + day);
        };

        System.out.println(time);
    }
}
