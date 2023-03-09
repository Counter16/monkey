package Foodddddd;

public class YuckyFood extends Food {
    private int yuckiRating;
    private int howManyCanYouEatBeforeYouPassOut;
    private boolean fortniteCompatible;
    public YuckyFood(int yuckiRating, boolean fortniteCompatible){
        this.yuckiRating = yuckiRating;
        this.fortniteCompatible = fortniteCompatible;
    }
    public boolean ewwwYuck(){
        if(yuckiRating > 5){
            return true;
        }
        return false;
    }
    public int secretFortniteFormula(){
        if(fortniteCompatible && howManyCanYouEatBeforeYouPassOut % 2 == 0){
            return (int) (Math.random() * 1000000);
        } 
        return (int) (Math.random() * -1000000);
    }
    public int getYuckiRating() {
        return yuckiRating;
    }
    public void setYuckiRating(int yuckiRating) {
        this.yuckiRating = yuckiRating;
    }
    public int getHowManyCanYouEatBeforeYouPassOut() {
        return howManyCanYouEatBeforeYouPassOut;
    }
    public void setHowManyCanYouEatBeforeYouPassOut(int howManyCanYouEatBeforeYouPassOut) {
        this.howManyCanYouEatBeforeYouPassOut = howManyCanYouEatBeforeYouPassOut;
    }
    public boolean isFortniteCompatible() {
        return fortniteCompatible;
    }
    public void setFortniteCompatible(boolean fortniteCompatible) {
        this.fortniteCompatible = fortniteCompatible;
    }
}
