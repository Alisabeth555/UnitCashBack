package ru.netology.unit;

import org.testng.annotations.Test;
import org.testng.Assert;

public class CashBackServiceTest {
    CashBackService service = new CashBackService();

    @Test
    public void shouldReturn100WhenAmountIs900() {
        int amount = 900;
        int expected = 100;

        int actual = service.remain(amount);

        Assert.assertEquals(actual, expected);

}

@Test
    public void shoudReturn200WhenAmountIs1800() {
        int amount = 1800;
        int expected = 200;

        int actual = service.remain(amount);

        Assert.assertEquals(actual, expected);


}

@Test
public void shoudReturn900WhenAmountIs1100() {
        int amount = 1100;
        int expected = 900;

        int actual = service.remain(amount);

        Assert.assertEquals(actual, expected);
}

@Test
    public void shuodReturn0WhenAmount1000() {
        int amount = 1000;
        int expected = 0;

        int actual = service.remain(amount);

        Assert.assertEquals(actual, expected);
}
}