package com.yadevom.a_JUnit_Lucas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoneyUtilTest {

    @Test
    public void moneyTest() {
        String money = MoneyUtil.format(1000);
        assertEquals("$1000.00", money);
    }

    @Test
    public void formatNegativeTest() {
        String money = MoneyUtil.format(-1000.0);
        assertEquals("-$1000.00", money);
    }

    @Test
    public void euroMoneyTest() {
        String money = MoneyUtil.format(-1000.0, "€");
        assertEquals("-€1000.00", money);
    }

    @Test(expected = IllegalArgumentException.class)
    public void notNullExceptionMoneyTest() {
        MoneyUtil.format(-1000.0, null);
    }
}