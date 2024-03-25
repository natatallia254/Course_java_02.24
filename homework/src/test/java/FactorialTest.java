import org.junit.jupiter.api.Test;
import school.lesson_12_junit.Factorial;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FactorialTest {
    Factorial factorial = new Factorial();

    @Test
    public void testFactorial() {
        int result = factorial.count(5);
        //assertEquals(120, result);
        assertTrue(result == 120);
    }
}

