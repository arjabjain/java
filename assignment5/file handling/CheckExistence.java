import java.io.*;

public class CheckExistence {
    public static void main(String[] args) {
        File file = new File("text.txt");

        if (file.exists()) {
            System.out.println("File/Directory exists");
        } else {
            System.out.println("Does not exist");
        }
    }
}
