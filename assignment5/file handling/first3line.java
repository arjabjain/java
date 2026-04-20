// package file handling
import java.io.*;
public class first3line {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new FileReader("text.txt"));
            for(int i  = 0 ; i<3; i++){
                String line = br.readLine();
                if(line != null){
                    System.out.println(line);
                }
            }
            br.close();
        }
        catch(Exception e){
            System.out.println(e);

        }
    }
}
