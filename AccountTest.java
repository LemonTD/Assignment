import java.util.Scanner;

public class AccountTest{
    public static void main(String[] args){
        Account account1 = new Account("Jane Green", 50.00);
        Account account2 = new Account("John Blue", 100.53);
      
        System.out.println(account1.withdraw(80));
    } // end main
}