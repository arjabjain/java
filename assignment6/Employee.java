

public class Employee {
    String name = "arjab"; 
    String job = "djanngo developer"; 
    String salary ="122110";
    void display(){
        System.out.println("name =" + name + "job + "+ job + "salary " + salary);
    }


    public static void main(String[] args) {
        Employee e = new Employee(); 
        e.name = "arjab jain";
        e.job = "python"; 
        e.salary = "340000"; 
        e.display();
    }
}

