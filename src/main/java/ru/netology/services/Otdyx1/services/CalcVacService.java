package ru.netology.services.Otdyx1.services;
public class CalcVacService {
    public int calculate(int income, int expenses, int threshold) {
        int bankAccount = 0;
        int vacation = (bankAccount - expenses);
        for (int month = 1; month <= 12; month++)
            if (bankAccount > threshold) {
                int more = vacation - (bankAccount/3);
                System.out.println(
                        "Месяц " + month + "." +
                                "Денег " + bankAccount + "." +
                                " Буду отдыхать." +
                                " Потратил -" + expenses + "," +
                                " затем ещё -" + more);
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