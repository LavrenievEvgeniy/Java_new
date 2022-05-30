package com.geekbrains.lesson1.examples.conditions;

public class Conditions2 {
    public static void main(String[] args) {
        int currentTemperature = 20;

        if (currentTemperature > 35) {
            System.out.println("Жарко");
        } else if (currentTemperature > 20) {
            System.out.println("более менее");
        } else if (currentTemperature < 10) {
            System.out.println("Холодно");
        } else {
            System.out.println("Норм");
        }
        if (currentTemperature == 20) {
            System.out.println("123");
            System.out.println("123");
        }
    }
}