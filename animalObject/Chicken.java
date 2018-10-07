package animalObject;
import animalClass.*;

public class Chicken extends Bird {
    private String fileName = "Chicken";
    void say() {
        System.out.println(fileName + " :: Cluck, cluck");
    }

    public Chicken() {
        say();
        fly(false);
    }
}