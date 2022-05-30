package com.geekbrains.lesson1.examples.conditions;

public class Conditions {
    public static void main(String[] args) {
        int currentTemperature = 20;

        boolean checkTemp = currentTemperature > 35;

        if (!checkTemp){
            System.out.println("Жарко");
        } else {
            System.out.println("Норм");
        }
        System.out.println("окончание программы");

        int a =5;
        if ((a >= 0) && (a <= 20)) {
            System.out.println ("между");
        }
    }
}
