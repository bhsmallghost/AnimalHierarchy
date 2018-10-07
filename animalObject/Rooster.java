package animalObject;
import animalClass.*;
import animalSound.Sound;

public class Rooster extends Bird implements Sound {
    private String fileName = "Rooster";

    public void say(String animalType) {
        System.out.println(fileName + " :: Cock-a-doodle-doo");
    }
    
    public Rooster() {
        say(fileName);
        walk();
        sing();
        fly(false);
    }
}