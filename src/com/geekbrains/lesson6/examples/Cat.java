package com.geekbrains.lesson6.examples;

public class Cat extends Animal {

    public Cat(String name, String color, int age) {
        super(name, color, age);
    }

    public void play(){
        System.out.println("Cat is playing");
    }
    public void sleep(){
        System.out.println("Cat is sleeping");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public void voice() {
        System.out.println("Cat's voice is meow");
    }
}
