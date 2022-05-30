package com.geekbrains.lesson3.examples;

public class FormatExample {
    public static void main(String[] args) {
        int min = 10;
        int max = 20;
        String str = ", будь ласка";
        System.out.println("Введіть число от " + min + " до " + max + ", будь ласка");
        System.out.printf("Введіть число від %s до %d %s %n%n", min, max, str);

        double d = 0.225421924;
        System.out.printf("%.2f", d);

        String string = String.format("Введіть число від %s до %d %s %n%n", min, max, str);
        System.out.println(string + string + string);
    }
}
