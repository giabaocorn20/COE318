package coe318.lab7;

import java.util.Scanner;

public class UserMain {
    private static int node1, node2;
    private static double value; 
    private static final String regexInt = "[0-9]*", regexD = "^(-?)(0|([1-9][0-9]*))(\\.[0-9]+)?$";

    public static void main(String[] args) {
        Scanner userIn = new Scanner(System.in);
        String scanString = "";
        
        Circuit circuit = Circuit.getInstance();
        System.out.println("Input:");

        while (true) {
            scanString = userIn.nextLine();

            if (!scanString.equals("end") && !scanString.equals("spice")) {
                String[] userInpStrings = scanString.split(" ");

                if (userInpStrings.length != 4) {
                    throw new IllegalArgumentException("Please input a choice of voltage source or resistor followed by two nodes and a value (4 different values). Or input the command 'end' or 'spice'");
                }

                if (userInpStrings[1].matches(regexInt) && userInpStrings[2].matches(regexInt) && userInpStrings[3].matches(regexD)) {
                    node1 = Integer.parseInt(userInpStrings[1]);
                    node2 = Integer.parseInt(userInpStrings[2]);
                    value = Double.parseDouble(userInpStrings[3]);

                    // Use .equals() for string comparison
                    if (userInpStrings[0].toLowerCase().equals("r")) {
                        Resistor r = new Resistor(node1, node2, value);
                        circuit.addR(r);
                    } else if (userInpStrings[0].toLowerCase().equals("v")) {
                        VoltageSource v = new VoltageSource(node1, node2, value);
                        circuit.addV(v);
                    } else {
                        throw new IllegalArgumentException("Please input a choice for voltage or resistance denoting it as 'v' or 'r' respectively.");
                    }
                } else {
                    // Provide more specific error messages for incorrect input format
                    if (!userInpStrings[1].matches(regexInt) || !userInpStrings[2].matches(regexInt)) {
                        throw new IllegalArgumentException("Please input an integer for the nodes.");
                    } else if (!userInpStrings[3].matches(regexD)) {
                        throw new IllegalArgumentException("Please input a double for the value of the resistor/voltage source.");
                    }
                }
            } else if (scanString.equals("end")) {
                break;
            } else if (scanString.equals("spice")) {
                System.out.println(circuit.toString());
            }
        }
    }
}
