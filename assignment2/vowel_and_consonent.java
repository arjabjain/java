
import java.util.Scanner;
public class vowel_and_consonent {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a alphabet:");
        char ch = sc.next().toLowerCase().charAt(0);

        if(!Character.isLetter(ch)){
            System.out.println("invalid input");
        }
        else if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
            System.out.println("it is an vowel!");
        }else{
            System.out.println("consonet");
        }

        }



    }

