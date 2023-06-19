package ru.netology.service;

public class WorkService {
    public int calculate(int income, int expenses, int threshold) {

        int count = 0; // счётчик месяцев отдыха
        int money = 0; // количество денег на счету
        for (int month = 0; month < 12; month++) {
            if (money < threshold) { // можем ли отдыхать?
                count++; // увеличиваем счётчик месяцев отдыха
                money = income - expenses + money;
                System.out.println(money);
            } else {
                money = -expenses / 3;
            }
        }
        return count;

    }

}