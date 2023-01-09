import java.util.ArrayList;
public class Main{
    public static void main(String args []){
        HorseBarn barn = new HorseBarn(); //make new horsebarn 
        ArrayList<Horse> example1 = RandomPermutation.next(barn.getSpaces()); //make new horse arraylist
        System.out.println(example1); //random list of horsies

        if (example1.size() % 2 != 0){
            example1.add(new Horse("nobody else unfortunately", 0));
        } 
        for (int i = 0; i < example1.size(); i += 2) {
            System.out.println(example1.get(i) + " and " + example1.get(i + 1)); //prints pairs, i added one horsie to .txt so someone would always be alone

    }
}
}