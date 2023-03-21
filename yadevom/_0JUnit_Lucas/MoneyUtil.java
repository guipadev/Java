package com.yadevom._0JUnit_Lucas;

import java.math.BigDecimal;

public class MoneyUtil {

    public static String format(double money) {
        BigDecimal rounded = BigDecimal.valueOf(money).setScale(2, BigDecimal.ROUND_HALF_UP);
         return "$" + rounded;
    }

    public static String formatNegative(double money) {
        String symbol = "$";
        if (money < 0) {
            symbol = "-$";
           money = money * (-1);
        }
        BigDecimal rounded = BigDecimal.valueOf(money).setScale(2, BigDecimal.ROUND_HALF_UP);
        return symbol + rounded;
    }

    public static String format(double money, String symbol) {
        if (symbol == null) {
            throw new IllegalArgumentException();
        }

       if (money < 0) {
            symbol = "-" + symbol;
            money = money * (-1);
        }
        BigDecimal rounded = BigDecimal.valueOf(money).setScale(2, BigDecimal.ROUND_HALF_UP);
        return symbol + rounded;
    }
}
