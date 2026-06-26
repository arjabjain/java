import java.util.ArrayList;
public class library {
ArrayList<String> books = new ArrayList<>();
 void addBook(String book){
    books.add(book);
 }
 void display(){
    System.out.println("books" + books);
 }
    public static void main(String[] args) {
        library p = new library();
        p.addBook("java");
        p.addBook("python");
        p.display();

    }
}
