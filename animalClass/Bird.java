package animalClass;

public class Bird extends Animal {
    private String fileName = "Bird";
    void fly() {
        System.out.println(fileName + " :: I am flying");
    }
    void sing() {
        System.out.println(fileName + " :: I am singing");
    }

    public Bird() {
        fly();
        sing();
    }
}