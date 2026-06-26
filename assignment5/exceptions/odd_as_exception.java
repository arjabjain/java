
public class odd_as_exception {
public static void integer(int num) throws Exception{
    if (num % 2!= 0){
        throw new Exception("Number  is odd");
    }else{
        System.out.println("number is even ");
    }
}

    public static void main(String[] args) {
        try {
            integer(9);
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }


    
}
