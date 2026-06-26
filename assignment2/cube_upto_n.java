// package assignment2;
import java.util.Scanner;
public class cube_upto_n {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter a number upto you want to print cube from 1:");
        int n = sc.nextInt();
        for(int i = 1; i<=n; i++){
            System.out.println("cube of "+ i + " is :  " +(i*i*i));
        }


    }
    
}
