package animalClass;

public class Animal extends AnimalAbilityCount{
    private String fileName = "Animal";
    public void walk(){
        AnimalAbilityCount.canwalk++;
        System.out.println(fileName + " :: I can walk");
    }
    
    public Animal() {
        //let the extends animal object to drive the actions and capabilities
    }
}