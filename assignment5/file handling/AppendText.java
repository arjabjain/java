import java.io.*;

public class AppendText {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("test.txt", true);

            fw.write("\nThis is new appended line");

            fw.close();

            System.out.println("Text appended successfully");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
