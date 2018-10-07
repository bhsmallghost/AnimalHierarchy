package animalObject;
import animalClass.*;
import animalSound.Sound;

public class Rooster extends Bird implements Sound {
    private String fileName = "Rooster";

    public void say(String animalType) {
        System.out.println(fileName + " say Cock-a-doodle-doo");
    }
    
    public Rooster() {
        Parrot.stayWith = fileName;
        say(fileName);
        walk();
        sing(true);
        fly(false);
    }
}