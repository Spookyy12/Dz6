package ru.netology.service;

public class Main {
    public static void main(String[] args) {
        WorkService service = new WorkService();
        int count = service.calculate(100000, 60000, 150000);
        System.out.println(count + " месяца можно отдохнуть ");
    }
}
