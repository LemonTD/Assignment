import java.util.Scanner;

public class Invoice {
    private String number;
    private String description;
    private int quantityPurchased;
    private double pricePerItem;

     // Invoice constructor that receives four parameters
    public Invoicer(String number, String description, int quantityPurchased, double pricePerItem){
        this.number = number; // assign number to instance variable number
        this.description = description; 
        this.quantityPurchased = quantityPurchased;
        this.pricePerItem = pricePerItem;
    }

    // method that set and get each instance variable
    public void setNumber(String number){
        this.number = number;
    }
    public String getNumber(){
        return number;
    }

    public void setDescription(String description){
        this.description = description;
    }
    public String getDescription(){
        return description;
    }

    public void setQuantityPurchased(int quantityPurchased){
        this.quantityPurchased = quantityPurchased;
    }
    public int getquantityPurchased(){
        return quantityPurchased;
    }

    public void setPricePerItem(double pricePerItem){
        this.pricePerItem = pricePerItem;
    }
    public double getPricePerItem(){
        return pricePerItem;
    }



    public double invoiceAmount(){
        Scanner input = new Scanner(System.in);
        if(quantityPurchased < 0){
            return 0;
        }
        if(pricePerItem < 0){
            return 0;
        }
        double amount = quantityPurchased * pricePerItem;
        return amount;
    }

}