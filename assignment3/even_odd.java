public class even_odd {
    public static void main(String[] args) {
        int[] arr = {23,4,5,75,5,34,23,44,6,77,33,90};
        int even =0;
        int odd =0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]%2==0){
                even++;
            }
            else{
                odd++;
            }
           
        }
         System.out.println(even);
            System.out.println(odd);
    }
}
