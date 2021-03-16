package ru.domenChecker.test;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

public class App {
    public static void main(String[] args)  throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int year;
        year = parseInt(reader.readLine());
        cheker(year);
    }
    public static void cheker(int y){
        if (y <= 0) {
            System.out.println("Год не может быть меньше 0");
            return;
        }
        if (y % 4 != 0 ||(y % 100 == 0 && y % 400 != 0)){
            System.out.println(y + " год не високосный");
            return;
        }
        else {
            System.out.println(y + " год високосный");
            return;
        }
    }
}
