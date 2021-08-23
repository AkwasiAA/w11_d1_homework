import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator();
    }

    @Test
    public void addNumbers(){
        assertEquals(21, calculator.add(12, 9));
    }

    @Test
    public void subtractNumbers(){
        assertEquals(24, calculator.subtract(30, 6));
    }

    @Test
    public void multiplyNumbers(){
        assertEquals(96, calculator.multiply(16,6));
    }

    @Test
    public void divideNumbers(){
        assertEquals(12, calculator.divide(24,2), 0.01);
    }

}
