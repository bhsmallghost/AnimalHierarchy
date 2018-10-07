package animalObject;
import animalClass.*;

public class Caterpillar{
    private String fileName = "Caterpillar";

    public void metamorphosis() {
        Butterfly.stage = "Butterfly";
    }
    
    public Caterpillar() {
        Butterfly.stage = fileName;
        Butterfly butterfly = new Butterfly();
    }
}