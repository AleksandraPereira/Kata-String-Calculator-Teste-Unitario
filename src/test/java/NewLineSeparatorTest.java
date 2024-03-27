import org.example.NewLineSeparator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NewLineSeparatorTest {
    @Test
    public void testAdd() {
        NewLineSeparator calculator = new NewLineSeparator();
        assertEquals("6", calculator.add("1\n2,3"));
        assertEquals("Number expected but '\\n' found at position 6.", calculator.add("175.2,\n35"));
    }
}
