package practice;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class PracticeTest {
    @Test
    public void testGreet() {
        Practice practice = new Practice();
        assertEquals("Hello, Java", practice.greet("Java"));
    }

    @Test
    public void testAdd() {
        Practice practice = new Practice();
        assertEquals(5, practice.add(2, 3));
    }
}