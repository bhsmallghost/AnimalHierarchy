package animalObject;
import animalClass.*;
import animalSound.Sound;

public class Parrot extends Bird implements Sound {
    private String fileName = "Parrot";
    public static String stayWith  = "";
    public void say(String animalType) {
        switch (animalType){
            case "Dog":
                System.out.println(fileName + " say Woof, woof");
                break;
            case "Cat":
                System.out.println(fileName + " say Meow");
                break;
            case "Rooster":
                System.out.println(fileName + " say Cock-a-doodle-doo");
                break;
            case "Duck":
                System.out.println(fileName + " say Quack, quack");
                break;
            case "Phone":
                System.out.println(fileName + " say Ring, ring, ring");
                break;
            default:
                System.out.println(fileName + " say ....");
                break;
        }
    }
    
    public Parrot(){
        say(stayWith);
        walk();
        sing(true);
        fly(true);
    }
}