public class Elephant extends Animal {
    public void trumpet(){
        System.out.println("trumpet");
    }
    public Elephant(String food, boolean nocturnal, 
                double aveLifeSpan)
{
  super(food, nocturnal, aveLifeSpan);
}
public String toString()
{
  return "This is an object of the Elephant class.";
}
}
