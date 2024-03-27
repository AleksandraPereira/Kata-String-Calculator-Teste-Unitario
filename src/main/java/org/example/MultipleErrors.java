package org.example;

public class MultipleErrors {
    public static int add(String numbers) {
        String[] nums = numbers.split(",");
        StringBuilder errors = new StringBuilder();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i].isEmpty()) {
                errors.append("Number expected but ',' found at position ").append(i+2).append(".\n");
            } else {
                int num = Integer.parseInt(nums[i]);
                if (num < 0) {
                    errors.append("Negative not allowed : ").append(nums[i]).append("\n");
                }
            }
        }
        if (errors.length() > 0) {
            throw new IllegalArgumentException(errors.toString().trim());
        }

        return 0;
    }
}

