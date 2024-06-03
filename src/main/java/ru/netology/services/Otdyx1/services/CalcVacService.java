package ru.netology.services.Otdyx1.services;

public class CalcVacService {
    public int calculate(int income, int expenses, int threshold) {
        int bankAccount = 0;
        int vacation = 0;
        for (int month = 1; month <= 12; month++)
            if (bankAccount >= threshold) {
                bankAccount = (bankAccount - expenses) / 3;
                vacation++;
            } else {
                bankAccount = (bankAccount + income) - expenses;
            }
        return vacation;
    }
}


