
public class rotation {
    public static void main(String[] args) {
        String str1 ="abcd";
        String str2 = "cdab";
        if(str1.length()== str2.length() && (str1 +str2).contains(str2)){
            System.out.println("rotation");

        }
        else{
            System.out.println("not rotation");
        }
    }
    
}
