public class Main {
    public static void main(String[] args) {
        Mutable [] listTwo;
        listTwo = new Mutable[3];
        listTwo[1] = new Mutable(33);
        listTwo[2] = new Mutable(listTwo[1].getValue() - 3);

    }
    
}
