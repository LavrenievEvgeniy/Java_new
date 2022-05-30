package com.geekbrains.lesson2.examples;

public class SwitchExample {
    public static void main(String[] args) {
        printMonthByNumberSwitch(2);
        Month month = Month.JAN;

        switch (month) {
            case APR -> System.out.println("4");
            case JUN -> System.out.println("6");

        }
    }

    private static String printMonthByNumberSwitch(int numberOfMonth) {
        return switch (numberOfMonth) {
            case 1 -> "jan";
            case 2 -> "feb";
            case 3 -> "mar";
            case 4 -> "apr";
            case 5 -> "may";
            case 6 -> "jun";
            default -> "X3";
        };
    }
}
