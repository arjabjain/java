import java.util.ArrayList;
class song{
    String title; 
    String artist;


    song(String title, String artist){
        this.title = title; 
        this.artist = artist; 

    }
    void display(){
        System.out.println(" title =" + title + " " + "artist = " + artist);
    }
}
class music{
    ArrayList<song> songs = new ArrayList<>();
    void addsong(song s){
        songs.add(s);
    }

    void displaysong(){
        for(song s : songs){
            s.display();
        }
    }
      public static void main(String[] args) {
        music lib = new music();

        lib.addsong(new song("Shape of You", "Ed Sheeran"));
        lib.addsong(new song("Kesariya", "Arijit Singh"));

        lib.displaysong();
    }
}

