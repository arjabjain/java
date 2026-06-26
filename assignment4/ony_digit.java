// package assignment4;

public class ony_digit {
    public static void main(String[] args) {
        String str = "1234=j5";
        boolean isDigit = true; 
        for(int i = 0 ; i<str.length(); i++ ){
            if(!Character.isDigit(str.charAt(i))){
                isDigit = false; 
                break;
            }
        }
        // for(int i = 0; i<str.length(); i++){
        //     char ch = str.charAt(i);
        //     if(ch<0 || ch>9){
        //         isDigit = false;
        //         break;
        //     }
        // }

        System.out.println(isDigit);
    }
    
}
