package ru.netology.services.Otdyx1.services;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class calcVacServiceTest {

    @Test
    public void shouldCalcTrue() {
        сalcVacService service = new сalcVacService();

        int expected = 12000;
        int actual = service.calculate(2000, 1000, 0);

        Assertions.assertEquals(expected, actual);
    }
}