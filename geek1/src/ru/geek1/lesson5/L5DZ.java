package ru.geek1.lesson5;

public class L5DZ {


    public static void main(String[] args) {


        Person[] persArray = new Person[5];
        persArray[0]  = new Person("ФИО",
                "должность",
                "почта",
                "телефон",
                23000,
                55);

        persArray[1] = new Person("ФИО",
                "должность",
                "почта",
                "телефон",
                23000,
                65);

        persArray[2] = new Person("ФИО",
                "должность",
                "почта",
                "телефон",
                23000,
                23);

        persArray[3] = new Person("ФИО",
                "должность",
                "почта",
                "телефон",
                23000,
                23);

        persArray[4] = new Person("ФИО",
                "должность",
                "почта",
                "телефон",
                23000,
                23);

        for (int i = 0; i < persArray.length; i++) {
            if( persArray[i].getAge() >= 40){
            persArray[i].info();}
        }
    }
}
