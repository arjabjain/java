// package assignment6;
class person {
    int age  = 98; 
    String name; 


    void display(){
        System.out.println("name =" + name + " agge = "+ age);
    }

    public static void main(String[] args) {
        person p  = new person();
        p.name = "arjab" ;
        p.age = 18;
        p.display();

        person q = new person();
        q.name = "arjab ";
        q.display();
    }
}

    

