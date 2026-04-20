public class max_length_substring {
    public static void main(String[] args) {
        String str = "abcdabcdaabbabcde";
        int max_length = 0; 
        for(int i = 0; i<str.length(); i++){
            String temp ="";

            for(int j = i; j<str.length(); j++){
                char ch = str.charAt(j);
                if(temp.contains(""+ ch)){
                    break;
                }
                temp = temp+ch;
                if(temp.length()> max_length){
                    max_length = temp.length();
                }

            }
        }
        System.out.println(max_length);
    }
}
