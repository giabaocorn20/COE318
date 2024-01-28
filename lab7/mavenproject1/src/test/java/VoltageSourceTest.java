import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import coe318.lab7.VoltageSource;

public class VoltageSourceTest {
     @Test
    public void testGetNodes() {
        VoltageSource v = new VoltageSource(1, 2, 10);
        int[] expected = {1, 2};
        int[] result = v.getNodes();
        assertArrayEquals(expected, result);

    }
    @Test
    public void testToString(){
        VoltageSource r = new VoltageSource(1, 2, 10);
        String expected = "V1: 1, 2, DC 10.0"; 
        String result = r.toString();
        assertEquals(expected, result);
    }
}
