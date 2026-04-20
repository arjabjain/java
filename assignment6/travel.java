import java.util.ArrayList;

public class travel{
    ArrayList<String> flights = new ArrayList<>();
    ArrayList<String> hotels = new ArrayList<>();


    void addflight(String flight){
        flights.add(flight);

    }

    void addhotel(String hotel){
        hotels.add(hotel);

    }
    void searchflight(String keyword){
        System.out.println("flight found");
        for(String f : flights){
            if(f.toLowerCase().contains(keyword.toLowerCase())){
                System.out.println(f);
            }
        }
    }
     void searchhotel(String keyword){
        System.out.println("hotel found");
        for(String h : hotels){
            if(h.toLowerCase().contains(keyword.toLowerCase())){
                System.out.println(h);
            }
        }
    }
    public static void main(String[] args) {
        travel t = new travel();

        // Adding data
        t.addflight("Delhi to Mumbai");
        t.addflight("Delhi to Goa");
        t.addflight("Mumbai to Bangalore");

        t.addhotel("Taj Hotel Mumbai");
        t.addhotel("Oberoi Delhi");
        t.addhotel("Leela Palace Bangalore");


         t.searchflight("Delhi");
        t.searchhotel("Mumbai");

    }




}