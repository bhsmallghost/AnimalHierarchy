package animalObject;
import animalClass.*;

public class Duck extends Bird {
    private String fileName = "Duck";
    void say() {
        System.out.println(fileName + " :: Quack, quack");
    }

    public Duck() {
        say();
    }
}