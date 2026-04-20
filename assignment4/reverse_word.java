

public class reverse_word {
    
    public static void main(String[] args) {
        String str = "my name is arjabjain i am a btech second year student ";
        String[] result = str.split(" ");
        for(int i = result.length-1; i>=0;i--){
            System.out.print(result[i]+ " ");
        }
    }
    
}
