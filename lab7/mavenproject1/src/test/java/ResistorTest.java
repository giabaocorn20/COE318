import org.junit.jupiter.api.Test;

import coe318.lab7.Resistor;

import static org.junit.jupiter.api.Assertions.*;

public class ResistorTest {
    @Test
    public void testGetNodes() {
        Resistor r = new Resistor(1, 2, 10);
        int[] expected = {1, 2};
        int[] result = r.getNodes();
        assertArrayEquals(expected, result);

    }
    @Test
    public void testToString(){
        Resistor r = new Resistor(1, 2, 10);
        String expected = "R1: 1, 2, 10.0"; 
        String result = r.toString();
        assertEquals(expected, result);
    }
}
