package org.example;

import java.math.BigDecimal;

public class NewLineSeparator {
    public String add(String... numbers) {
        BigDecimal sum = new BigDecimal(0);
        for (String number : numbers) {
            if (!number.isEmpty()) {
                if (number.contains(",\n") || number.contains("\n,")) {
                    return "Number expected but '\\n' found at position " + number.indexOf("\n") + ".";
                }
                String[] nums = number.split(",|\n");
                for (String num : nums) {
                    sum = sum.add(new BigDecimal(num));
                }
            }
        }
        return sum.stripTrailingZeros().toPlainString();
    }
}
