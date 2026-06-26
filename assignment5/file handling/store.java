import java.io.*;
public class store {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("text.txt"));

            int count = 0;
            while(br.readLine() != null) {
                count++;
            }
            br.close();
            String[] arr = new String[count];
                   br = new BufferedReader(new FileReader("text.txt"));
            int i = 0;
            String line;

            while ((line = br.readLine()) != null) {
                arr[i++] = line;
            }
            br.close();

            for (String s : arr) {
                System.out.println(s);
            }
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
}
