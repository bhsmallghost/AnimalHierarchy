import animalClass.*;
import animalObject.*;

public class Solution {
    public static void main(String[] args) {
        //Bird bird = new Bird();
        
        /*AQ2-3
        System.out.println("Duck....");
        Duck duck = new Duck();
        System.out.println("");
        
        System.out.println("Chicken....");
        Chicken chicken = new Chicken();
        System.out.println("");
        
        System.out.println("Rooster....");
        Rooster rooster = new Rooster();
        System.out.println("");*/
        
        /*AQ4
        System.out.println("Dog....");
        Dog dog = new Dog();
        System.out.println("");
        
        System.out.println("Parrot....");
        Parrot parrot = new Parrot();
        System.out.println("");
        
        System.out.println("Cat....");
        Cat cat = new Cat();
        System.out.println("");
        
        System.out.println("Parrot....");
        Parrot parrot1 = new Parrot();
        System.out.println("");
        
        System.out.println("Rooster....");
        Rooster rooster = new Rooster();
        System.out.println("");
        
        System.out.println("Parrot....");
        Parrot parrot2 = new Parrot();
        System.out.println("");*/
        
        //BQ1
        //Fish fish = new Fish();
        
        
        /*BQ2
        System.out.println("Shark....");
        Shark shark = new Shark();
        System.out.println("");
        
        System.out.println("ClownFish....");
        ClownFish clownfish = new ClownFish();
        System.out.println("");*/
        
        //BQ3
        //Dolphins dolphins = new Dolphins();
        
        
        //DQ1
        //Butterfly butterfly = new Butterfly();
        
        /*DQ2
        System.out.println("Caterpillar....");
        Caterpillar caterpillar = new Caterpillar();
        System.out.println("");
        
        System.out.println("Metamorphosis....");
        caterpillar.metamorphosis();
        System.out.println("");
        
        System.out.println("Butterfly....");
        Butterfly butterfly = new Butterfly();
        System.out.println("");*/
        
        //EQ1
        AnimalAbilityCount AAC = new AnimalAbilityCount();
        Animal[] animals = new Animal[]{
            new Bird(),
            new Duck(),
            new Chicken(),
            new Rooster(),
            new Parrot(),
            new Fish(),
            new Shark(),
            new ClownFish(),
            new Dolphins(),
            new Dog(),
            new Butterfly(),
            new Cat()
        };
        
        System.out.println("");
        System.out.println("Result......");
        System.out.println("canfly  = "+AAC.canfly);
        System.out.println("canwalk = "+AAC.canwalk);
        System.out.println("cansing = "+AAC.cansing);
        System.out.println("canswim = "+AAC.canswim);
    }
}