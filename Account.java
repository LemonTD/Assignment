// Fig. 3.8: Account.java
// Account class with a double instance variable balance and a constructor
// and deposit method that perform validation.
import java.util.Scanner;
public class Account {
 private String name;  // instance variable
 private double balance; // instance variable

    // Account constructor that receives two parameters
    public Account(String name, double balance) {  
   
        this.name = name; 
     if (balance > 0.0) 
        this.balance = balance; // assign it to instance variable balance
    }
    // method that deposits (adds) only a valid amount to the balance
    public void deposit(double depositAmount){
     if (depositAmount > 0.0) // if the depositAmount is valid
        balance = balance + depositAmount; // add it to the balance
    }

    // method returns the account balance
    public double getBalance(){
      return balance;
    }
    public double withdraw(double withdrawAmount) {  
        if(withdrawAmount >balance){
           System.out.println("withdrawal amount exceeded account balance");
       }
       if (withdrawAmount < balance){
          balance -= withdrawAmount;
          System.out.println("Balance: " + balance);
        }
        return balance;
    }


    // method that sets the name
     public void setName(String name){
        this.name = name;
    }

    // method that returns the name.
    public String getName(){
        return name; // give value of name back to caller
    } // end method getName.
           
}