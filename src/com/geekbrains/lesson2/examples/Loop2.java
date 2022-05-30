package com.geekbrains.lesson2.examples;

import java.lang.ref.SoftReference;
import java.util.SplittableRandom;

public class Loop2 {
    public static void main(String[] args) {

        anotherLoop();
        enhancedLoop();

    }

    private static void anotherLoop() {
        System.out.println("Variant 1");
        int counter = 10;
        while (counter < 5) {
            System.out.println(counter);
            counter++;
        }

        System.out.println("Variant 2");

        int anotherCounter = 10;
        do {
            System.out.println(anotherCounter);
            anotherCounter++;
        } while (anotherCounter < 5);
    }
//
//    }
//
//
//    public static void innerLoop() {
//        int counter = 0;
//        outer:
//        {
//            for (int i = 0; i < 5; i++) {
//                for (int j = 0; j < 5; j++) {
//                    if (i == 3 && j == 3) {
//                        break outer;
//                    }
//                    System.out.println("i = " + i + ", j = " + j);
//                    counter++;
//                }
//                System.out.println();
//            }
//        }
//        System.out.println("Общее количество итераций = " + counter);
//
//    }
//          for (int i = 0; i < 20; i += 5) {
//            System.out.println(i);
//        }
//        for (int i = 5; i > 0; i--) {
//            System.out.println(i);
//        }
//        for (int i = 0; i < 10; i ++) {
//            if (i % 2 != 0){
//                continue;
//            }
//            System.out.println(i);

    public static void enhancedLoop() {
        String[] array = new String[]{"first", "second", "third"};
        for (String currentString : array) {
            System.out.println(currentString);
        }
    }
}





