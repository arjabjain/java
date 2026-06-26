import java.io.*;

public class linebyline  {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("arjab.txt"));

            String line;
            while((line = br.readLine())!=null){
                System.out.println(line);
            }

            br.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
