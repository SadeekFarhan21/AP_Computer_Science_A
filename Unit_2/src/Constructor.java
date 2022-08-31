public class Constructor {

    private String name;
    private int age;
    private double income;
    
    public Constructor(String nm, int ag, double inc){
        name = nm;
        age = ag;
        income = inc;
    }

    public static void main(String[] args){
        Constructor Farhan = new Constructor("Farhan Sadeek", 17, 970000);
        System.out.println(Farhan.name);
        System.out.println(Farhan.age);
        System.out.println(Farhan.income);
    }
}