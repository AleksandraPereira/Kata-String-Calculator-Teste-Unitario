import org.example.MultipleErrors;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class MultipleErrorsTest {
    @Test
    public void testAddWithNegativeAndMissingNumbers() {
        try {
            MultipleErrors.add("-1,,2");
        } catch (IllegalArgumentException e) {
            assertEquals("Negative not allowed : -1\nNumber expected but ',' found at position 3.", e.getMessage());
        }
    }

    @Test
    public void testAddWithMultipleErrors() {
        try {
            MultipleErrors.add("-1,,-2");
        } catch (IllegalArgumentException e) {
            assertEquals("Negative not allowed : -1\nNumber expected but ',' found at position 3.\nNegative not allowed : -2", e.getMessage());
        }
    }
}
