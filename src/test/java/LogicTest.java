import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class LogicTest {

    @Test
    public void getNumberOfAllObjectsTest() {
        Logic logic = new Logic();
        List<BitCustomObject> allObjects = new ArrayList<>();

        assertEquals(0, logic.getNumberOfAllObjects(allObjects));
        assertEquals(0, logic.getNumberOfAllObjects(null));

        allObjects.add(new BitCustomObject("11111110"));

        assertEquals(1, logic.getNumberOfAllObjects(allObjects));
    }

    @Test
    public void createListOfCorrectObjectsTest() {
        Logic logic = new Logic();
        List<BitCustomObject> allObjects = new ArrayList<>();
        allObjects.add(new BitCustomObject("11101110"));
        allObjects.add(new BitCustomObject("00000000"));
        allObjects.add(new BitCustomObject("10000001"));
        allObjects.add(new BitCustomObject("10001110"));
        allObjects.add(new BitCustomObject("00001110"));
        allObjects.add(new BitCustomObject("10011111"));

        List<BitCustomObject> correctObjects = new ArrayList<>();
        correctObjects.add(new BitCustomObject("11101110"));
        correctObjects.add(new BitCustomObject("10001110"));
        correctObjects.add(new BitCustomObject("00001110"));
        correctObjects.add(new BitCustomObject("10011111"));

        assertEquals(correctObjects, logic.createListOfCorrectObjects(allObjects));
    }


    @Test
    public void getNumberOFFaultyObjectsTest() {
        Logic logic = new Logic();
        List<BitCustomObject> allObjects = new ArrayList<>();
        assertEquals(0, logic.getNumberOFFaultyObjects(allObjects));
        assertEquals(0, logic.getNumberOFFaultyObjects(null));

        allObjects.add(new BitCustomObject("11111110"));
        allObjects.add(new BitCustomObject("00000000"));
        allObjects.add(new BitCustomObject("10000001"));
        allObjects.add(new BitCustomObject("11000000"));
        assertEquals(3, logic.getNumberOFFaultyObjects(allObjects));

    }
}