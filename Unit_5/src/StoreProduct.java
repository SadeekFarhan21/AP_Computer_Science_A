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
    }

    // Secondary Constructor
    // Stock == 0
    // No category, expiration
    public StoreProduct(String label, int price){
        this.label = label;
        this.price = price;
    }

}