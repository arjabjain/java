
import java.util.ArrayList;

public class movie {
    String title; 
    String director; 
    ArrayList<String> actors = new ArrayList<>();
    ArrayList<String> reviews = new ArrayList<>();

    movie(String title, String director){
        this.title = title; 
        this.director = director;
    }
    void addactor(String actor){
        actors.add(actor); 

    }
    void  addreview(String review){
        reviews.add(review);
    }
    void display() {
        System.out.println("Title: " + title);
        System.out.println("Director: " + director);
        System.out.println("Actors: " + actors);
        System.out.println("Reviews: " + reviews);
    }

    public static void main(String[] args) {
        movie m = new movie("inception", "christopher");
        m.addactor("arjab "); 
        m.addreview("great");
        m.display();
    }
}

