package com.geekbrains.lesson2.examples;

public class Loop {
    public static void main(String[] args) {
        int a = 2;
        int b = a * a * a;
        System.out.println(b);

        int powResult = pow(2, 3);
        System.out.println(powResult);
    }

    public static int pow(int a, int b) {
        int result = 1;
        for (int i = 0; i < b; i++) {
            int c = a * a;
            result *= a;
            System.out.println("Выполняется итерация цикла для счетчика i = " + i);
        }
        return result;
    }
}



