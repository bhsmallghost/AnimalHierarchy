package animalObject;
import animalClass.*;

public class Butterfly extends Bird {
    private String fileName = "Butterfly";
    public static String stage    = "";
    public void act() {
        System.out.println(fileName + " does not make a sound");
    }
    //override Animal walk
    public void walk() {
        System.out.println(fileName + " can walk (crawl)");
    }
    
    public Butterfly() {
        if(stage.equals("Caterpillar")) {
            fly(false);
            walk();
        } else {
            fly(true);
            act();
        }
    }
}