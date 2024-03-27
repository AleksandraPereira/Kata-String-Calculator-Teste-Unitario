
import org.example.Multiplication;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MultiplicationTest {
    @Test
    public void testMultiplication() {
        assertEquals(10, Multiplication.multiply(2, 5));
        assertEquals(0, Multiplication.multiply(0, 5));
        assertEquals(-15, Multiplication.multiply(-3, 5));
        assertEquals(15, Multiplication.multiply(-3, -5));
    }
}
