package ru.netology.stats;


import org.junit.Assert;
import org.junit.Test;


public class CashBackHackerTest {
    CashBackHackerService service = new CashBackHackerService();

    @Test

    public void overLimit() {
        int amount = 1001;
        int actual = service.remain(amount);
        int expected = 999;
        Assert.assertEquals(expected,actual);


    }

    @Test
    public void underLimit() {
        int amount = 999;
        int actual = service.remain(amount);
        int expected = 1;
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void Limit() {
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
       Assert.assertEquals(expected,actual);



    }
}

