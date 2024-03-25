import org.testng.annotations.Test;
import school.lesson_12_testng.Factorial;

import static org.testng.Assert.assertFalse;

public class FactorialTestNeg {
    Factorial factorial = new Factorial();

    @Test
    public void testFactorial() {
        int result = factorial.count(5);
        assertFalse(result == 250);
    }
}
