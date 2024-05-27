package ru.netology.services.Otdyx1.services;

public class CalcVacService {

    public int calculate(int income, int expenses, int threshold) {
        int bankAccount = 0;
        while (bankAccount <= 0) {
            System.out.println("Месяц " + "1" + " Денег " + bankAccount + " Надо работать. ");
            bankAccount = bankAccount + income - expenses;
        }
        for (int month = 2; month <= 12; month++)
            if (bankAccount < threshold) {
                bankAccount = bankAccount + income - expenses;
                System.out.println("Месяц " + month + " Денег " + bankAccount + " Надо работать. " + "Заработал " + income + " Потратил " + expenses);
            } else {
                bankAccount = (bankAccount - expenses) / 3;
                System.out.println("Месяц " + month + " Буду отдыхать! ");
            }
        return bankAccount;
    }
}