package ru.geek1.lesson6;

import java.lang.reflect.Field;

class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public Animal() {
    }

    public void info() {
        System.out.println("Animal " + name);
    }
}

class Cat extends Animal {
    String color;

    public Cat(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public void catinfo() {
        System.out.println("Cat " + name + " " + color);
    }
}

class SuperCat extends Cat {
    private int c;

    public SuperCat(String name, String color, int c) {
        super(name, color);
        this.c = c;
    }
}
class A{
    private String field = "Hello";
}
class B{
    public static void main(String[] args) throws NoSuchFieldException,IllegalAccessException {
        A a = new A();
        Field f = A.class.getDeclaredField("field");
        f.setAccessible(true);
        String fieldValue = (String) f.get(a);
        System.out.println(fieldValue);
    }
}
public class Lesson6 {
    public static void main(String[] args) {
        Animal animal = new Animal("Name");
        Cat cat = new Cat("Bars", "Red");
        SuperCat sCat = new SuperCat("Name","Color",4);

        animal.info();
        cat.info();
        cat.catinfo();
    }
}
