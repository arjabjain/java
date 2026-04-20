
import java.util.Scanner;

public class input_example {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.println("Enter second nummber: ");
        int num2 = sc.nextInt();

        System.out.println("Num1 = " + num1);
        System.out.println("num2 = "+ num2);
        System.out.println("product of both number is :" + (num1*num2));
    }
}

