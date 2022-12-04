public class AnimalTester {
    public static void main(String [] args){
        Animal cow = new Animal("cow", 12);
        Animal dog = new Animal("dog", 15);

        // increase their age by 1
        cow.setAge(cow.getAge() + 1);
        dog.setName(dog.getName() + " dog");
        System.out.println(cow);
        WSystem.out.println(dog);
    }
}