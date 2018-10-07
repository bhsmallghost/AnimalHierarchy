package animalClass;

public class Fish extends Bird {
    private String fileName = "Fish";
    public Fish() {
        //the above are fix capabilities for Fish
        fly(false);
        sing(false);
        swim(true);
    }
}