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
    public void whenCalculateIsCalledItReturnsAnInt() {
        assertEquals(1, babysitterCalculator.calculate());
    }

}