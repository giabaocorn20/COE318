import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import coe318.lab7.Circuit;
import coe318.lab7.Resistor;
import coe318.lab7.VoltageSource;

import static org.junit.jupiter.api.Assertions.*;

public class CircuitTest {
    
    private Circuit circuit;
    
    @BeforeEach
    public void setUp() {
        circuit = Circuit.getInstance();
    }
    
    @Test
    public void testAddR() {
        Resistor resistor = new Resistor(1, 2, 10); // Create a resistor object
        circuit.addR(resistor); // Add the resistor to the circuit
        
        // Check if the resistor was added successfully
        assertTrue(circuit.toString().contains(resistor.toString()));
    }
    
    @Test
    public void testAddV() {
        VoltageSource voltageSource = new VoltageSource(1, 2, 10); // Create a voltage source object
        circuit.addV(voltageSource); // Add the voltage source to the circuit
        
        // Check if the voltage source was added successfully
        assertTrue(circuit.toString().contains(voltageSource.toString()));
    }
    
    @Test
    public void testToString() {
        Resistor resistor = new Resistor(1, 2, 10); // Create a resistor object
        circuit.addR(resistor); // Add the resistor to the circuit
        
        VoltageSource voltageSource = new VoltageSource(1, 2, 10); // Create a voltage source object
        circuit.addV(voltageSource); // Add the voltage source to the circuit
        
        // Check if the output of toString() contains the resistor and voltage source information
        assertTrue(circuit.toString().contains(resistor.toString()));
        assertTrue(circuit.toString().contains(voltageSource.toString()));
    }
}
