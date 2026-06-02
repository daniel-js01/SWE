package practice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PracticeTest {
    @Test
    public void testAdd() {
        Practice p = new Practice();
        assertEquals(5, p.add(2, 3));
    }

    @Test
    public void testSubtract() {
        Practice p = new Practice();
        assertEquals(1, p.subtract(3, 2));
    }
}