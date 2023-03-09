package Foodddddd;

public class Monkeybrains extends YuckyFood{
    private int squishinessRating;
    public Monkeybrains(int yuckiRating, boolean fortniteCompatible, int squishinessRating){
        super(yuckiRating, fortniteCompatible);
        this.squishinessRating = squishinessRating;
    }
    public boolean isSquishy(){
        if(squishinessRating > 5){
            return true;
        }
        return false;
    }
    public boolean ewwwYuck(){
        super.ewwwYuck();
        return true;
    }
    public String squish(){
        return "squish squish squish";
    }
    public int getSquishinessRating() {
        return squishinessRating;
    }
    public void setSquishinessRating(int squishinessRating) {
        this.squishinessRating = squishinessRating;
    }
}
