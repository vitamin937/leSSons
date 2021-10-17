package ru.geek1.lesson6;

//        1. Создать классы Собака и Кот с наследованием от класса Животное.
//        2. Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина
//        препятствия. Результатом выполнения действия будет печать в консоль. (Например,
//        dogBobik.run(150); -> 'Бобик пробежал 150 м.');
//        3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание:
//        кот не умеет плавать, собака 10 м.).
//        4. * Добавить подсчет созданных котов, собак и животных.
abstract class Animal {
    abstract void run(int dis);

    abstract void swim(int dis);
}

class Cat extends Animal {
    @Override
    void run(int dis) {
        if (dis < 200) {
            System.out.println("Кот пробежал: " + dis + " метров");
        } else {
            System.out.println("Кот пробежал 200 метров и умер");
        }

    }

    @Override
    void swim(int dis) {
        System.out.println("Кот не умеет плавать");
    }
}

class Dog extends Animal {
    @Override
    void run(int dis) {
        if (dis < 500) {
            System.out.println("Пёс пробежал: " + dis + " метров");
        } else {
            System.out.println("Пёс пробежал 500 метров и умер");
        }
    }

    @Override
    void swim(int dis) {
        if (dis < 10) {
            System.out.println("Пёс проплыл: " + dis + " метров");
        } else {
            System.out.println("Пёс проплыл 10 метров и умер");
        }
    }
}

public class L6DZ {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Dog dog1 = new Dog();

        cat1.run(199);
        cat1.swim(10);

        dog1.run(499);
        dog1.swim(9);
    }
}
