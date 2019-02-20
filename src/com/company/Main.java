package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
     String git_test = "Готовим всё для проверки гита";
     //запускаем команду git init
        String massage = "Желаеете ли вы создать коммит ?";
        Scanner answer1 = new Scanner(System.in);
        String answer_1 = answer1.nextLine();
        Scanner answer2 = new Scanner(System.in);
        String answer_2 = answer2.nextLine();
        if( answer_1 = "Yes")
        {
            System.out.println("Создается первый коммит...");
        }
        if (answer_2 == "No")
        {
            System.out.println("Создание первого коммита отменено...");
        }
        else
        System.out.println("Неверная команда, повторите попытку");





    }
}
