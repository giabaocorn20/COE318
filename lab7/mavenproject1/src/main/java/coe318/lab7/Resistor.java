package coe318.lab7;

public class Resistor {
    public double resistance;
    public int node1, node2;
    public int id;
    private static int resistorNum = 1;

    public Resistor(int node1, int node2, double resistance) {
        if (resistance < 0) {
            throw new IllegalArgumentException("Resistance can't be negative");
        }

        this.resistance = resistance;
        this.node1 = node1;
        this.node2 = node2;
        this.id = resistorNum;
        resistorNum++;
    }

    public int[] getNodes() {
        int[] nodes = {node1, node2};
        return nodes;
    }

    @Override
    public String toString() {
        return "R" + id + ": " + node1 + ", " + node2 + ", " + resistance;
    }
}
