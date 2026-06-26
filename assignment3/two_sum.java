public class two_sum {
    public static void main(String[] args) {
        int[] arr= {45,34,35,49};
        int y = 80;
        for(int i = 0; i<arr.length; i++){
            // System.out.println(arr[i]);
            for(int j=i+1; j<arr.length;j++){
                if(y==arr[i]+arr[j]){
                    System.out.println("Pair found: " + arr[i] + " + " + arr[j] + " = " + y);
                
                }
            }

        }
        
    }
}
