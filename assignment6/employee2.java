

public class employee2 {
    String name = "arjab ";
    double salary ; 
    String hiredate;

    void display(){
        System.out.println("name = "+ name + " salary = " + salary + "hiredate = "+ hiredate);

    }
    public static void main(String[] args) {
        employee2 e = new employee2();
        e.name = "arjab"; 
        e.salary = 90343.334;
        e.hiredate= "23-12-2025";
        e.display();
    }
    
}
