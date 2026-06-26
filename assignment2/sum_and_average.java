// package assignment2;
import java.util.Scanner;
public class sum_and_average {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for(int i= 1; i<=5; i++){
            System.out.print("enter "+ i +" number :");
            int a = sc.nextInt();
            
            sum+=a;
        }
        System.out.println("sum is " + sum);
        System.out.println("average is "+ sum/5);

    }
    
}
