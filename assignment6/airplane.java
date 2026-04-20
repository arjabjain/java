
public class airplane {
    String flightnumber;
    String destination; 
    String departureTime;
    
    void display(){
        System.out.println("flifht number " + flightnumber);
        System.out.println("destination " + destination);
        System.out.println("departure time" + departureTime);
    }
    public static void main(String[] args) {
        airplane a = new airplane();
        a.flightnumber = " 1234h";
        a.destination = " delhi";
        a.departureTime ="10.a.m";
        a.display();
    }
    
}
