package com.geekbrains.lesson3.examples;

public class OverloadExample {

    public static void main(String[] args) {

        int[] ints = new int[]{1,2};
        int sum = sum("test string",ints);
        System.out.println(sum);

    }

    public static int sum(String str, int... ints) {
        int result = 0;
        for (int i = 0; i < ints.length; i++) {
            System.out.println(str);
            result += ints[i];
        }
        return result;
    }
}


