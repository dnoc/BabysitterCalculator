import main.java.BabysitterCalculator;
import org.junit.Before;
import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

public class BabysitterCalculatorTest {
    BabysitterCalculator babysitterCalculator;

    @Before
    public void setUp() {
        babysitterCalculator = new BabysitterCalculator();
    }

    @Test
    public void whenCalculateIsCalledItCalculatesPay() {
        assertEquals("$80.00", babysitterCalculator.calculate(5, 8));
    }

    @Test
    public void whenStartTimeIsLessThanFiveCalculateReturnsAMessage() {
        assertEquals("Start time cannot be before 5.", babysitterCalculator.calculate(1, 8));
    }

}