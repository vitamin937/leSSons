package ru.domenChecker.test;

// Java-программа для проверки связи с использованием подпроцесса
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class PingWebsite {
    // метод нахождения пинговой статики сайта
    static void commands(ArrayList<String> commandList) throws Exception
    {
        // создаем подпроцесс, выполняем системную команду
        ProcessBuilder build = new ProcessBuilder(commandList);
        Process process = build.start();
        // читать вывод
        BufferedReader input = new BufferedReader(new InputStreamReader
                (process.getInputStream()));
        BufferedReader Error = new BufferedReader(new InputStreamReader
                (process.getErrorStream()));
        String s = null;
        System.out.println("Standard output: ");
        while((s = input.readLine()) != null){
            System.out.println(s);}
        System.out.println("error (if any): ");
        while((s = Error.readLine()) != null)
        {
            System.out.println(s);
        }
    }
    // Метод драйвера
    public static void main(String args[]) throws Exception
    {
        // создаем список для команд
        ArrayList<String> commandList = new ArrayList<String>();
        commandList.add("ping");
        // можно заменить на IP
        commandList.add("www.google.com");
        PingWebsite.commands(commandList);
    }
}
