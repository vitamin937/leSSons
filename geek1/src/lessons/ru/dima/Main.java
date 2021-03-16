package lessons.ru.dima;

import ru.geek1.lesson1.*;

public class Main {
    public byte b1 = -128; // -128   127
    public short s1 = 200; // -32k 32k
    public int i1 = 1, i2 = 10, i3 = 20;
    public long l1 = 1531L;
    public float f1 = 12.1f;
    public double d1 = 12.6;
    public boolean flag = false;
    public char c1 = 'A';
    public String str = "Hello world!";


    public static void main(String[] args) {
        MainApp mainApp = new MainApp();


//        int i = 10;
//
//        i += 20;
//
//        char c1 = 50;
//        c1++;
//
//        System.out.println(c1);
//        int i = 10;
//        char c1= 'a';
//
//        if (i == 12 || i / 2 == 5) {
//            System.out.println("Your number: " + i);
//        } else if (i == 11) {
//            System.out.println("Your number: " + i);
//        } else if (i == 11) {
//            System.out.println("Your number: " + i);
//        } else if (i == 11) {
//            System.out.println("Your number: " + i);
//        } else if (i == 11) {
//            System.out.println("Your number: " + i);
//        } else if (i == 11) {
//            System.out.println("Your number: " + i);
//        } else if (i == 11) {
//            System.out.println("Your number: " + i);
//        } else {
//            System.out.println("not 10");
//        }
//
//        int a = 20;
//        String b = "myNumber = ";
//        a *= a;
        // System.out.println("20 + 20");

//        String str = "java";
////        printStr(str);
//        String hello = printHelloWorld(str);
//
//        System.out.println(hello);
        shop(66, "Vasa");
    }

    //    static void printStr(String str) {
//        System.out.println("Hello " + str);
//    }
//
    static String printHelloWorld(String str) {
        System.out.println("asd");
        return "Hello " + str;

    }

    static void shop(int years, String name) {

        if(years < 18) {
            System.out.println("Вам не 18");
            return;
        } else if (years > 60) {
            System.out.println("доктор запрещает Вам курить");
            return;
        }

        System.out.println("Какие сигареты Вы хотите?");

    }

}