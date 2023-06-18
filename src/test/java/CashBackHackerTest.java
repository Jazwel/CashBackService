import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CashBackHackerTest {
    CashBackHackerService service = new CashBackHackerService();

    @Test

    public void overLimit() {
        int amount = 1001;
        int actual = service.remain(amount);
        int expected = 999;
        assertEquals(expected, actual);

    }

    @Test
    public void underLimit() {
        int amount = 999;
        int actual = service.remain(amount);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void Limit() {
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(expected, actual);
    }
}

