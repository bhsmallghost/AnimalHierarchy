package animalObject;
import animalClass.*;
import animalSound.Sound;

public class Duck extends Bird implements Sound{
    private String fileName = "Duck";
    
    public void say(String animalType) {
        System.out.println(fileName + " say Quack, quack");
    }
    
    public Duck() {
        say(fileName);
        walk();
        sing();
        swim(true);
    }
}