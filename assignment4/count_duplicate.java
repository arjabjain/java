

public class count_duplicate {
    
    public static void main(String[] args) {
        int count = 0;
        String str = "aararjan";
        for(int i = 0 ; i<str.length(); i++){
            for(int j = i+1; j<str.length(); j++)
            if(str.charAt(i)==str.charAt(j)){
                count++;
                break;
            }


        }
        System.out.println("total number of duplicate  " + count);
    }
}
