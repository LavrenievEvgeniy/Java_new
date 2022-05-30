package com.geekbrains.lesson3.examples;

import java.util.Random;
import java.util.Scanner;

public class ConsoleExample {

    public static void main(String[] args) {
//        scannerExample();

        Random random = new Random();
        int min = random.nextInt(10);
        int max = random.nextInt(20);

        range(min, max);
    }

    public static void range(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        do {
            System.out.println("Введіть число від " + min + " до " + max);
            number = scanner.nextInt();
        } while (!(number >= min && number <= max));
        scanner.close();
    }
//    private static void scannerExample() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введіть строку");
//        String line = scanner.nextLine();
//        System.out.println("Користувач ввів строку "  + line);
//
//        System.out.println("Введіть число");
//        int a = scanner.nextInt();
//        System.out.println("Користувач ввіч число " + a);
}
