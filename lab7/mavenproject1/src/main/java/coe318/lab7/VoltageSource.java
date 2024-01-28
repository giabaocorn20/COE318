package coe318.lab7;

public class VoltageSource {
    //instance variables
    public double voltage;
    private int node1, node2;
    private static int voltNum = 1;
    public int id;

    public VoltageSource(int node1, int node2, double voltage) {

        if(node1 < 0) {
            throw new IllegalArgumentException("Node1 can't be negative");
        }
        if(node2 < 0) {
            throw new IllegalArgumentException("Node2 can't be negative");
        }
        
        //setting values of instance variables to the input values
        this.voltage = voltage;
        this.node1 = node1;
        this.node2 = node2;
        //giving an id for the voltage source
        this.id = voltNum;
        voltNum++;
    }
    public int [] getNodes() {
        int[] nodes = new int[] {node1,node2};
        return nodes;
    }
    
    //returns the voltage source info in string format
    @Override
    public String toString() {
        return "V" + id + ": " + node1 + ", " + node2 + ", DC " + voltage;
    }
}