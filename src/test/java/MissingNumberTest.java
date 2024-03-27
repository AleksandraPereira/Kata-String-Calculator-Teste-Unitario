import org.example.MissingNumber;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MissingNumberTest {
    @Test
    public void testAdd() {
        MissingNumber calculator = new MissingNumber();
        assertEquals("6", calculator.add("1\n2,3"));
        assertEquals("Number expected but EOF found.", calculator.add("1,3,"));
        assertEquals("Number expected but '\\n' found at position 6.", calculator.add("175.2,\n35"));
    }
}

