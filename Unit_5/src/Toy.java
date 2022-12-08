public class Toy {
    private String name;
    private double price;
    public Toy(String n, double p){
        name = n;
        price = p;
    }

    public double raisePrice(double surcharge)
    {
        return price + surcharge;
    }
}