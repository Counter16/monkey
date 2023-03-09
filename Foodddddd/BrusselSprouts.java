package Foodddddd;

public class BrusselSprouts extends YuckyFood {
    private double renegadeRaidPotential;
    public BrusselSprouts(int yuckiRating, boolean fortniteCompatible, double renegadeRaidPotential){
        super(yuckiRating, fortniteCompatible);
        this.renegadeRaidPotential = renegadeRaidPotential;
    }
    public void messageForBrusselSproutEnjoyers(){
        System.out.println("perc30fishfillet");
    }
    public void renegade(){
        if(renegadeRaidPotential > 0){
            System.out.println("Renegade Raid Compatible");
        }
    }
    public int secretFortniteFormula(){
        super.secretFortniteFormula();
        return 1000000;
    }
    public double getRenegadeRaidPotential() {
        return renegadeRaidPotential;
    }
    public void setRenegadeRaidPotential(double renegadeRaidPotential) {
        this.renegadeRaidPotential = renegadeRaidPotential;
    }
    
}
