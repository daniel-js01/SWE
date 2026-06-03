package practice;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class PracticeTest {
    @Test
    public void testAdd1() {
        Practice p = new Practice();
        assertEquals(5, p.add1(2, 3));
    }
  
    @Test
    public void testSubtract() {
        Practice p = new Practice();
        assertEquals(1, p.subtract(3, 2));
    }

    @Test
    public void testMultiply() {
        Practice p = new Practice();
        assertEquals(6, p.multiply(2, 3));
    }

    @Test
    public void testDivide() {
        Practice p = new Practice();
        assertEquals(3, p.divide(6, 2));
    }
  
    @Test
    public void testDivideByZero() {
        Practice p = new Practice();
        assertThrows(ArithmeticException.class, () -> p.divide(6, 0));
    }
}