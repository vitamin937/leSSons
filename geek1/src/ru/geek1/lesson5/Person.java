package ru.geek1.lesson5;

//        1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
//        2. Конструктор класса должен заполнять эти поля при создании объекта.
//        3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в
//        консоль.
//        4. Создать массив из 5 сотрудников.
//                Пример:
//        Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
//        persArray[0] = new Person("Ivanov Ivan", "Engineer", "​ ivivan@mailbox.com​ ", "892312312",
//                30000, 30); // потом для каждой ячейки массива задаем объект
//        persArray[1] = new Person(...);
//...
//        persArray[4] = new Person(...);
//        5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.
public class Person {
    private String FIO;
    private String function;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Person(String FIO, String function, String email, String phone, int salary, int age) {
        this.FIO = FIO;
        this.function = function;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void info() {
        System.out.printf("Фамилия Имя Отчетво: " + FIO + "\n"
                + "Должность: " + function + "\n"
                + "Почта: " + email + "\n"
                + "Телефон: " + phone + "\n"
                + "ЗП: " + salary + "\n"
                + "Возраст: " + age + "\n" + "\n");
    }

    public String getFIO() {
        return FIO;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {

    }
}
