package animalObject;
import animalClass.*;
import animalSound.Sound;

public class Cat extends Animal implements Sound {
    private String fileName = "Cat";

    public void say(String animalType) {
        System.out.println(fileName + " say Meow");
    }
    
    public Cat() {
        Parrot.stayWith = fileName;
        say(fileName);
        walk();
    }
}