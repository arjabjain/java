// package assignment1;
import java.util.Scanner;
public class reverse_string {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String :");
        String name = sc.nextLine();
        System.out.println("Given String :" + name);

        System.out.println("..........Reversed  string .......!");
        for(int i = name.length()-1 ; i>=0; i--){
            System.out.print(name.charAt(i));

        }


    }
}
