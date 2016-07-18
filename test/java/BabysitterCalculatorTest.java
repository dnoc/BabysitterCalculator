import main.java.BabysitterCalculator;
import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

public class BabysitterCalculatorTest {
    @Test
    public void whenCalculateIsCalledItReturnsAnInt() {
        BabysitterCalculator babysitterCalculator = new BabysitterCalculator();
        assertEquals(1, babysitterCalculator.calculate());
    }
}