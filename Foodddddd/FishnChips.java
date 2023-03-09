package Foodddddd;

public class FishnChips extends Food {
    private boolean isBritish = true;
    public void name(){
        if(Math.random() < .5){
            System.out.println("British people");
        }
        else System.out.println("It's Tuesday innit");
    }
    public String britishChecker(){
        if (isBritish){
            return "ewwww";
        }
        return "nice";
    }
    public boolean isBritish() {
        return isBritish;
    }
    public void setBritish(boolean isBritish) {
        this.isBritish = isBritish;
    }
}
