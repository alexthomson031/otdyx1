package ru.netology.services.Otdyx1.services;

public class Main {
    public static void main(String[] args) {
        CalcVacService service = new CalcVacService();
        System.out.println(service.calculate(5000, 1000, 20000));
    }
}