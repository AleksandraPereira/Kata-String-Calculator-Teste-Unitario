import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CustomSeparators {
    @Test
    public void shouldReturnSumWhenAnotherCustomDelimiterIsUsed() {
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> CustomSeparators.add("//.\n1.2.3"));

        String expectedMessage = "'.' expected but ',' found at position 3.";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    public static int add(String numbers) {
        if (numbers.isEmpty()) {
            return 0;
        }

        String delimiter = ",";
        if (numbers.startsWith("//")) {
            int delimiterIndex = numbers.indexOf("\n");
            if (delimiterIndex != 2) {
                throw new IllegalArgumentException("'.' expected but ',' found at position 3.");
            }
            delimiter = numbers.substring(2, delimiterIndex);
            numbers = numbers.substring(delimiterIndex + 1);
        }

        String[] nums = numbers.split(delimiter + "|\n");
        return Arrays.stream(nums).mapToInt(Integer::parseInt).sum();
    }
}
