import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MathUtilsTest {

    private MathUtils mathUtils;

    @Before
    public void setUp() {
        mathUtils = new MathUtils();
        System.out.println("Setting up MathUtils instance...");
    }

    @After
    public void tearDown() {
        System.out.println("Tearing down MathUtils instance...");
    }

    // -------------------------
    // Tests for add()
    // -------------------------
    @Test
    public void testAddPositiveNumbers() {
        assertEquals(8, mathUtils.add(5, 3));
    }

    @Test
    public void testAddNegativeNumbers() {
        assertEquals(-12, mathUtils.add(-5, -7));
    }

    @Test
    public void testAddWithZero() {
        assertEquals(5, mathUtils.add(5, 0));
    }

    // -------------------------
    // Tests for subtract()
    // -------------------------
    @Test
    public void testSubtractPositiveNumbers() {
        assertEquals(2, mathUtils.subtract(5, 3));
    }

    @Test
    public void testSubtractNegativeNumbers() {
        assertEquals(2, mathUtils.subtract(-5, -7));
    }

    @Test
    public void testSubtractWithZero() {
        assertEquals(5, mathUtils.subtract(5, 0));
    }

    // -------------------------
    // Tests for multiply()
    // -------------------------
    @Test
    public void testMultiplyPositiveNumbers() {
        assertEquals(15, mathUtils.multiply(5, 3));
    }

    @Test
    public void testMultiplyNegativeNumbers() {
        assertEquals(-15, mathUtils.multiply(-5, 3));
    }

    @Test
    public void testMultiplyByZero() {
        assertEquals(0, mathUtils.multiply(5, 0));
    }

    // -------------------------
    // Tests for divide()
    // -------------------------
    @Test
    public void testDivideValid() {
        assertEquals(2.5, mathUtils.divide(5, 2), 0.0001);
    }

    @Test
    public void testDivideNegative() {
        assertEquals(-2.5, mathUtils.divide(-5, 2), 0.0001);
    }

    @Test
    public void testDivideByZero() {
        assertEquals(-1.0, mathUtils.divide(10, 0), 0.0001);
    }
}
