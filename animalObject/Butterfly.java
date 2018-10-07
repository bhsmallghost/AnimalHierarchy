package animalObject;
import animalClass.*;

public class Butterfly extends Bird {
    private String fileName = "Butterfly";
    public void act() {
        System.out.println(fileName + " does not make a sound");
    }
    
    public Butterfly() {
        fly(true);
        act();
    }
}