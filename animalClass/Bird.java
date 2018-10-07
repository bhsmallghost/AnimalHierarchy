package animalClass;

public class Bird extends Animal{
    private String fileName = "Bird";
    
    public void fly(boolean ability) {
        if(ability) {
            AnimalAbilityCount.canfly++;
            System.out.println(fileName + " :: I can fly");
        }
        else
            System.out.println(fileName + " :: I cannot fly");
    }
    public void sing(boolean ability) {
        if(ability) {
            AnimalAbilityCount.cansing++;
            System.out.println(fileName + " :: I can sing");
        }
        else
            System.out.println(fileName + " :: I cannot sing");
    }
    public void swim(boolean ability) {
        if(ability) {
            AnimalAbilityCount.canswim++;
            System.out.println(fileName + " :: I can swim");
        }
        else
            System.out.println(fileName + " :: I cannot swim");
    }

    public Bird() {
        //let the extends animal object to drive the actions and capabilities
    }
}