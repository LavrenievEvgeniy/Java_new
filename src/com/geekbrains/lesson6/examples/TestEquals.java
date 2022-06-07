package com.geekbrains.lesson6.examples;

public class TestEquals {
    public static void main(String[] args) {

        Cat cat = new Cat("Maxim", "White", 3);
        Dog dog = new Dog("Jack", "Black", 5, "Husky");
        Duck duck = new Duck("Duck", "green", 7);
        sayVoice(cat);
        sayVoice(dog);
        sayVoice(duck);
    }


    private static void sayVoice(Animal animal) {
        animal.voice();
    }
}
