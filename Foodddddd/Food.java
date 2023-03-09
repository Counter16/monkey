package Foodddddd;

public class Food {
    private boolean fortniteCompatible;
    private String color;
    private int count;
    private boolean checkEdible(){
        if(Math.random() > 0.5){
            return true;
        }
        return false;
    }
    private int checkTaste(){
        return (int) (Math.random() * 10 ) + 1;
    }
    public boolean isFortniteCompatible() {
        return fortniteCompatible;
    }
    public void setFortniteCompatible(boolean fortniteCompatible) {
        this.fortniteCompatible = fortniteCompatible;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getCount() {
        return count;
    }
    public void setCount(int count) {
        this.count = count;
    }
    

}
