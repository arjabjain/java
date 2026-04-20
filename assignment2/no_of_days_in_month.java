
import java.util.Scanner;



public class no_of_days_in_month {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter month name:");
        String month = sc.next().toLowerCase();

        switch (month){
            case "january","march","may","july","august","october","december":
                System.out.println("31 days");
                break;
            case "april","june", "september","november":
                System.out.println("30 days");
                break;
            case "february":
                System.out.println("enter year:");
                int year = sc.nextInt();
                if (year%4== 0){
                     System.out.println("28 days");
                }else{
                    System.out.println("29 days");
                }
               
                break;
            default:
                System.out.println("Invalid month name or typo error!, check spelling or enter a valid month name. "); 
                break;
        }
    }

}
