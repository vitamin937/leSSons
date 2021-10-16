package ru.geek1.lesson6;

public class Lesson6_2 {
    public static void main(String[] args) {
        NewAnimal animal = new NewAnimal();
        NewCat cat = new NewCat();
        animal.voice();
        cat.voice();
    }
}

class NewAnimal {
    void voice() {
        System.out.println("Животное издало звук ");
    }
}

class NewCat extends NewAnimal {
    @Override
    void voice() {
        System.out.println("Кот Мяукнул");
    }
}