package com.geekbrains.lesson2.examples;

public class Codeblock {
    public static void main(String[] args) {
        int a = 0;
        test(4);
        {
            int b = 15;
            System.out.println(b);
        }
    }

    public static void test(int a) {
        a = 4;
    }
}

