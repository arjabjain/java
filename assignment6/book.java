
public class book {
    String title , author , isbn ;
    void display(){
        System.out.println("title of the book is"+ title);
        System.out.println("author of the book is "+ author);
        System.out.println("isbn of the book is "+ isbn); 

    
    }
public static void main(String[] args) {
    book b = new book();
    b .title = "musafir cafe"; 
    b.author = "divya prakash dubey"; 
    b.isbn = "123435";
    b.display();
}
}
