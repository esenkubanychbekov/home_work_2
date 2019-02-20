package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
     String git_test = "Готовим всё для проверки гита";
     System.out.println(git_test);
        String massage = "Желаеете ли вы создать коммит ?";
        System.out.println(massage);
        Scanner answer1 = new Scanner(System.in);
        String answer_1 = answer1.nextLine();
        if( answer_1 == "Да") {
            System.out.println("Создается первый коммит...");
        }
        else if (answer_1 == "Нет") {
            System.out.println("Создание первого коммита отменено...");
        }
        else {
            System.out.println("Неверная команда, повторите попытку");
        }





    }
}
