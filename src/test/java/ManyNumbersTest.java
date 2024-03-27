import org.example.ManyNumbers;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ManyNumbersTest {
    @Test
    public void testAdd() {
        ManyNumbers calculator = new ManyNumbers();
        assertEquals("0", calculator.add(""));
        assertEquals("1", calculator.add("1"));
        assertEquals("3.3", calculator.add("1.1", "2.2"));
        assertEquals("6.6", calculator.add("1.1,2.2", "1.1,2.2"));
    }
}
