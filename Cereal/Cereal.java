package Cereal;

public class Cereal {
    private String type;
    private int calories;
    private int protein;
    private int fat;
    private int sodium;
    private double fiber;
    private double carbohydrates;
    private int sugar;
    private int potassium;
    private int vitamins;
    private int shelf;
    private double weight;
    private double cups;
    private double rating;

    public Cereal(String type, int calories, int protein, int fat, int sodium, double fiber, double carbohydrates, int sugar, int potassium, int vitamins, int shelf, double weight, double cups, double rating){
        this.type = type;
        this.calories = calories;
        this.protein = protein;
        this.fat = fat;
        this.sodium = sodium;
        this.fiber = fiber;
        this.carbohydrates = carbohydrates;
        this.sugar = sugar;
        this.potassium = potassium;
        this.vitamins = vitamins;
        this.shelf = shelf;
        this.weight = weight;
        this.cups = cups;
        this.rating = rating;
    }
    
    public String getType(){
        return type;
    }
    public int getCalories(){
        return calories;
    }
    public int getProtein(){
        return protein;
    }
    public int getFat(){
        return fat;
    }
    public int getSodium(){
        return sodium;
    }
    public double getFiber(){
        return fiber;
    }
    public double getCarbohydrates(){
        return carbohydrates;
    }
    public int getSugar(){
        return sugar;
    }
    public int getPotassium(){
        return potassium;
    }
    public int getVitamins(){
        return vitamins;
    }
    public int getShelf(){
        return shelf;
    }
    public double getWeight(){
        return weight;
    }
    public double getCups(){
        return cups;
    }
    public double getRating(){
        return rating;
    }

    public String toString(){ //to string method that java uses to compile
        return type + " (type), " + calories + " (calories), " + protein + " (protein), " + fat + " (fat), " + sodium + " (sodium), " + fiber + " (fiber), " + carbohydrates + " (carbohydrates), " + sugar + " (sugars), " + potassium + " (potassium), " + vitamins + " (vitamins), " + shelf + " (shelf), " + weight + " (weight), " + cups + " (cups), " + rating + " (rating)";  
       }  
}
