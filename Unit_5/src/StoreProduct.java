import javax.print.attribute.HashPrintJobAttributeSet;

// import java.util.*;
public class StoreProduct {
    // Variables
    private String label; // Label
    private int price;    // Price
    private String category; // Category
    private boolean hasExpiration; // HasExpiration
    private int stock; // Stock

    // Primary Constructor
    public StoreProduct(){
       
    }

    // Secondary Constructor
    // Category == "misc" && hasExpiration = false 
    public StoreProduct(int stock){
        this.stock = stock;
        // Default values for 
        category = "misc";
        hasExpiration = false;
        label = "Default label";
        price = 0;
    }

    // Secondary Constructor
    // Stock == 0
    // No category, expiration
    public StoreProduct(String label, int price){
        this.label = label;
        this.price = price;
        category = "Default category";
        hasExpiration = false;
        stock = 0;
    }

    public StoreProduct(String label, int price, String cateogry, int stock, boolean hasExpiration){
        this.label = label;
        this.price = price;
        this.category = cateogry;
        this.stock = stock;
        this.hasExpiration = hasExpiration;
    }


    public void expired(boolean hasExpiration){
        if(hasExpiration){
            stock = 0;
        }
    }

    public boolean sale(int quantity){
        return (stock >= quantity);
    }

    public double getDiscountedPrice(double discount){
        return (1 - discount / 100) * price; 
    }

}