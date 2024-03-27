
import org.example.NegativeNumbers;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class NegativeNumbersTest {
    @Test
    public void testAddWithNegativeNumbers() {
        try {
            NegativeNumbers.add("-1,2");
        } catch (IllegalArgumentException e) {
            assertEquals("Negative not allowed : -1", e.getMessage());
        }
    }

    @Test
    public void testAddWithMultipleNegativeNumbers() {
        try {
            NegativeNumbers.add("2,-4,-5");
        } catch (IllegalArgumentException e) {
            assertEquals("Negative not allowed : -4, -5", e.getMessage());
        }
    }
}

