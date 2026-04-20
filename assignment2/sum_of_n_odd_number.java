// package assignment2;
import java.util.Scanner;
public class sum_of_n_odd_number {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number :");
        int n = sc.nextInt();
        for(int i = 1; i<=n; i++){
            if(i%2!=0){
                sum+=i;
            }

        }
        System.out.println("sum of first "+  n + " odd numbers is : "+ sum);

    }
}
