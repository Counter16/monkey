import java.util.ArrayList;

public class Zookeeper {
    public static void main(String args []){
        Animal a = new Elephant("leaves, grasses, roots", false, 60.0);
        a.isNocturnal();
        //a.trumpet(); doesnt work bc animal cant see trumpet since its superclass of elephant 
        Deer deer = new Deer();
        Giraffe giraffe = new Giraffe();
        Gorilla gorilla = new Gorilla();
        Hippo hippo = new Hippo();
        Monkey monkey = new Monkey();
        Tiger tiger = new Tiger();
        tiger.swim();
        tiger.huntAlone();
        tiger.isNocturnal();
        //Elephant("leaves, grasses, roots", false, 60.0);
        ArrayList<Animal> zoo = new ArrayList<Animal>();
        zoo.add(deer);
        zoo.add(giraffe);
        zoo.add(gorilla);
        zoo.add(hippo);
        zoo.add(monkey);
        for(Animal animal : zoo){
            animal.isNocturnal();
        }
        Object o = new Object();
        System.out.println(o.toString());
        Elephant e = new Elephant("leaves, grasses, roots", false, 60.0);
        System.out.println(e.toString());
        Animal a4 = new Elephant("leaves, grasses, roots", false, 60.0);
        System.out.println(a4.toString());
        Object o2 = new Elephant("leaves, grasses, roots", false, 60.0);
        System.out.println(o2.toString());
    }
}
