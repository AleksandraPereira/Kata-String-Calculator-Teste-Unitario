package org.example;

import java.util.Optional;

public class ErrorsManegament {
    public Optional<Integer> add(String a, String b) {
        try {
            int num1 = Integer.parseInt(a);
            int num2 = Integer.parseInt(b);
            return Optional.of(num1 + num2);
        } catch (NumberFormatException e) {
            return Optional.empty();
        }
    }
}
