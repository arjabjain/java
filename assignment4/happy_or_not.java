// package assignment4;

public class happy_or_not {
    public static void main(String[] args) {
        String str = "arjaaagagb";
        boolean happy = true;


        for(int i = 0 ; i<str.length()-1; i++){
            if(str.charAt(i) ==str.charAt(i+1)){
                happy = false;
                break;
            }
         
            }
            if(happy){
                System.out.println("string is happy");

            }
               else{
                System.out.println(" not happy");
            }
        }
    }
    

