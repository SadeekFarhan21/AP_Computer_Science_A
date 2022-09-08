class Main2
{
	public static void main(String[] args) 
	{
		Car2 c1 = new Car2();
        System.out.println(c1.make);
        System.out.println(c1.model);
        System.out.println(c1.numberOfDoors);
        System.out.println(c1.topSpeed);
        System.out.println(c1.price);
        
        Car2 c2 = new Car2("Toyota", "Corolla", 90, 16000);
        System.out.println(c2.make);
        System.out.println(c2.model);
        System.out.println(c2.numberOfDoors);
        System.out.println(c2.topSpeed);
        System.out.println(c2.price);

        Car2 c3 = new Car2(4, 200, 10000);
        System.out.println(c3.make);
        System.out.println(c3.model);
        System.out.println(c3.numberOfDoors);
        System.out.println(c3.topSpeed);
        System.out.println(c3.price);

        Car2 c4 = new Car2("Ford", "Fiesta", 2);
        System.out.println(c4.make);
        System.out.println(c4.model);
        System.out.println(c4.numberOfDoors);
        System.out.println(c4.topSpeed);
        System.out.println(c4.price);

        
    }
}