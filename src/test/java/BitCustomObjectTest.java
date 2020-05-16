import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class BitCustomObjectTest {

    @Test
    public void getNumberOfAllObjectsTest() {
        assertTrue(new BitCustomObject("11111111").isObjectCorrect());
        assertTrue(new BitCustomObject("11101110").isObjectCorrect());
        assertTrue(new BitCustomObject("10001110").isObjectCorrect());
        assertTrue(new BitCustomObject("00001110").isObjectCorrect());
        assertTrue(new BitCustomObject("10111101").isObjectCorrect());

        assertFalse(new BitCustomObject("00000000").isObjectCorrect());
        assertFalse(new BitCustomObject("10000001").isObjectCorrect());
        assertFalse(new BitCustomObject("00001111").isObjectCorrect());
    }
}