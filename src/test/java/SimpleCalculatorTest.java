import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import academy.mischok.SimpleCalculator;
import org.junit.jupiter.api.Test;

public class SimpleCalculatorTest {
    final SimpleCalculator calculator = new SimpleCalculator();
    @Test
    public void testAdd() {
        int result = calculator.add(3, 5);
        assertEquals(8, result);
    }

    @Test
    public void testSubtract() {
        int result = calculator.subtract(5, 3);
        assertEquals(2, result);
    }

    @Test
    public void testMultiply() {
        int result = calculator.multiply(3, 5);
        assertEquals(15, result);
    }

    @Test
    public void testDivide() {
        int result = calculator.divide(15, 3);
        assertEquals(5, result);
    }

    @Test
    void exceptionTesting() {
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                calculator.divide(1, 0));
        assertEquals("Division by zero is not allowed", exception.getMessage());
    }
//hallo
    // Weitere Testfälle für subtract, multiply und divide hier einfügen
}

