package coe318.lab7;

import java.util.ArrayList;

public class Circuit {
    
    //creating instance variables
    private static Circuit instance = null;
    ArrayList<Object> circuitList;
   
    //tests if there is an empty spot and if there is input a new circuit
    public static Circuit getInstance() {
        if (instance == null){ 
            instance = new Circuit();
        }
        return instance;
    }
    
    //creating array list for circuits
    private Circuit() {
        circuitList = new ArrayList<Object>();
    }

    //adds resistor to arraylist
    public void addR(Resistor r){
        circuitList.add(r);
    }
    
    //adds voltage source to arraylist
    public void addV(VoltageSource v) {
        circuitList.add(v);
    }
    
    //creates output of the entire arraylist in string format
    @Override
    public String toString() {
        String output ="";
      
        for(int i = 0; i < this.circuitList.size(); i++){
            output = output + this.circuitList.get(i).toString() + "\n";
        
        }
        
        return output;
    }
}