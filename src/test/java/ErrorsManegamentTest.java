import org.example.ErrorsManegament;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ErrorsManegamentTest {
    @Test
    public void testAdd() {
        ErrorsManegament errosManegement = new ErrorsManegament();

        // Teste com números válidos
        assertTrue(errosManegement.add("1", "2").isPresent());
        assertEquals(3, errosManegement.add("1", "2").get());

        // Teste com números inválidos
        assertFalse(errosManegement.add("1", "a").isPresent());
    }
}
