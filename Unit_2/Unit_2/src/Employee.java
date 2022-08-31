class Employee {
    String name;
    int age;
    double pay;

    public Employee(String nm, int ag, double py){
        name = nm;
        age = ag;
        pay = py;
    }

    public static void main(String[] args){
        Employee Farhan = new Employee("Farhan Sadeek", 12, 32.0);
        System.out.println(Farhan.name);
    }
}