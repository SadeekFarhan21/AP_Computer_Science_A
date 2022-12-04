public class Cow {
    private String type;
    private String sound;
    private int numOfMilkings;
    public Cow(String type, String sound){
        this.type = type;
        this.sound = sound;
        numOfMilkings = 0;
    }

    public String getSound(){
        return sound;
    }

    public String getType(){
        return type;
    }

    public void milkCow(){
        numOfMilkings += 1;
    }

    public int getNumMilking(){
        return numOfMilkings;
    }

}
