import org.junit.jupiter.api.Test;
import ru.netology.sqr.SQRService;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SQRServiceTest {

    @Test
    void noSQRSmallInterval() {
        SQRService service = new SQRService();

        int min = 200;
        int max = 201;
        int actual = 0;
        int expected = service.sqrSearch(min, max);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @Test
    void intervalToSQR() {
        SQRService service = new SQRService();

        int min = 10;
        int max = 99;
        int actual = 0;
        int expected = service.sqrSearch(min, max);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @Test
    void intervalAfterSQR() {
        SQRService service = new SQRService();

        int min = 9803;
        int max = 10000;
        int actual = 0;
        int expected = service.sqrSearch(min, max);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @Test
    void threeSQR() {
        SQRService service = new SQRService();

        int min = 200;
        int max = 300;
        int actual = 3;
        int expected = service.sqrSearch(min, max);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @Test
    void oneSQR() {
        SQRService service = new SQRService();

        int min = 121;
        int max = 143;
        int actual = 1;
        int expected = service.sqrSearch(min, max);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @Test
    void twoSQR() {
        SQRService service = new SQRService();

        int min = 144;
        int max = 169;
        int actual = 2;
        int expected = service.sqrSearch(min, max);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @Test
    void minMoreMax() {
        SQRService service = new SQRService();

        int min = 300;
        int max = 200;
        int actual = 0;
        int expected = service.sqrSearch(min, max);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @Test
    void maximumNumberSQR() {
        SQRService service = new SQRService();

        int min = 100;
        int max = 9801;
        int actual = 90;
        int expected = service.sqrSearch(min, max);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }
}

