

public class Account {
   
    private String name;
    private int accountNumber;
    private double balance;
    
    public Account(String name, int accountNumber, double balance) { 
       this.name = name; 
       this.accountNumber = accountNumber; 
       this.balance = balance;
    }
    
    public String getName() { 
       return this.name;
    }
    public double getBalance() { 
       return this.balance;
    }
    public int getNumber() { 
        return this.accountNumber;
    }
    
    public boolean withdraw(double amount) {
        if (balance > amount) {
          balance -=amount;  
        }
        else {
            return false; 
        }
        return true;
    }
    
    public boolean deposit(double amount) {
        if (amount > 0) {
          balance +=amount;  
        }
        else {
            return false; 
        }
        return true;
    }
    

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Account alice = new Account("Alice", 123, 100.00);
        Account bob = new Account("Bob", 789, 0);
        System.out.println(bob);
        System.out.println(alice);
        alice.withdraw(15);
        System.out.println(alice);
        alice.withdraw(200);
        System.out.println(alice);
        alice.withdraw(-1);
        System.out.println(alice);
        alice.deposit(150);
        alice.withdraw(200);
        System.out.println(alice);
        bob.deposit(300);
        System.out.println(bob);
        bob.withdraw(100);
        System.out.println(bob);
    
    }
    @Override
public String toString() {//DO NOT MODIFY
return "(" + getName() + ", " + getNumber() + ", " +
String.format("$%.2f", getBalance()) + ")";
}

}
