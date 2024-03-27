package org.example;

import java.math.BigDecimal;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MissingNumber {
    public String add(String... numbers) {
        BigDecimal sum = new BigDecimal(0);
        Pattern pattern = Pattern.compile("(,\\n)|(\\n,)|(^,)|(,$)|(\\n$)");
        for (String number : numbers) {
            Matcher matcher = pattern.matcher(number);
            if (matcher.find()) {
                if (matcher.group().equals(",\n") || matcher.group().equals("\n,")) {
                    return "Number expected but '\\n' found at position " + (matcher.start() + 1) + ".";
                } else {
                    return "Number expected but EOF found.";
                }
            }
            String[] nums = number.split(",|\n");
            for (String num : nums) {
                sum = sum.add(new BigDecimal(num));
            }
        }
        return sum.stripTrailingZeros().toPlainString();
    }
}
