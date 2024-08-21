import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.example.unittest.Math;

public class MainTest {

    Math mathRunner;

    @Before
    public void setUp() {
        mathRunner = new Math();
    }

    @Test
    public void testMathSuccess() {
        assertEquals(mathRunner.sum(1,1), 2);
    }

    @Test
    public void testMathFail() {
        assertEquals(mathRunner.sum(1,1), 3);
    }
}


