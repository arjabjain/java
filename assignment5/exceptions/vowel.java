public class vowel {

    static void checkvowel(String str) throws Exception{
        if(!str.matches(".*[aeiouAEIOU].*")){
            throw new Exception("no vowel founf");
        }else{
            System.out.println("String contans vowel");
        }
    }
    public static void main(String[] args) {
        try {
            checkvowel("sky");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
}
