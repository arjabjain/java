// package assignment1;
import java.util.Scanner;
public class area_parametre {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter radius of circle :");
        int radius = sc.nextInt();
        System.out.println("Area of circle :"+ (3.14*radius*radius));
        System.out.println("Perimetre of circle :"+ (2*3.14*radius));
    }
}
