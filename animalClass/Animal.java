package animalClass;

class Animal {
    private String fileName = "Animal";
    void walk(){
        System.out.println(fileName + " :: I am walking");
    }
    
    public Animal() {
        walk();
    }
}