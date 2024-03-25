import org.junit.jupiter.api.Test;
import school.lesson_12_junit.Factorial;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class FactorialTestNeg {
    Factorial factorial = new Factorial();

    @Test
    public void testFactorial() {
        int result = factorial.count(5);
        assertFalse(result == 250);
    }
}
