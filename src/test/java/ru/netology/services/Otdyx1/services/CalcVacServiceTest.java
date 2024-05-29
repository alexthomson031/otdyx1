package ru.netology.services.Otdyx1.services;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalcVacServiceTest {

    @Test
    public void shouldCalcTrue() {

        CalcVacService service = new CalcVacService();

        int expected = 3555;
        int actual = service.calculate(3000, 1000, 10000);

        Assertions.assertEquals(expected, actual);
    }
}