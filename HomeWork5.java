package lesson5;

import java.security.PublicKey;

public class HomeWork5 {
    public static void main(String[] args) {

        // 1. Напишите с помощью switch функцию, которая принимает
        // на вход название валюты и возвращает ее международный код.
        // Для японской йены, английского фунта, доллара сша, евро и
        // монгольского тугрика. Коды валют посмотрите в интернет.
        // Например: "евро" -> "EUR".

        System.out.println("getCurrenciesName: " + getSeasonCurrency("доллара сша"));
        System.out.println("getNumberselection: " + getNumberselection('D'));

    } //main

    public static String getSeasonCurrency(String a) {
        return switch (a) {
            case "японской йены йены" -> "JPY";
            case "английского фунта" -> "GBP";
            case "доллара сша" -> "USA";
            case "евро" -> "EUR";
            case "монгольского тугрика" -> "MNT";
            default -> "такого валюта нет";
        };

        // 2. Напишите функцию, которая реализует выбор цифры при нажатии
        // на буквы на телефонном номеронаберателе. Функция должна
        // принимать на вход символ и возвращать целое число.
        // Буквам 'A','B','C' соответствует цифра 2,
        // буквам 'D','E','F' соответствует 3, GHI 4,
        // JKL 5 , MNO 6 , PQRS 7 , TUV 8 , WXYZ 9 -
        // как на картинке ниже. Пример: 'P' -> 7

    }


    public static int getNumberselection(char c) {
        return switch (c) {
            case 'A','B','C' -> 2;
            case 'D','E','F' -> 3;
            case 'G','H','I' -> 4;
            case 'J','K','L' -> 5;
            case 'M','N','O' -> 6;
            case 'T','U','V' -> 8;
            case 'W','X','Y','Z' -> 9;
            default -> 0;
        };
        
    }
}

