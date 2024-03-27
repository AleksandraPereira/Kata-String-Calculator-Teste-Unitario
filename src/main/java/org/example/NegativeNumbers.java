package org.example;

public class NegativeNumbers {
    public static int add(String numbers) {
        String[] nums = numbers.split(",");
        StringBuilder negatives = new StringBuilder();
        for (String num : nums) {
            if (Integer.parseInt(num) < 0) {
                negatives.append(num).append(", ");
            }
        }
        if (negatives.length() > 0) {
            negatives.delete(negatives.length() - 2, negatives.length());
            throw new IllegalArgumentException("Negative not allowed : " + negatives.toString());
        }

        return 0;
    }
}
