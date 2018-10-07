package animalClass;

class Animal {
    private String fileName = "Animal";
    public void walk(){
        System.out.println(fileName + " :: I can walk");
    }
    
    public Animal() {
        //let the extends animal object to drive the actions and capabilities
    }
}