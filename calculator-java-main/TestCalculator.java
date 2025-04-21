import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

public class TestCalculator {

    @Test
    public void testCalculateMixedOperations() {
        String expression = "10+5*2-4/2";
        String expected = "18.0"; // 5*2 = 10, 4/2 = 2 → 10+10-2 = 18

        String result = Calculator.Run(expression);

        assertEquals(expected, result);
    }

    @Test
    public void testCalculateSimpleAddition() {
        String expression = "3+7";
        String expected = "10.0";

        String result = Calculator.Run(expression);

        assertEquals(expected, result);
    }

    @Test
    public void testCalculateNegativeNumbers() {
        String expression = "-5+3";
        String expected = "-2.0";

        String result = Calculator.Run(expression);

        assertEquals(expected, result);
    }
}