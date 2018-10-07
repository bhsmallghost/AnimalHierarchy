package animalClass;

public class Fish extends Bird {
    private String fileName = "Fish";
    
    public void fly() {
        System.out.println(fileName + " :: I cannot fly");
    }
    public void sing() {
        System.out.println(fileName + " :: I cannot sing");
    }
    public void swim() {
        System.out.println(fileName + " :: I can swim");
    }

    public Fish() {
        //the above are fix capabilities for Fish
        fly(false);
        sing(false);
        swim(true);
    }
}