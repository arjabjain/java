public class Trafficlight {
    String colour; 
    int Duration; 

    void display(){
        System.out.println("color = " + colour);
        System.out.println("duration = " + Duration + "second");
    }
    public static void main(String[] args) {
      Trafficlight c = new Trafficlight();

        c.colour = "pink";
        c.Duration =  2;
        c.display();
    }

}
