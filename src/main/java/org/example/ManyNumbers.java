package org.example;

import java.math.BigDecimal;

public class ManyNumbers {
    public String add(String... numbers) {
        BigDecimal sum = new BigDecimal(0);
        for (String number : numbers) {
            if (!number.isEmpty()) {
                String[] nums = number.split(",");
                for (String num : nums) {
                    sum = sum.add(new BigDecimal(num));
                }
            }
        }
        return sum.stripTrailingZeros().toPlainString();
    }
}

