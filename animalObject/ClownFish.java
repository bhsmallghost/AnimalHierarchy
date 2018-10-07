package animalObject;
import animalClass.*;

public class ClownFish extends Fish {
    private String fileName = "ClownFish";

    public void look() {
        System.out.println(fileName + " are small and colourful (orange)");
    }
    
    public void act() {
        System.out.println(fileName + " make jokes");
    }
    
    public ClownFish() {
        look();
        act();
    }
}