package Foodddddd;

public class DinoNuggies extends Food {
    private boolean crunchTest;
    public boolean squishy(){
        if(crunchTest = false){
            return true;
        }
        return false;
    }
    public void dinosaur(){
        if(Math.random()>0.5){
            System.out.println("stegosaurus");
        }
        else{
            System.out.println("diplodocus");
        }
    }
    public boolean isCrunchTest() {
        return crunchTest;
    }
    public void setCrunchTest(boolean crunchTest) {
        this.crunchTest = crunchTest;
    }
    
}
