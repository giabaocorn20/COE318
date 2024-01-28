public class CircuitTry {
    public static void main(String s[])
   {
       Node nodes[] = new Node[10];
       for(int c = 0; c < nodes.length; c++)
           nodes[c] = new Node();
       Resistor r1 = new Resistor(10, nodes[0], nodes[4]);
       Resistor r2 = new Resistor(20, nodes[7], nodes[3]);
       
       System.out.println("\n Resistor");
       System.out.println(r1);
       System.out.println(r2);
       Circuit cir = Circuit.getInstance();    
       cir.add(r1);
       cir.add(r2);
       System.out.println("\n Circuit ");
       System.out.println(cir);
   }
}
