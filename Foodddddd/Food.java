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
    

}
