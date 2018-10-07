package animalObject;
import animalClass.*;
import animalSound.Sound;

public class Dog extends Animal implements Sound {
    private String fileName = "Dog";

    public void say(String animalType) {
        System.out.println(fileName + " say Woof, woof");
    }
    
    public Dog() {
        Parrot.stayWith = fileName;
        say(fileName);
        walk();
    }
}