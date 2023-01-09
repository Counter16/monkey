public class Main {
    public static void main(String args []){
        String authorToFind = "L. Frank Baum";
        Library mlonkkey = new Library();
        for(Book mloookey : mlonkkey.getChildrensBooks()){
            if(authorToFind.equals(mlonkkey.getAuthor())){
                System.out.println(mlonkkey.getAuthor());
            }
    }
    }
}
