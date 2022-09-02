public class Constructor {

    private String name;
    private int age;
    private double income;
    
    public Constructor(String Name, int Age, double Income){
        name = Name;
        age = Age;
        income = Income;
    }

    public static void main(String[] args){
        Constructor Farhan = new Constructor("Farhan Sadeek", 17, 970000);
        System.out.printf("Name of the employee is %s\n", Farhan.name);
        System.out.printf("Age of the Employee is %d\n", Farhan.age);
        System.out.printf("Income of the Employee is %.0f\n", Farhan.income);
    }
}