import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import ru.netology.services.Otdyx1.services.СalcVacService;

public class СalcVacServiceTest {

    @Test
    public void shouldCalcTrue() {
        СalcVacService service = new СalcVacService();

        int expected = 0;
        int actual = service.calculate(1000, 2000);

        Assertions.assertEquals(expected, actual);

    }
}
