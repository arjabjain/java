

public class rectangle {
    int width;
    int height;

    int area(){
        return width* height;

    }
    public static void main(String[] args) {
        rectangle r = new rectangle();
        r.height = 9;
        r.width = 9 ;
        System.out.println("height = " + r.height);
        System.out.println("width = " +r.width);
        System.out.println(r.area());
    }
    
}
