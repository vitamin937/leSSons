package ru.geek1.lesson5;

import java.util.Arrays;

public class MainCat {
    public static void main(String[] args) {
        Cat cat1 = new Cat("qwer", "qwer", 12);
        Cat cat2 = new Cat("qweq", "asdf");

        cat1.setName("Vaska");
        cat1.setColor("Black");
        cat1.setAge(5);

        cat2.setName("Barsik");
        cat2.setColor("Red");
        cat2.setAge(-10);

        cat1.info();
        cat2.info();
    }
}
