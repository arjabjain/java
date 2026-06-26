import java.io.*;

public class ReadPlainTextFile {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("arjab.txt");

            int ch;
            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch);
            }

            fr.close();

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
