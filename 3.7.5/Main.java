public class Main {
    public static void main(String args []){
        String authorToFind = "L. Frank Baum";
        Library mlonkkey = new Library();
        for(Book b : mlonkkey.getChildrensBooks()){
            if(authorToFind.equals(b.getAuthor())){
                System.out.println(b.getTitle());
            }
        }
        String bookToFind = "Sky Island";
        double minimumRating = 0.0;
        for(Book c : mlonkkey.getChildrensBooks()){
            if(c.getTitle().equals(bookToFind)){
                minimumRating = c.getRating();
            }
        }
        System.out.println(minimumRating);
    
    }
}
