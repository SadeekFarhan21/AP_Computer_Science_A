public class Toy {
    private String name;
    private double price;
    public Toy(String n, double p){
        name = n;
        price = p;
    }

    public void raisePrice(double surcharge){
        price += surcharge;
    }

    
    
}