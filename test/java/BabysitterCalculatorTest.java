import org.junit.Test;
import static junit.framework.TestCase

public class BabysitterCalculatorTest {
    @Test
    public void whenCalculateIsCalledItReturnsAnInt() {
        BabysitterCalculator babysitterCalculator = new BabysitterCalculator();
        assertEquals(1, babysitterCalculator.calculate());
    }
}