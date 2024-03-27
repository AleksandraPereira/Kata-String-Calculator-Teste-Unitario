package org.example;
import java.math.BigDecimal;


public class StringCalculator {
    public String add(String numbers) {
        if (numbers.isEmpty()) {
            return "0";
        } else {
            String[] nums = numbers.split(",");
            BigDecimal sum = new BigDecimal(0);
            for (String num : nums) {
                sum = sum.add(new BigDecimal(num));
            }
            return sum.stripTrailingZeros().toPlainString();
        }
    }
}


