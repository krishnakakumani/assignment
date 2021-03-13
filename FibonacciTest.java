import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class FibonacciTest {
    private FibonacciCalculator fibonacci;

    @Before
    public void setUp() {
        fibonacci = new FibonacciCalculator();
    }

    @Test
    public void calculate_0() {
        int testIndex = 0;
        int expectedResult = 1;

        assertEquals(expectedResult, fibonacci.calculate(testIndex));
    }
	
	
	@Test
    public void calculate_6() {
        int testIndex = 6;
        int expectedResult = 13;

        assertEquals(expectedResult, fibonacci.calculate(testIndex));
    }
}