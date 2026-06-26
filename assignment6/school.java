// package assignment6;
import java.util.ArrayList;
public class school {
    ArrayList<String> student = new ArrayList<>();
    ArrayList<String> teacher = new ArrayList<>();
    ArrayList<String>  classes = new ArrayList<>();
void display(){
    System.out.println("student " + student);
    System.out.println("teachers " + teacher);
    System.out.println("classes" + classes);
}
public static void main(String[] args) {
    school s = new school();
    s.student.add("arjab");
    s.teacher.add("mr.sharma");
    s.student.add("karan");
    s.display();
}



    
}
