package animalObject;
import animalClass.*;
import animalSound.Sound;

public class Chicken extends Bird implements Sound{
    private String fileName = "Chicken";

    public void say(String animalType) {
        System.out.println(fileName + " say Cluck, cluck");
    }
    
    public Chicken() {
        say(fileName);
        walk();
        sing(true);
        fly(false);
    }
}