
public class circle {
    double radius;

    double  area(){
        return 3.14 * radius *radius; 
        
    }
public static void main(String[] args) {
    circle c = new circle();
    c.radius = 67;

    System.out.println(c.area());
}
}
