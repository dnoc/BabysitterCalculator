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
        assertEquals("$132.00", babysitterCalculator.calculate(5, 8, 4));
    }

    @Test
    public void whenStartTimeIsLessThanFiveCalculateReturnsAMessage() {
        assertEquals("Start time cannot be before 5.", babysitterCalculator.calculate(1, 8, 4));
    }

    @Test
    public void whenBedTimeIsOutOfBoundsCalculateReturnsAMessage() {
        assertEquals("Bed time must be between 6 and Midnight.", babysitterCalculator.calculate(6, 1, 4));
        assertEquals("Bed time must be between 6 and Midnight.", babysitterCalculator.calculate(6, 13, 4));
        assertEquals("Bed time must be between 5 and Midnight.", babysitterCalculator.calculate(5, 13, 4));
        assertEquals("Bed time must be between 5 and Midnight.", babysitterCalculator.calculate(5, 13, 3));
    }

    @Test
    public void whenEndTimeIsOutOfBoundsCalculateReturnsAMessage() {
        assertEquals("End time cannot be after 4.", babysitterCalculator.calculate(7, 10, 6));
        assertEquals("End time cannot be before Midnight.", babysitterCalculator.calculate(7, 10, -1));
    }
}