// package assignment6;
import java.util.ArrayList;

public class student {
    String name , grade; 
    ArrayList <String> courses = new ArrayList<>();
    void display(){
        System.out.println("name = " + name + "grades = + " + grade +  "courses =" + courses);
    }
    public static void main(String[] args) {
        student s = new student();
        s.name = "arjab"; 
        s.grade = " c";
        s.courses.add("java");
        s.courses.add("python");
        s.display();
    }
}
