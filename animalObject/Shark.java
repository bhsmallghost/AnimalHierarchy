package animalObject;
import animalClass.*;

public class Shark extends Fish {
    private String fileName = "Shark";

    public void look() {
        System.out.println(fileName + " are large and grey");
    }
    
    public void act() {
        System.out.println(fileName + " eat other fish");
    }
    
    public Shark() {
        look();
        act();
    }
}