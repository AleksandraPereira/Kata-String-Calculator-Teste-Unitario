package org.example;

import java.util.Arrays;

public class CustomSeparators {
    public static int add(String numbers) {
        if (numbers.isEmpty()) {
            return 0;
        }

        String delimiter = ",";
        if (numbers.startsWith("//")) {
            int delimiterIndex = numbers.indexOf("\n");
            delimiter = numbers.substring(2, delimiterIndex);
            numbers = numbers.substring(delimiterIndex + 1);
        }

        String[] nums = numbers.split(delimiter + "|\n");
        return Arrays.stream(nums).mapToInt(Integer::parseInt).sum();
    }
}
