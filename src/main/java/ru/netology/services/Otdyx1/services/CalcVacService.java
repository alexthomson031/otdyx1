package ru.netology.services.Otdyx1.services;

public class CalcVacService {
    public int calculate(int income, int expenses, int threshold) {
        int bankAccount = 0;

        for (int month = 1; month <= 12; month++)
            if (bankAccount >= threshold) {
                int dif = bankAccount - expenses;
                int threeLess = dif / 3;
                int more = dif - threeLess;
                System.out.println(
                        "Месяц " + month + "." +
                                "Денег " + bankAccount + "." +
                                " Буду отдыхать." +
                                " Потратил -" + expenses + "," +
                                " затем ещё -" + more);
                bankAccount -= expenses;
                bankAccount /= 3;
            } else {
                System.out.println(
                        "Месяц " + month +
                                " Денег " + bankAccount +
                                " Придётся работать. " +
                                "Заработал +" + income +
                                " Потратил -" + expenses);
                bankAccount += income;
                bankAccount -= expenses;
            }
        return bankAccount;
    }
}