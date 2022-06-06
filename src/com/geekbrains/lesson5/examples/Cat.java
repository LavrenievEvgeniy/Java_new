package com.geekbrains.lesson5.examples;

public class Cat {

    private String name;
    private String color;
    private int age;

    protected String lastName;

    public Cat() {

    }

    public Cat(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public Cat(String color) {
        this("Bez imeni", color, 0);
    }

    public String getName() {
        return name;
    }

    public void setName(String name, int age) {
        if (age > 18) {
            this.name = name;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void meow(String name) {
        System.out.println(this.name + " said meow and other name is " + name);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }

    public void changeColor(String color) {
        this.setColor(color);


    }
}
