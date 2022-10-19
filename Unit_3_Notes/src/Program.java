public class Program {
    public static void main(String[] args){
        Kid one = new Kid("Farhan", 56);
        Kid two = one;
        Parent oneParent = one.getParent();
        Parent twoParent = two.getParent();
        if(oneParent.equals(twoParent)){
            System.out.println("Same Parent");
        }
        if(one == two){
            System.out.println("Same kid");
        }

        else {
            System.out.println("Unrelated");
        }
        
    }
}