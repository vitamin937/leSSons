package ru.geek1.lesson7;

public class Lesson7 {
    public static void main(String[] args) {
        //пример работы со сторками
        String str = "Предложение    один   Предложение   два       Теперь   предложение три";
        System.out.println(str);
        String s1 = str.replaceAll(" +", " ");
        System.out.println(s1);
        StringBuilder stringBuilder = new StringBuilder(s1);
        for (int i = 1; i < stringBuilder.length(); i++) {
            if (stringBuilder.charAt(i) >= 'А' && stringBuilder.charAt(i) <= 'Я') {
                stringBuilder.setCharAt(i - 1, '.');
            }
        }
        System.out.println(stringBuilder.toString());
        for (int i = 1; i < stringBuilder.length(); i++) {
            if (stringBuilder.charAt(i) == '.') {
                stringBuilder.insert(i + 1, ' ');
            }
        }
        System.out.println(stringBuilder.toString());
        stringBuilder.append('.');
        System.out.println(stringBuilder.toString());
    }
}
